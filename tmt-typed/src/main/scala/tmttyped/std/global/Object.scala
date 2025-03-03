package tmttyped.std.global

import tmttyped.std.ObjectConstructor
import tmttyped.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Object")
@js.native
class Object ()
  extends StObject
     with tmttyped.std.Object {
  def this(value: js.Any) = this()
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
}
object Object {
  
  /**
    * Provides functionality common to all JavaScript objects.
    */
  @scala.inline
  def apply: ObjectConstructor = js.Dynamic.global.selectDynamic("Object").asInstanceOf[ObjectConstructor]
}
