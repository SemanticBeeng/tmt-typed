package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method. */
trait WebGLShaderPrecisionFormat extends StObject {
  
  val precision: GLint
  
  val rangeMax: GLint
  
  val rangeMin: GLint
}
object WebGLShaderPrecisionFormat {
  
  @scala.inline
  def apply(precision: GLint, rangeMax: GLint, rangeMin: GLint): WebGLShaderPrecisionFormat = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], rangeMax = rangeMax.asInstanceOf[js.Any], rangeMin = rangeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShaderPrecisionFormat]
  }
  
  @scala.inline
  implicit class WebGLShaderPrecisionFormatMutableBuilder[Self <: WebGLShaderPrecisionFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrecision(value: GLint): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeMax(value: GLint): Self = StObject.set(x, "rangeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeMin(value: GLint): Self = StObject.set(x, "rangeMin", value.asInstanceOf[js.Any])
  }
}
