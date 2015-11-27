// @SOURCE:C:/Users/SADB-4/Desktop/playprojects/chap1/conf/routes
// @HASH:fc5e9d2103288dd0c4c930e3ef3c686d912dc997
// @DATE:Fri Nov 27 10:19:53 CET 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:1
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:3
val controllers_Developers_list1 = Route("GET", PathPattern(List(StaticPart("/developers"))))
                    

// @LINE:4
val controllers_Developers_save2 = Route("POST", PathPattern(List(StaticPart("/developers"))))
                    

// @LINE:5
val controllers_Developers_newDeveloper3 = Route("GET", PathPattern(List(StaticPart("/developers/new"))))
                    

// @LINE:6
val controllers_Developers_remove4 = Route("GET", PathPattern(List(StaticPart("/remove/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:7
val controllers_Developers_editDeveloper5 = Route("GET", PathPattern(List(StaticPart("/edit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:8
val controllers_Developers_show6 = Route("GET", PathPattern(List(StaticPart("/developers/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:10
val controllers_Barcodes_barcode7 = Route("GET", PathPattern(List(StaticPart("/barcode/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:12
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/developers""","""controllers.Developers.list"""),("""POST""","""/developers""","""controllers.Developers.save"""),("""GET""","""/developers/new""","""controllers.Developers.newDeveloper"""),("""GET""","""/remove/$id<[^/]+>""","""controllers.Developers.remove(id:Long)"""),("""GET""","""/edit/$id<[^/]+>""","""controllers.Developers.editDeveloper(id:Long)"""),("""GET""","""/developers/$id<[^/]+>""","""controllers.Developers.show(id:Long)"""),("""GET""","""/barcode/$id<[^/]+>""","""controllers.Barcodes.barcode(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:1
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:3
case controllers_Developers_list1(params) => {
   call { 
        invokeHandler(_root_.controllers.Developers.list, HandlerDef(this, "controllers.Developers", "list", Nil))
   }
}
                    

// @LINE:4
case controllers_Developers_save2(params) => {
   call { 
        invokeHandler(_root_.controllers.Developers.save, HandlerDef(this, "controllers.Developers", "save", Nil))
   }
}
                    

// @LINE:5
case controllers_Developers_newDeveloper3(params) => {
   call { 
        invokeHandler(_root_.controllers.Developers.newDeveloper, HandlerDef(this, "controllers.Developers", "newDeveloper", Nil))
   }
}
                    

// @LINE:6
case controllers_Developers_remove4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Developers.remove(id), HandlerDef(this, "controllers.Developers", "remove", Seq(classOf[Long])))
   }
}
                    

// @LINE:7
case controllers_Developers_editDeveloper5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Developers.editDeveloper(id), HandlerDef(this, "controllers.Developers", "editDeveloper", Seq(classOf[Long])))
   }
}
                    

// @LINE:8
case controllers_Developers_show6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Developers.show(id), HandlerDef(this, "controllers.Developers", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:10
case controllers_Barcodes_barcode7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Barcodes.barcode(id), HandlerDef(this, "controllers.Barcodes", "barcode", Seq(classOf[Long])))
   }
}
                    

// @LINE:12
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                