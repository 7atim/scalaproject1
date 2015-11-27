
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Html,Flash,Lang,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html)(implicit flash: Flash, lang: Lang):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.67*/("""
<!DOCTYPE html>
<html>
<head>
  <title>"""),_display_(Seq(/*5.11*/title)),format.raw/*5.16*/("""</title>
  <link rel="stylesheet" type="text/css" media="screen"
     href='"""),_display_(Seq(/*7.13*/routes/*7.19*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.58*/("""'>
  <link rel="stylesheet" media="screen"
     href=""""),_display_(Seq(/*9.13*/routes/*9.19*/.Assets.at("stylesheets/main.css"))),format.raw/*9.53*/("""">
</head>
<body>
<div class="screenshot">

  <div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
      <div class="container">
        <a class="brand" href=""""),_display_(Seq(/*17.33*/routes/*17.39*/.Application.index())),format.raw/*17.59*/("""">
            """),_display_(Seq(/*18.14*/Messages("application.name"))),format.raw/*18.42*/("""
        </a>
      </div>
    </div>
  </div>

  <div class="container">
    """),_display_(Seq(/*25.6*/if(flash.get("success").isDefined)/*25.40*/{_display_(Seq(format.raw/*25.41*/("""
      <div class="alert alert-success">
        """),_display_(Seq(/*27.10*/flash/*27.15*/.get("success"))),format.raw/*27.30*/("""
      </div>
    """)))})),format.raw/*29.6*/("""

    """),_display_(Seq(/*31.6*/if(flash.get("error").isDefined)/*31.38*/{_display_(Seq(format.raw/*31.39*/("""
      <div class="alert alert-error">
        """),_display_(Seq(/*33.10*/flash/*33.15*/.get("error"))),format.raw/*33.28*/("""
      </div>
    """)))})),format.raw/*35.6*/("""
    """),_display_(Seq(/*36.6*/content)),format.raw/*36.13*/("""
    """),_display_(Seq(/*37.6*/debug())),format.raw/*37.13*/("""
  </div>
</div>
</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html,flash:Flash,lang:Lang) = apply(title)(content)(flash,lang)
    
    def f:((String) => (Html) => (Flash,Lang) => play.api.templates.Html) = (title) => (content) => (flash,lang) => apply(title)(content)(flash,lang)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 14:09:56 CET 2015
                    SOURCE: C:/Users/SADB-4/Desktop/playprojects/chap1/app/views/main.scala.html
                    HASH: 1be58bb917bebff26a8e0e1617573fcf73e81615
                    MATRIX: 520->1|657->66|728->107|754->112|861->189|875->195|935->234|1020->289|1034->295|1089->329|1297->506|1312->512|1354->532|1401->548|1451->576|1560->655|1603->689|1637->690|1718->740|1732->745|1769->760|1819->779|1856->786|1897->818|1931->819|2010->867|2024->872|2059->885|2109->904|2145->910|2174->917|2210->923|2239->930
                    LINES: 19->1|22->1|26->5|26->5|28->7|28->7|28->7|30->9|30->9|30->9|38->17|38->17|38->17|39->18|39->18|46->25|46->25|46->25|48->27|48->27|48->27|50->29|52->31|52->31|52->31|54->33|54->33|54->33|56->35|57->36|57->36|58->37|58->37
                    -- GENERATED --
                */
            