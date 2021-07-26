package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamConstraints extends StObject {
  
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.undefined
  
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.undefined
}
object MediaStreamConstraints {
  
  @scala.inline
  def apply(): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamConstraints]
  }
  
  @scala.inline
  implicit class MediaStreamConstraintsMutableBuilder[Self <: MediaStreamConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    @scala.inline
    def setVideo(value: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
