package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpEncodingParameters
  extends StObject
     with RTCRtpCodingParameters {
  
  var active: js.UndefOr[scala.Boolean] = js.undefined
  
  var maxBitrate: js.UndefOr[Double] = js.undefined
  
  var scaleResolutionDownBy: js.UndefOr[Double] = js.undefined
}
object RTCRtpEncodingParameters {
  
  @scala.inline
  def apply(): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  
  @scala.inline
  implicit class RTCRtpEncodingParametersMutableBuilder[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: scala.Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: Double): Self = StObject.set(x, "maxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "maxBitrate", js.undefined)
    
    @scala.inline
    def setScaleResolutionDownBy(value: Double): Self = StObject.set(x, "scaleResolutionDownBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleResolutionDownByUndefined: Self = StObject.set(x, "scaleResolutionDownBy", js.undefined)
  }
}
