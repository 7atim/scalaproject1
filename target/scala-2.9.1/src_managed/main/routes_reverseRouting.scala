// @SOURCE:C:/Users/SADB-4/Desktop/playprojects/chap1/conf/routes
// @HASH:fc5e9d2103288dd0c4c930e3ef3c686d912dc997
// @DATE:Fri Nov 27 10:19:53 CET 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:1
package controllers {

// @LINE:1
class ReverseApplication {
    


 
// @LINE:1
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
class ReverseDevelopers {
    


 
// @LINE:7
def editDeveloper(id:Long) = {
   Call("GET", "/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:6
def remove(id:Long) = {
   Call("GET", "/remove/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:3
def list() = {
   Call("GET", "/developers")
}
                                                        
 
// @LINE:8
def show(id:Long) = {
   Call("GET", "/developers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:4
def save() = {
   Call("POST", "/developers")
}
                                                        
 
// @LINE:5
def newDeveloper() = {
   Call("GET", "/developers/new")
}
                                                        

                      
    
}
                            

// @LINE:10
class ReverseBarcodes {
    


 
// @LINE:10
def barcode(id:Long) = {
   Call("GET", "/barcode/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:1
package controllers.javascript {

// @LINE:1
class ReverseApplication {
    


 
// @LINE:1
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
class ReverseDevelopers {
    


 
// @LINE:7
def editDeveloper = JavascriptReverseRoute(
   "controllers.Developers.editDeveloper",
   """
      function(id) {
      return _wA({method:"GET", url:"/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:6
def remove = JavascriptReverseRoute(
   "controllers.Developers.remove",
   """
      function(id) {
      return _wA({method:"GET", url:"/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:3
def list = JavascriptReverseRoute(
   "controllers.Developers.list",
   """
      function() {
      return _wA({method:"GET", url:"/developers"})
      }
   """
)
                                                        
 
// @LINE:8
def show = JavascriptReverseRoute(
   "controllers.Developers.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/developers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:4
def save = JavascriptReverseRoute(
   "controllers.Developers.save",
   """
      function() {
      return _wA({method:"POST", url:"/developers"})
      }
   """
)
                                                        
 
// @LINE:5
def newDeveloper = JavascriptReverseRoute(
   "controllers.Developers.newDeveloper",
   """
      function() {
      return _wA({method:"GET", url:"/developers/new"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:10
class ReverseBarcodes {
    


 
// @LINE:10
def barcode = JavascriptReverseRoute(
   "controllers.Barcodes.barcode",
   """
      function(id) {
      return _wA({method:"GET", url:"/barcode/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:1
package controllers.ref {

// @LINE:1
class ReverseApplication {
    


 
// @LINE:1
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
class ReverseDevelopers {
    


 
// @LINE:7
def editDeveloper(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Developers.editDeveloper(id), HandlerDef(this, "controllers.Developers", "editDeveloper", Seq(classOf[Long]))
)
                              
 
// @LINE:6
def remove(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Developers.remove(id), HandlerDef(this, "controllers.Developers", "remove", Seq(classOf[Long]))
)
                              
 
// @LINE:3
def list() = new play.api.mvc.HandlerRef(
   controllers.Developers.list(), HandlerDef(this, "controllers.Developers", "list", Seq())
)
                              
 
// @LINE:8
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Developers.show(id), HandlerDef(this, "controllers.Developers", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:4
def save() = new play.api.mvc.HandlerRef(
   controllers.Developers.save(), HandlerDef(this, "controllers.Developers", "save", Seq())
)
                              
 
// @LINE:5
def newDeveloper() = new play.api.mvc.HandlerRef(
   controllers.Developers.newDeveloper(), HandlerDef(this, "controllers.Developers", "newDeveloper", Seq())
)
                              

                      
    
}
                            

// @LINE:10
class ReverseBarcodes {
    


 
// @LINE:10
def barcode(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Barcodes.barcode(id), HandlerDef(this, "controllers.Barcodes", "barcode", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                