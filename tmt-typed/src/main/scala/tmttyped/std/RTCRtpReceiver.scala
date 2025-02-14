package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
trait RTCRtpReceiver extends StObject {
  
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  
  def getParameters(): RTCRtpReceiveParameters
  
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport]
  
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource]
  
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
  
  val transport: RTCDtlsTransport | Null
}
object RTCRtpReceiver {
  
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport],
    getSynchronizationSources: () => js.Array[RTCRtpSynchronizationSource],
    track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any], transport = null)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  @scala.inline
  implicit class RTCRtpReceiverMutableBuilder[Self <: RTCRtpReceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = StObject.set(x, "getContributingSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => RTCRtpReceiveParameters): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStats(value: () => js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport]): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSynchronizationSources(value: () => js.Array[RTCRtpSynchronizationSource]): Self = StObject.set(x, "getSynchronizationSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: RTCDtlsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportNull: Self = StObject.set(x, "transport", null)
  }
}
