package tmttyped.std.global

import org.scalajs.dom.raw.BlobPropertyBag
import tmttyped.std.BlobPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Blob")
@js.native
class Blob ()
  extends StObject
     with tmttyped.std.Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
  def this(blobParts: Unit, options: BlobPropertyBag) = this()
}
