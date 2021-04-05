package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
trait RTCIceCandidate extends StObject {
  
  val candidate: java.lang.String
  
  val component: RTCIceComponent | Null
  
  val foundation: java.lang.String | Null
  
  val port: Double | Null
  
  val priority: Double | Null
  
  val protocol: RTCIceProtocol | Null
  
  val relatedAddress: java.lang.String | Null
  
  val relatedPort: Double | Null
  
  val sdpMLineIndex: Double | Null
  
  val sdpMid: java.lang.String | Null
  
  val tcpType: RTCIceTcpCandidateType | Null
  
  def toJSON(): org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit
  
  val `type`: RTCIceCandidateType | Null
  
  val usernameFragment: java.lang.String | Null
}
object RTCIceCandidate {
  
  @scala.inline
  def apply(candidate: java.lang.String, toJSON: () => org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit): org.scalajs.dom.experimental.webrtc.RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), component = null, foundation = null, port = null, priority = null, protocol = null, relatedAddress = null, relatedPort = null, sdpMLineIndex = null, sdpMid = null, tcpType = null, usernameFragment = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCIceCandidate]
  }
  
  @scala.inline
  implicit class RTCIceCandidateMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCIceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: java.lang.String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: RTCIceComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = StObject.set(x, "component", null)
    
    @scala.inline
    def setFoundation(value: java.lang.String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundationNull: Self = StObject.set(x, "foundation", null)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    @scala.inline
    def setProtocol(value: RTCIceProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    @scala.inline
    def setRelatedAddress(value: java.lang.String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddressNull: Self = StObject.set(x, "relatedAddress", null)
    
    @scala.inline
    def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPortNull: Self = StObject.set(x, "relatedPort", null)
    
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMLineIndexNull: Self = StObject.set(x, "sdpMLineIndex", null)
    
    @scala.inline
    def setSdpMid(value: java.lang.String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMidNull: Self = StObject.set(x, "sdpMid", null)
    
    @scala.inline
    def setTcpType(value: RTCIceTcpCandidateType): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpTypeNull: Self = StObject.set(x, "tcpType", null)
    
    @scala.inline
    def setToJSON(value: () => org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: RTCIceCandidateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragmentNull: Self = StObject.set(x, "usernameFragment", null)
  }
}
