package tmttyped.std.global

import tmttyped.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends StObject
     with tmttyped.std.WeakSet[T] {
  def this(iterable: js.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}
object WeakSet {
  
  @scala.inline
  def apply: WeakSetConstructor = js.Dynamic.global.selectDynamic("WeakSet").asInstanceOf[WeakSetConstructor]
}
