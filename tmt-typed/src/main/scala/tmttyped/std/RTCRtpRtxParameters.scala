package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpRtxParameters extends StObject {
  
  var ssrc: js.UndefOr[Double] = js.undefined
}
object RTCRtpRtxParameters {
  
  @scala.inline
  def apply(): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
  
  @scala.inline
  implicit class RTCRtpRtxParametersMutableBuilder[Self <: RTCRtpRtxParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
  }
}
