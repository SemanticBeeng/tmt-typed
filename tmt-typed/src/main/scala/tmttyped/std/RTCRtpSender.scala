package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer. */
@js.native
trait RTCRtpSender extends StObject {
  
  val dtmf: RTCDTMFSender_ | Null = js.native
  
  def getParameters(): RTCRtpSendParameters = js.native
  
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  
  def replaceTrack(): js.Promise[Unit] = js.native
  def replaceTrack(withTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): js.Promise[Unit] = js.native
  
  def setParameters(parameters: RTCRtpSendParameters): js.Promise[Unit] = js.native
  
  def setStreams(streams: org.scalajs.dom.experimental.mediastream.MediaStream*): Unit = js.native
  
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack | Null = js.native
  
  val transport: RTCDtlsTransport | Null = js.native
}
