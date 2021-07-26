package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
trait RTCSessionDescription extends StObject {
  
  val sdp: java.lang.String
  
  def toJSON(): js.Any
  
  val `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType
}
object RTCSessionDescription {
  
  @scala.inline
  def apply(
    sdp: java.lang.String,
    toJSON: () => js.Any,
    `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType
  ): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescription]
  }
  
  @scala.inline
  implicit class RTCSessionDescriptionMutableBuilder[Self <: RTCSessionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: org.scalajs.dom.experimental.webrtc.RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
