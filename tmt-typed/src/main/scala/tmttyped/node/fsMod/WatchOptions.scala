package tmttyped.node.fsMod

import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.eventsMod.Abortable
import tmttyped.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptions
  extends StObject
     with Abortable {
  
  var encoding: js.UndefOr[BufferEncoding | buffer_] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object WatchOptions {
  
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  
  @scala.inline
  implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding | buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
