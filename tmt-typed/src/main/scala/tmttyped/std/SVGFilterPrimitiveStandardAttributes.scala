package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGFilterPrimitiveStandardAttributes extends StObject {
  
  val height: org.scalajs.dom.raw.SVGAnimatedLength
  
  val result: org.scalajs.dom.raw.SVGAnimatedString
  
  val width: org.scalajs.dom.raw.SVGAnimatedLength
  
  val x: org.scalajs.dom.raw.SVGAnimatedLength
  
  val y: org.scalajs.dom.raw.SVGAnimatedLength
}
object SVGFilterPrimitiveStandardAttributes {
  
  @scala.inline
  def apply(
    height: org.scalajs.dom.raw.SVGAnimatedLength,
    result: org.scalajs.dom.raw.SVGAnimatedString,
    width: org.scalajs.dom.raw.SVGAnimatedLength,
    x: org.scalajs.dom.raw.SVGAnimatedLength,
    y: org.scalajs.dom.raw.SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
  
  @scala.inline
  implicit class SVGFilterPrimitiveStandardAttributesMutableBuilder[Self <: SVGFilterPrimitiveStandardAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: org.scalajs.dom.raw.SVGAnimatedString): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
