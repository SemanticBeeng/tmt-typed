package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The nodes of a document subtree and a position within them. */
trait TreeWalker extends StObject {
  
  var currentNode: org.scalajs.dom.raw.Node
  
  val filter: org.scalajs.dom.raw.NodeFilter | Null
  
  def firstChild(): org.scalajs.dom.raw.Node | Null
  
  def lastChild(): org.scalajs.dom.raw.Node | Null
  
  def nextNode(): org.scalajs.dom.raw.Node | Null
  
  def nextSibling(): org.scalajs.dom.raw.Node | Null
  
  def parentNode(): org.scalajs.dom.raw.Node | Null
  
  def previousNode(): org.scalajs.dom.raw.Node | Null
  
  def previousSibling(): org.scalajs.dom.raw.Node | Null
  
  val root: org.scalajs.dom.raw.Node
  
  val whatToShow: Double
}
object TreeWalker {
  
  @scala.inline
  def apply(
    currentNode: org.scalajs.dom.raw.Node,
    firstChild: () => org.scalajs.dom.raw.Node | Null,
    lastChild: () => org.scalajs.dom.raw.Node | Null,
    nextNode: () => org.scalajs.dom.raw.Node | Null,
    nextSibling: () => org.scalajs.dom.raw.Node | Null,
    parentNode: () => org.scalajs.dom.raw.Node | Null,
    previousNode: () => org.scalajs.dom.raw.Node | Null,
    previousSibling: () => org.scalajs.dom.raw.Node | Null,
    root: org.scalajs.dom.raw.Node,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[TreeWalker]
  }
  
  @scala.inline
  implicit class TreeWalkerMutableBuilder[Self <: TreeWalker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentNode(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: org.scalajs.dom.raw.NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setFirstChild(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "firstChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastChild(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "lastChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextNode(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextSibling(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "nextSibling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParentNode(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "parentNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousNode(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousSibling(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "previousSibling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
