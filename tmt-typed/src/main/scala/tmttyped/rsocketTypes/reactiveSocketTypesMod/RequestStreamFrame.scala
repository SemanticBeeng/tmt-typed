package tmttyped.rsocketTypes.reactiveSocketTypesMod

import tmttyped.rsocketTypes.rsocketTypesNumbers.`0x06`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestStreamFrame
  extends StObject
     with Frame {
  
  var data: Encodable
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var metadata: Encodable
  
  var requestN: Double
  
  var streamId: Double
  
  var `type`: `0x06`
}
object RequestStreamFrame {
  
  @scala.inline
  def apply(data: Encodable, flags: Double, metadata: Encodable, requestN: Double, streamId: Double): RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x06)
    __obj.asInstanceOf[RequestStreamFrame]
  }
  
  @scala.inline
  implicit class RequestStreamFrameMutableBuilder[Self <: RequestStreamFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestN(value: Double): Self = StObject.set(x, "requestN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x06`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
