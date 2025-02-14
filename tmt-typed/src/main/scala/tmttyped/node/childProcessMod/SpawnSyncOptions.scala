package tmttyped.node.childProcessMod

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncOptions
  extends StObject
     with CommonSpawnOptions {
  
  var encoding: js.UndefOr[BufferEncoding | buffer_ | Null] = js.undefined
  
  var input: js.UndefOr[String | ArrayBufferView] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
}
object SpawnSyncOptions {
  
  @scala.inline
  def apply(): SpawnSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnSyncOptions]
  }
  
  @scala.inline
  implicit class SpawnSyncOptionsMutableBuilder[Self <: SpawnSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding | buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setInput(value: String | ArrayBufferView): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
  }
}
