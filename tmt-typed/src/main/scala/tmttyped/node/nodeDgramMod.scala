package tmttyped.node

import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.dgramMod.RemoteInfo
import tmttyped.node.dgramMod.SocketOptions
import tmttyped.node.dgramMod.SocketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDgramMod {
  
  @JSImport("node:dgram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Encapsulates the datagram functionality.
    *
    * New instances of `dgram.Socket` are created using {@link createSocket}.
    * The `new` keyword is not to be used to create `dgram.Socket` instances.
    * @since v0.1.99
    */
  @JSImport("node:dgram", "Socket")
  @js.native
  class Socket () extends StObject
  
  @scala.inline
  def createSocket(options: SocketOptions): tmttyped.node.dgramMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.dgramMod.Socket]
  @scala.inline
  def createSocket(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): tmttyped.node.dgramMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.dgramMod.Socket]
  /**
    * Creates a `dgram.Socket` object. Once the socket is created, calling `socket.bind()` will instruct the socket to begin listening for datagram
    * messages. When `address` and `port` are not passed to `socket.bind()` the
    * method will bind the socket to the "all interfaces" address on a random port
    * (it does the right thing for both `udp4` and `udp6` sockets). The bound address
    * and port can be retrieved using `socket.address().address` and `socket.address().port`.
    *
    * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.close()` on the socket:
    *
    * ```js
    * const controller = new AbortController();
    * const { signal } = controller;
    * const server = dgram.createSocket({ type: 'udp4', signal });
    * server.on('message', (msg, rinfo) => {
    *   console.log(`server got: ${msg} from ${rinfo.address}:${rinfo.port}`);
    * });
    * // Later, when you want to close the server.
    * controller.abort();
    * ```
    * @since v0.11.13
    * @param options Available options are:
    * @param callback Attached as a listener for `'message'` events. Optional.
    */
  @scala.inline
  def createSocket(`type`: SocketType): tmttyped.node.dgramMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.dgramMod.Socket]
  @scala.inline
  def createSocket(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): tmttyped.node.dgramMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.dgramMod.Socket]
}
