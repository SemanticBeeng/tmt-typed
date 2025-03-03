package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since v15.14.0
  */
@JSImport("net", "SocketAddress")
@js.native
class SocketAddress protected () extends StObject {
  def this(options: SocketAddressInitOptions) = this()
  
  /**
    * Either \`'ipv4'\` or \`'ipv6'\`.
    * @since v15.14.0
    */
  val address: String = js.native
  
  /**
    * Either \`'ipv4'\` or \`'ipv6'\`.
    * @since v15.14.0
    */
  val family: IPVersion = js.native
  
  /**
    * @since v15.14.0
    */
  val flowlabel: Double = js.native
  
  /**
    * @since v15.14.0
    */
  val port: Double = js.native
}
