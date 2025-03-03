package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDiagnosticsChannelMod {
  
  @JSImport("node:diagnostics_channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The class `Channel` represents an individual named channel within the data
    * pipeline. It is use to track subscribers and to publish messages when there
    * are subscribers present. It exists as a separate object to avoid channel
    * lookups at publish time, enabling very fast publish speeds and allowing
    * for heavy use while incurring very minimal cost. Channels are created with {@link channel}, constructing a channel directly
    * with `new Channel(name)` is not supported.
    */
  @JSImport("node:diagnostics_channel", "Channel")
  @js.native
  class Channel_ protected ()
    extends tmttyped.node.diagnosticsChannelMod.Channel_ {
    protected def this(name: java.lang.String) = this()
  }
  
  /**
    * This is the primary entry-point for anyone wanting to interact with a named
    * channel. It produces a channel object which is optimized to reduce overhead at
    * publish time as much as possible.
    *
    * ```js
    * const diagnostics_channel = require('diagnostics_channel');
    *
    * const channel = diagnostics_channel.channel('my-channel');
    * ```
    * @param name The channel name
    * @return The named channel object
    */
  @scala.inline
  def channel(name: java.lang.String): tmttyped.node.diagnosticsChannelMod.Channel_ = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(name.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.diagnosticsChannelMod.Channel_]
  
  /**
    * Check if there are active subscribers to the named channel. This is helpful if
    * the message you want to send might be expensive to prepare.
    *
    * This API is optional but helpful when trying to publish messages from very
    * performance-sensitive code.
    *
    * ```js
    * const diagnostics_channel = require('diagnostics_channel');
    *
    * if (diagnostics_channel.hasSubscribers('my-channel')) {
    *   // There are subscribers, prepare and publish message
    * }
    * ```
    * @param name The channel name
    * @return If there are active subscribers
    */
  @scala.inline
  def hasSubscribers(name: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSubscribers")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
