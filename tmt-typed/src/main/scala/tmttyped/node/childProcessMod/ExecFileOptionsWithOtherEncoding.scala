package tmttyped.node.childProcessMod

import tmttyped.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptionsWithOtherEncoding
  extends StObject
     with ExecFileOptions {
  
  var encoding: BufferEncoding
}
object ExecFileOptionsWithOtherEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecFileOptionsWithOtherEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
  }
  
  @scala.inline
  implicit class ExecFileOptionsWithOtherEncodingMutableBuilder[Self <: ExecFileOptionsWithOtherEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
