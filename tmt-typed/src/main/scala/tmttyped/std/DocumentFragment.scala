package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A minimal document object that has no parent. It is used as a lightweight version of Document that stores a segment of a document structure comprised of nodes just like a standard document. The key difference is that because the document fragment isn't part of the active document tree structure, changes made to the fragment don't affect the document, cause reflow, or incur any performance impact that can occur when changes are made. */
@js.native
trait DocumentFragment
  extends StObject
     with Node
     with NonElementParentNode
     with ParentNode {
  
  @JSName("ownerDocument")
  val ownerDocument_DocumentFragment: org.scalajs.dom.raw.Document = js.native
}
