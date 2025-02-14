package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <length> which can be animated. */
trait SVGAnimatedLength extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGLength
  
  val baseVal: org.scalajs.dom.raw.SVGLength
}
object SVGAnimatedLength {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGLength, baseVal: org.scalajs.dom.raw.SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
  
  @scala.inline
  implicit class SVGAnimatedLengthMutableBuilder[Self <: SVGAnimatedLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGLength): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGLength): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
