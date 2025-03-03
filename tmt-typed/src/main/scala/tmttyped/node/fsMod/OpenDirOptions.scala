package tmttyped.node.fsMod

import tmttyped.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDirOptions extends StObject {
  
  /**
    * Number of directory entries that are buffered
    * internally when reading from the directory. Higher values lead to better
    * performance but higher memory usage.
    * @default 32
    */
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
}
object OpenDirOptions {
  
  @scala.inline
  def apply(): OpenDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDirOptions]
  }
  
  @scala.inline
  implicit class OpenDirOptionsMutableBuilder[Self <: OpenDirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
