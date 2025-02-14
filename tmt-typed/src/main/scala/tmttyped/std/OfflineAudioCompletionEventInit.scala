package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineAudioCompletionEventInit
  extends StObject
     with EventInit {
  
  var renderedBuffer: org.scalajs.dom.raw.AudioBuffer
}
object OfflineAudioCompletionEventInit {
  
  @scala.inline
  def apply(renderedBuffer: org.scalajs.dom.raw.AudioBuffer): OfflineAudioCompletionEventInit = {
    val __obj = js.Dynamic.literal(renderedBuffer = renderedBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioCompletionEventInit]
  }
  
  @scala.inline
  implicit class OfflineAudioCompletionEventInitMutableBuilder[Self <: OfflineAudioCompletionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedBuffer(value: org.scalajs.dom.raw.AudioBuffer): Self = StObject.set(x, "renderedBuffer", value.asInstanceOf[js.Any])
  }
}
