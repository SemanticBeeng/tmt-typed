package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyARecord
  extends StObject
     with RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  
  var `type`: A
}
object AnyARecord {
  
  @scala.inline
  def apply(address: String, ttl: Double): AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("A")
    __obj.asInstanceOf[AnyARecord]
  }
  
  @scala.inline
  implicit class AnyARecordMutableBuilder[Self <: AnyARecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: A): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
