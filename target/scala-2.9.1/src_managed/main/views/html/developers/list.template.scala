
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Developer],Flash,Lang,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(developers: List[Developer])(implicit flash: Flash, lang: Lang):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.66*/("""

"""),_display_(Seq(/*3.2*/main(Messages("application.name"))/*3.36*/ {_display_(Seq(format.raw/*3.38*/("""

  <dl class="products">
    """),_display_(Seq(/*6.6*/for(developer <- developers) yield /*6.34*/ {_display_(Seq(format.raw/*6.36*/("""
      <dt>
          <a href=""""),_display_(Seq(/*8.21*/controllers/*8.32*/.routes.Developers.show(developer.id))),format.raw/*8.69*/("""">
              """),_display_(Seq(/*9.16*/developer/*9.25*/.name)),format.raw/*9.30*/("""
          </a>
      </dt>
      <dd>"""),_display_(Seq(/*12.12*/developer/*12.21*/.description)),format.raw/*12.33*/("""</dd>
    """)))})),format.raw/*13.6*/("""
  </dl>

  <p><a href=""""),_display_(Seq(/*16.16*/controllers/*16.27*/.routes.Developers.newDeveloper())),format.raw/*16.60*/("""" class="btn">
    <i class="icon-plus"></i> """),_display_(Seq(/*17.32*/Messages("developers.new.command"))),format.raw/*17.66*/("""</a></p>
""")))})),format.raw/*18.2*/("""
"""))}
    }
    
    def render(developers:List[Developer],flash:Flash,lang:Lang) = apply(developers)(flash,lang)
    
    def f:((List[Developer]) => (Flash,Lang) => play.api.templates.Html) = (developers) => (flash,lang) => apply(developers)(flash,lang)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 14:49:26 CET 2015
                    SOURCE: C:/Users/SADB-4/Desktop/playprojects/chap1/app/views/developers/list.scala.html
                    HASH: 425b70da5a454035bc58d18c2ce1ad74f10371c7
                    MATRIX: 535->1|671->65|703->68|745->102|779->104|839->135|882->163|916->165|978->197|997->208|1055->245|1103->263|1120->272|1146->277|1216->316|1234->325|1268->337|1310->348|1366->373|1386->384|1441->417|1518->463|1574->497|1615->507
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|29->8|29->8|29->8|30->9|30->9|30->9|33->12|33->12|33->12|34->13|37->16|37->16|37->16|38->17|38->17|39->18
                    -- GENERATED --
                */
            