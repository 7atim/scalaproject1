
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
object details extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Developer,Flash,Lang,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(developer: Developer)(implicit flash: Flash, lang: Lang):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.59*/("""

"""),_display_(Seq(/*3.2*/main(Messages("developers.details", developer.name))/*3.54*/ {_display_(Seq(format.raw/*3.56*/("""
  
  <h2>
   
    """),_display_(Seq(/*7.6*/Messages("developers.details", developer.name))),format.raw/*7.52*/("""
  </h2>

  <dl class="dl-horizontal">
    <dt>"""),_display_(Seq(/*11.10*/Messages("id"))),format.raw/*11.24*/(""":</dt>
    <dd>"""),_display_(Seq(/*12.10*/developer/*12.19*/.id)),format.raw/*12.22*/("""</dd>

    <dt>"""),_display_(Seq(/*14.10*/Messages("name"))),format.raw/*14.26*/(""":</dt>
    <dd>"""),_display_(Seq(/*15.10*/developer/*15.19*/.name)),format.raw/*15.24*/("""</dd>

    <dt>"""),_display_(Seq(/*17.10*/Messages("description"))),format.raw/*17.33*/(""":</dt>
    <dd>"""),_display_(Seq(/*18.10*/developer/*18.19*/.description)),format.raw/*18.31*/("""</dd>
  </dl>

  <p><a href=""""),_display_(Seq(/*21.16*/controllers/*21.27*/.routes.Developers.remove(developer.id))),format.raw/*21.66*/("""" class="btn">
    <i class="icon-remove"></i> """),_display_(Seq(/*22.34*/Messages("developers.remove.command"))),format.raw/*22.71*/("""</a></p>
""")))})),format.raw/*23.2*/("""
"""))}
    }
    
    def render(developer:Developer,flash:Flash,lang:Lang) = apply(developer)(flash,lang)
    
    def f:((Developer) => (Flash,Lang) => play.api.templates.Html) = (developer) => (flash,lang) => apply(developer)(flash,lang)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 17:16:34 CET 2015
                    SOURCE: C:/Users/SADB-4/Desktop/playprojects/chap1/app/views/developers/details.scala.html
                    HASH: 64c3b83f98533fde4b329f73aaf50e183a18ed43
                    MATRIX: 532->1|661->58|693->61|753->113|787->115|836->135|903->181|982->229|1018->243|1065->259|1083->268|1108->271|1155->287|1193->303|1240->319|1258->328|1285->333|1332->349|1377->372|1424->388|1442->397|1476->409|1537->439|1557->450|1618->489|1697->537|1756->574|1797->584
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|32->11|32->11|33->12|33->12|33->12|35->14|35->14|36->15|36->15|36->15|38->17|38->17|39->18|39->18|39->18|42->21|42->21|42->21|43->22|43->22|44->23
                    -- GENERATED --
                */
            