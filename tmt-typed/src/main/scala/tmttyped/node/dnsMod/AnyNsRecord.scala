package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.NS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyNsRecord extends AnyRecord {
  
  var `type`: NS
  
  var value: String
}
object AnyNsRecord {
  
  @scala.inline
  def apply(value: String): AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NS")
    __obj.asInstanceOf[AnyNsRecord]
  }
  
  @scala.inline
  implicit class AnyNsRecordMutableBuilder[Self <: AnyNsRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
