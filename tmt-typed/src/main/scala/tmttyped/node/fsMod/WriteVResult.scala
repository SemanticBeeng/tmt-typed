package tmttyped.node.fsMod

import tmttyped.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteVResult extends StObject {
  
  var buffers: js.Array[ArrayBufferView]
  
  var bytesWritten: Double
}
object WriteVResult {
  
  @scala.inline
  def apply(buffers: js.Array[ArrayBufferView], bytesWritten: Double): WriteVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteVResult]
  }
  
  @scala.inline
  implicit class WriteVResultMutableBuilder[Self <: WriteVResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffers(value: js.Array[ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersVarargs(value: ArrayBufferView*): Self = StObject.set(x, "buffers", js.Array(value :_*))
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
