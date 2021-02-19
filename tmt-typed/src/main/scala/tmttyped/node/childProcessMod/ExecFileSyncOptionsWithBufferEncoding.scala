package tmttyped.node.childProcessMod

import tmttyped.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileSyncOptionsWithBufferEncoding extends ExecFileSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithBufferEncoding: BufferEncoding
}
object ExecFileSyncOptionsWithBufferEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecFileSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileSyncOptionsWithBufferEncoding]
  }
  
  @scala.inline
  implicit class ExecFileSyncOptionsWithBufferEncodingMutableBuilder[Self <: ExecFileSyncOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
