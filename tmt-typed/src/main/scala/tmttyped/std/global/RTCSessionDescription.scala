package tmttyped.std.global

import org.scalajs.dom.experimental.webrtc.RTCSdpType
import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCSessionDescription")
@js.native
class RTCSessionDescription ()
  extends tmttyped.std.RTCSessionDescription {
  def this(descriptionInitDict: RTCSessionDescriptionInit) = this()
  
  /* CompleteClass */
  override val sdp: java.lang.String = js.native
  
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  
  /* CompleteClass */
  override val `type`: RTCSdpType = js.native
}
