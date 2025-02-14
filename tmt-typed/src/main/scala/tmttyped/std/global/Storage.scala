package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Storage")
@js.native
class Storage ()
  extends StObject
     with tmttyped.std.Storage {
  
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * Returns the current value associated with the given key, or null if the given key does not exist in the list associated with the object.
    */
  /* CompleteClass */
  override def getItem(key: java.lang.String): java.lang.String | Null = js.native
  
  /**
    * Returns the name of the nth key in the list, or null if n is greater than or equal to the number of key/value pairs in the object.
    */
  /* CompleteClass */
  override def key(index: Double): java.lang.String | Null = js.native
  
  /**
    * Returns the number of key/value pairs currently present in the list associated with the object.
    */
  /* CompleteClass */
  override val length: Double = js.native
  
  /**
    * Removes the key/value pair with the given key from the list associated with the object, if a key/value pair with the given key exists.
    */
  /* CompleteClass */
  override def removeItem(key: java.lang.String): Unit = js.native
  
  /**
    * Sets the value of the pair identified by key to value, creating a new key/value pair if none existed for key previously.
    *
    * Throws a "QuotaExceededError" DOMException exception if the new value couldn't be set. (Setting could fail if, e.g., the user has disabled storage for the site, or if the quota has been exceeded.)
    */
  /* CompleteClass */
  override def setItem(key: java.lang.String, value: java.lang.String): Unit = js.native
}
