package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLContextAttributes extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  
  var desynchronized: js.UndefOr[scala.Boolean] = js.undefined
  
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
  
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}
object WebGLContextAttributes {
  
  @scala.inline
  def apply(): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextAttributes]
  }
  
  @scala.inline
  implicit class WebGLContextAttributesMutableBuilder[Self <: WebGLContextAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAntialias(value: scala.Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setDepth(value: scala.Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setDesynchronized(value: scala.Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: scala.Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: WebGLPowerPreference): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    @scala.inline
    def setPremultipliedAlpha(value: scala.Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: scala.Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setStencil(value: scala.Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
