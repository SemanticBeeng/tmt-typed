package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
trait AudioListener extends StObject {
  
  val forwardX: org.scalajs.dom.raw.AudioParam
  
  val forwardY: org.scalajs.dom.raw.AudioParam
  
  val forwardZ: org.scalajs.dom.raw.AudioParam
  
  val positionX: org.scalajs.dom.raw.AudioParam
  
  val positionY: org.scalajs.dom.raw.AudioParam
  
  val positionZ: org.scalajs.dom.raw.AudioParam
  
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit
  
  val upX: org.scalajs.dom.raw.AudioParam
  
  val upY: org.scalajs.dom.raw.AudioParam
  
  val upZ: org.scalajs.dom.raw.AudioParam
}
object AudioListener {
  
  @scala.inline
  def apply(
    forwardX: org.scalajs.dom.raw.AudioParam,
    forwardY: org.scalajs.dom.raw.AudioParam,
    forwardZ: org.scalajs.dom.raw.AudioParam,
    positionX: org.scalajs.dom.raw.AudioParam,
    positionY: org.scalajs.dom.raw.AudioParam,
    positionZ: org.scalajs.dom.raw.AudioParam,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double, Double) => Unit,
    upX: org.scalajs.dom.raw.AudioParam,
    upY: org.scalajs.dom.raw.AudioParam,
    upZ: org.scalajs.dom.raw.AudioParam
  ): AudioListener = {
    val __obj = js.Dynamic.literal(forwardX = forwardX.asInstanceOf[js.Any], forwardY = forwardY.asInstanceOf[js.Any], forwardZ = forwardZ.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], positionZ = positionZ.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6(setOrientation), setPosition = js.Any.fromFunction3(setPosition), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
  
  @scala.inline
  implicit class AudioListenerMutableBuilder[Self <: AudioListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardX(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "forwardX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardY(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "forwardY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardZ(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "forwardZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionX(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionY(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionZ(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "positionZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setOrientation", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSetPosition(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpX(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "upX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpY(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "upY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpZ(value: org.scalajs.dom.raw.AudioParam): Self = StObject.set(x, "upZ", value.asInstanceOf[js.Any])
  }
}
