package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
trait SVGAnimatedPreserveAspectRatio extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGPreserveAspectRatio
  
  val baseVal: org.scalajs.dom.raw.SVGPreserveAspectRatio
}
object SVGAnimatedPreserveAspectRatio {
  
  @scala.inline
  def apply(
    animVal: org.scalajs.dom.raw.SVGPreserveAspectRatio,
    baseVal: org.scalajs.dom.raw.SVGPreserveAspectRatio
  ): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
  
  @scala.inline
  implicit class SVGAnimatedPreserveAspectRatioMutableBuilder[Self <: SVGAnimatedPreserveAspectRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGPreserveAspectRatio): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGPreserveAspectRatio): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
