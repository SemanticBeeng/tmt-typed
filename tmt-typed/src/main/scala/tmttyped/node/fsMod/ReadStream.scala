package tmttyped.node.fsMod

import tmttyped.node.Buffer
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.nodeStrings.ready
import tmttyped.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "ReadStream")
@js.native
class ReadStream () extends Readable {
  def this(opts: ReadableOptions) = this()
  
  @JSName("addListener")
  def addListener_open(event: tmttyped.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  var bytesRead: Double = js.native
  
  def close(): Unit = js.native
  
  @JSName("on")
  def on_open(event: tmttyped.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_open(event: tmttyped.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  var path: String | Buffer = js.native
  
  var pending: Boolean = js.native
  
  @JSName("prependListener")
  def prependListener_open(event: tmttyped.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_open(event: tmttyped.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
}
