package tmttyped.node.childProcessMod

import tmttyped.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileSyncOptionsWithStringEncoding extends ExecFileSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithStringEncoding: BufferEncoding
}
object ExecFileSyncOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecFileSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileSyncOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class ExecFileSyncOptionsWithStringEncodingMutableBuilder[Self <: ExecFileSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
