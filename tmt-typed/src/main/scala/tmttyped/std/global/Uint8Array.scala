package tmttyped.std.global

import tmttyped.std.ArrayBufferLike
import tmttyped.std.ArrayLike
import tmttyped.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint8Array")
@js.native
class Uint8Array ()
  extends StObject
     with tmttyped.std.Uint8Array {
  def this(array: ArrayBufferLike) = this()
  def this(array: ArrayLike[Double]) = this()
  def this(elements: js.Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object Uint8Array {
  
  @scala.inline
  def apply: Uint8ArrayConstructor = js.Dynamic.global.selectDynamic("Uint8Array").asInstanceOf[Uint8ArrayConstructor]
}
