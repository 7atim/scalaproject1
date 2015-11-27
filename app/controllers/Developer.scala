package controllers

import play.api.mvc.{Flash, Action, Controller}
import models.Developer
import play.api.data.Form
import play.api.data.Forms.{mapping, longNumber, nonEmptyText}
import play.api.i18n.Messages

object Developers extends Controller {

  private val developerForm: Form[Developer] = Form(
    mapping(
      "id" -> longNumber.verifying(
      "validation.id.duplicate", Developer.findById(_).isEmpty),
      "name" -> nonEmptyText,
      "description" -> nonEmptyText
    )(Developer.apply)(Developer.unapply)
  )

  val foo = developerForm.copy()

  def list = Action { implicit request =>

    val developers = Developer.findAll

    Ok(views.html.developers.list(developers))
  }

  def show(id: Long) = Action { implicit request =>

    Developer.findById(id).map { developer =>

      Ok(views.html.developers.details(developer))

    }.getOrElse(NotFound)
  }

  def newDeveloper = Action { implicit request =>
    val form = if (flash.get("error").isDefined)
      developerForm.bind(flash.data)
    else
      developerForm

    Ok(views.html.developers.editDeveloper(form))
  }

  def save = Action { implicit request =>
    val newDeveloperForm = developerForm.bindFromRequest()

    newDeveloperForm.fold(
      hasErrors = { form =>
        Redirect(routes.Developers.newDeveloper()).
          flashing(Flash(form.data) +
          ("error" -> Messages("validation.errors")))
      },
      success = { newDeveloper =>
        Developer.add(newDeveloper)
        val message = Messages("developers.new.success", newDeveloper.name)
        Redirect(routes.Developers.show(newDeveloper.id)).
          flashing("success" -> message)
      }
    )
  }

  def remove(id: Long) = Action { implicit request =>
    
       Developer.findById(id).map { developer =>
       Developer.remove(developer)
       val developers = Developer.findAll
       Ok(views.html.developers.list(developers))
       }.getOrElse(NotFound)
    
  }

  def editDeveloper(id: Long) = Action { implicit request =>

   val newDeveloperForm = developerForm.bindFromRequest()

    newDeveloperForm.fold(
      hasErrors = { form =>
        Redirect(routes.Developers.newDeveloper()).
          flashing(Flash(form.data) +
          ("error" -> Messages("validation.errors")))
      },
      success = { newDeveloper =>


        Developer.findById(id).map { developer =>
       Developer.remove(developer)
        }


        Developer.add(newDeveloper)


        Developer.add(newDeveloper)
        val message = Messages("developers.new.success", newDeveloper.name)
        Redirect(routes.Developers.show(newDeveloper.id)).
          flashing("success" -> message)
      }
    )
  }

}

object DevelopersEarlierVersion extends Controller {

  private val developerForm: Form[Developer] = Form(
    mapping(
      "id" -> longNumber.verifying(
      "validation.id.duplicate", Developer.findById(_).isEmpty),
      "name" -> nonEmptyText,
      "description" -> nonEmptyText
    )(Developer.apply)(Developer.unapply)
  )

  def save = Action { implicit request =>
    val newDeveloperForm = developerForm.bindFromRequest()

    newDeveloperForm.fold(
      hasErrors = { form =>
        Redirect(routes.Developers.newDeveloper())
      },
      success = { newDeveloper =>
        Developer.add(newDeveloper)
        Redirect(routes.Developers.show(newDeveloper.id))
      }
    )
  }
}
