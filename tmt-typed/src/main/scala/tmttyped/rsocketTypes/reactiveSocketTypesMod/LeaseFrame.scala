package tmttyped.rsocketTypes.reactiveSocketTypesMod

import tmttyped.rsocketTypes.rsocketTypesNumbers.`0`
import tmttyped.rsocketTypes.rsocketTypesNumbers.`0x02`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaseFrame
  extends StObject
     with Frame {
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Encodable] = js.undefined
  
  var requestCount: Double
  
  var streamId: `0`
  
  var ttl: Double
  
  var `type`: `0x02`
}
object LeaseFrame {
  
  @scala.inline
  def apply(flags: Double, requestCount: Double, ttl: Double): LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = 0, ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x02)
    __obj.asInstanceOf[LeaseFrame]
  }
  
  @scala.inline
  implicit class LeaseFrameMutableBuilder[Self <: LeaseFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x02`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
