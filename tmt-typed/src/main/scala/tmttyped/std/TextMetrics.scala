package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
trait TextMetrics extends StObject {
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double
  
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double
  
  /**
    * Returns the measurement described below.
    */
  val alphabeticBaseline: Double
  
  /**
    * Returns the measurement described below.
    */
  val emHeightAscent: Double
  
  /**
    * Returns the measurement described below.
    */
  val emHeightDescent: Double
  
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxAscent: Double
  
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxDescent: Double
  
  /**
    * Returns the measurement described below.
    */
  val hangingBaseline: Double
  
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double
  
  /**
    * Returns the measurement described below.
    */
  val width: Double
}
object TextMetrics {
  
  @scala.inline
  def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    alphabeticBaseline: Double,
    emHeightAscent: Double,
    emHeightDescent: Double,
    fontBoundingBoxAscent: Double,
    fontBoundingBoxDescent: Double,
    hangingBaseline: Double,
    ideographicBaseline: Double,
    width: Double
  ): org.scalajs.dom.raw.TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], alphabeticBaseline = alphabeticBaseline.asInstanceOf[js.Any], emHeightAscent = emHeightAscent.asInstanceOf[js.Any], emHeightDescent = emHeightDescent.asInstanceOf[js.Any], fontBoundingBoxAscent = fontBoundingBoxAscent.asInstanceOf[js.Any], fontBoundingBoxDescent = fontBoundingBoxDescent.asInstanceOf[js.Any], hangingBaseline = hangingBaseline.asInstanceOf[js.Any], ideographicBaseline = ideographicBaseline.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.TextMetrics]
  }
  
  @scala.inline
  implicit class TextMetricsMutableBuilder[Self <: org.scalajs.dom.raw.TextMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualBoundingBoxAscent(value: Double): Self = StObject.set(x, "actualBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBoundingBoxDescent(value: Double): Self = StObject.set(x, "actualBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphabeticBaseline(value: Double): Self = StObject.set(x, "alphabeticBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmHeightAscent(value: Double): Self = StObject.set(x, "emHeightAscent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmHeightDescent(value: Double): Self = StObject.set(x, "emHeightDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBoundingBoxAscent(value: Double): Self = StObject.set(x, "fontBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBoundingBoxDescent(value: Double): Self = StObject.set(x, "fontBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangingBaseline(value: Double): Self = StObject.set(x, "hangingBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeographicBaseline(value: Double): Self = StObject.set(x, "ideographicBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
