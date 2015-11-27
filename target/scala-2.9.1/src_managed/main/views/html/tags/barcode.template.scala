
package views.html.tags

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
object barcode extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(ean: Long):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.13*/("""
<img class="barcode" alt=""""),_display_(Seq(/*2.28*/ean)),format.raw/*2.31*/("""" src=""""),_display_(Seq(/*2.39*/routes/*2.45*/.Barcodes.barcode(ean))),format.raw/*2.67*/("""">
"""))}
    }
    
    def render(ean:Long) = apply(ean)
    
    def f:((Long) => play.api.templates.Html) = (ean) => apply(ean)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 14:09:56 CET 2015
                    SOURCE: C:/Users/SADB-4/Desktop/playprojects/chap1/app/views/tags/barcode.scala.html
                    HASH: cb815ccaba836e54736765a1e7c08b0f1d410c84
                    MATRIX: 510->1|593->12|651->40|675->43|713->51|727->57|770->79
                    LINES: 19->1|22->1|23->2|23->2|23->2|23->2|23->2
                    -- GENERATED --
                */
            