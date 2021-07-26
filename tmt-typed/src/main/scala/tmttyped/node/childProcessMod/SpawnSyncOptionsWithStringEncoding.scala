package tmttyped.node.childProcessMod

import tmttyped.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncOptionsWithStringEncoding
  extends StObject
     with SpawnSyncOptions {
  
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithStringEncoding: BufferEncoding
}
object SpawnSyncOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): SpawnSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class SpawnSyncOptionsWithStringEncodingMutableBuilder[Self <: SpawnSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
