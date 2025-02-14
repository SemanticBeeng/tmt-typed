package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
trait VRPose extends StObject {
  
  val angularAcceleration: js.typedarray.Float32Array | Null
  
  val angularVelocity: js.typedarray.Float32Array | Null
  
  val linearAcceleration: js.typedarray.Float32Array | Null
  
  val linearVelocity: js.typedarray.Float32Array | Null
  
  val orientation: js.typedarray.Float32Array | Null
  
  val position: js.typedarray.Float32Array | Null
}
object VRPose {
  
  @scala.inline
  def apply(): VRPose = {
    val __obj = js.Dynamic.literal(angularAcceleration = null, angularVelocity = null, linearAcceleration = null, linearVelocity = null, orientation = null, position = null)
    __obj.asInstanceOf[VRPose]
  }
  
  @scala.inline
  implicit class VRPoseMutableBuilder[Self <: VRPose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularAcceleration(value: js.typedarray.Float32Array): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAccelerationNull: Self = StObject.set(x, "angularAcceleration", null)
    
    @scala.inline
    def setAngularVelocity(value: js.typedarray.Float32Array): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityNull: Self = StObject.set(x, "angularVelocity", null)
    
    @scala.inline
    def setLinearAcceleration(value: js.typedarray.Float32Array): Self = StObject.set(x, "linearAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearAccelerationNull: Self = StObject.set(x, "linearAcceleration", null)
    
    @scala.inline
    def setLinearVelocity(value: js.typedarray.Float32Array): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearVelocityNull: Self = StObject.set(x, "linearVelocity", null)
    
    @scala.inline
    def setOrientation(value: js.typedarray.Float32Array): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    @scala.inline
    def setPosition(value: js.typedarray.Float32Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
  }
}
