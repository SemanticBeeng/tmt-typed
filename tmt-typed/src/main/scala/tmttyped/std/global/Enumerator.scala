package tmttyped.std.global

import tmttyped.std.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Enumerator")
@js.native
class Enumerator[T] protected ()
  extends tmttyped.std.Enumerator[T] {
  def this(collection: js.Any) = this()
  def this(collection: Item[T]) = this()
  def this(safearray: tmttyped.std.SafeArray[T]) = this()
  
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  /* CompleteClass */
  override def atEnd(): scala.Boolean = js.native
  
  /**
    * Returns the current item in the collection
    */
  /* CompleteClass */
  override def item(): T = js.native
  
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  /* CompleteClass */
  override def moveFirst(): Unit = js.native
  
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  /* CompleteClass */
  override def moveNext(): Unit = js.native
}
