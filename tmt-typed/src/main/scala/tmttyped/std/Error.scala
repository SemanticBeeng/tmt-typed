package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var message: java.lang.String
  
  var name: java.lang.String
  
  var stack: js.UndefOr[java.lang.String] = js.undefined
}
object Error {
  
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String): js.Error = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[js.Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: js.Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: java.lang.String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
