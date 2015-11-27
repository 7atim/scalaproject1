
package views.html

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
object debug extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Lang,play.api.templates.Html] {

    /**/
    def apply/*1.2*/()(implicit lang: Lang):play.api.templates.Html = {
        _display_ {import play.api.Play.current


Seq(format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""<footer>
  lang = """),_display_(Seq(/*4.11*/lang/*4.15*/.code)),format.raw/*4.20*/(""",
  user = """),_display_(Seq(/*5.11*/current/*5.18*/.configuration.getString("environment.user"))),format.raw/*5.62*/(""",
  date = """),_display_(Seq(/*6.11*/(new java.util.Date().format("yyyy-MM-dd HH:mm")))),format.raw/*6.60*/("""
</footer>
"""))}
    }
    
    def render(lang:Lang) = apply()(lang)
    
    def f:(() => (Lang) => play.api.templates.Html) = () => (lang) => apply()(lang)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 14:09:56 CET 2015
                    SOURCE: C:/Users/SADB-4/Desktop/playprojects/chap1/app/views/debug.scala.html
                    HASH: f3ebb44ed1cb5c7a0c9a539790e4936960adf256
                    MATRIX: 503->1|627->24|654->55|703->74|715->78|741->83|783->95|798->102|863->146|905->158|975->207
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|26->5|26->5|26->5|27->6|27->6
                    -- GENERATED --
                */
            