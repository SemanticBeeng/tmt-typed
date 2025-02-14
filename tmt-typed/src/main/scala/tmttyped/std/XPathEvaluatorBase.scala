package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPathEvaluatorBase extends StObject {
  
  def createExpression(expression: java.lang.String): XPathExpression = js.native
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  
  def createNSResolver(nodeResolver: org.scalajs.dom.raw.Node): XPathNSResolver = js.native
  
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.raw.Node): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Null,
    `type`: Double
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Null,
    `type`: Double,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Null,
    `type`: Unit,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Unit,
    `type`: Double
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Unit,
    `type`: Double,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Unit,
    `type`: Unit,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.raw.Node, resolver: XPathNSResolver): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: XPathNSResolver,
    `type`: Double
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: XPathNSResolver,
    `type`: Unit,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
}
