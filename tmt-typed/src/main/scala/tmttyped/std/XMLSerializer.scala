package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
trait XMLSerializer extends StObject {
  
  def serializeToString(root: org.scalajs.dom.raw.Node): java.lang.String
}
object XMLSerializer {
  
  @scala.inline
  def apply(serializeToString: org.scalajs.dom.raw.Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
  
  @scala.inline
  implicit class XMLSerializerMutableBuilder[Self <: XMLSerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializeToString(value: org.scalajs.dom.raw.Node => java.lang.String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
