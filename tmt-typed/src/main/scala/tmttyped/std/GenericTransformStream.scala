package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericTransformStream extends StObject {
  
  val readable: org.scalajs.dom.experimental.ReadableStream[js.Any]
  
  val writable: WritableStream[js.Any]
}
object GenericTransformStream {
  
  @scala.inline
  def apply(readable: org.scalajs.dom.experimental.ReadableStream[js.Any], writable: WritableStream[js.Any]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransformStream]
  }
  
  @scala.inline
  implicit class GenericTransformStreamMutableBuilder[Self <: GenericTransformStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadable(value: org.scalajs.dom.experimental.ReadableStream[js.Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[js.Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
