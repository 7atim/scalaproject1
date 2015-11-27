
package views.html.developers

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object editDeveloper extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Developer],Flash,Lang,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(developerForm: Form[Developer])(implicit flash: Flash, lang: Lang):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq(format.raw/*1.69*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq(/*5.2*/main(Messages("developers.form"))/*5.35*/ {_display_(Seq(format.raw/*5.37*/("""
  <h2>"""),_display_(Seq(/*6.8*/Messages("developers.form"))),format.raw/*6.35*/("""</h2>

  """),_display_(Seq(/*8.4*/helper/*8.10*/.form(action = routes.Developers.save())/*8.50*/ {_display_(Seq(format.raw/*8.52*/("""
    <fieldset>
      <legend>
        """),_display_(Seq(/*11.10*/Messages("developers.details", Messages("developers.new")))),format.raw/*11.68*/("""
      </legend>
      """),_display_(Seq(/*13.8*/helper/*13.14*/.inputText(developerForm("id")))),format.raw/*13.45*/("""
      """),_display_(Seq(/*14.8*/helper/*14.14*/.inputText(developerForm("name")))),format.raw/*14.47*/("""
      """),_display_(Seq(/*15.8*/helper/*15.14*/.textarea(developerForm("description")))),format.raw/*15.53*/("""
    </fieldset>
    <p><input type="submit" class="btn primary"
        value='"""),_display_(Seq(/*18.17*/Messages("developers.new.submit"))),format.raw/*18.50*/("""'></p>
  """)))})),format.raw/*19.4*/("""
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(developerForm:Form[Developer],flash:Flash,lang:Lang) = apply(developerForm)(flash,lang)
    
    def f:((Form[Developer]) => (Flash,Lang) => play.api.templates.Html) = (developerForm) => (flash,lang) => apply(developerForm)(flash,lang)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 14:53:41 CET 2015
                    SOURCE: C:/Users/SADB-4/Desktop/playprojects/chap1/app/views/developers/editDeveloper.scala.html
                    HASH: 54ad498c5d92faa4d7333decbe5afaca3e4a8fc5
                    MATRIX: 544->1|733->68|760->120|791->122|832->155|866->157|903->165|951->192|990->202|1004->208|1052->248|1086->250|1157->290|1237->348|1291->372|1306->378|1359->409|1397->417|1412->423|1467->456|1505->464|1520->470|1581->509|1693->590|1748->623|1789->633|1822->635
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|28->6|28->6|30->8|30->8|30->8|30->8|33->11|33->11|35->13|35->13|35->13|36->14|36->14|36->14|37->15|37->15|37->15|40->18|40->18|41->19|42->20
                    -- GENERATED --
                */
            