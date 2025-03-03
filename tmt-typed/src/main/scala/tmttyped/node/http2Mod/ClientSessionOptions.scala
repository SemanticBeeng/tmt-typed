package tmttyped.node.http2Mod

import tmttyped.node.nodeStreamMod.Duplex
import tmttyped.node.nodeStrings.httpColon
import tmttyped.node.nodeStrings.httpsColon
import tmttyped.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionOptions
  extends StObject
     with SessionOptions {
  
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL, /* option */ SessionOptions, Duplex]] = js.undefined
  
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[httpColon | httpsColon] = js.undefined
}
object ClientSessionOptions {
  
  @scala.inline
  def apply(): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionOptions]
  }
  
  @scala.inline
  implicit class ClientSessionOptionsMutableBuilder[Self <: ClientSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateConnection(value: (/* authority */ URL, /* option */ SessionOptions) => Duplex): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
    
    @scala.inline
    def setMaxReservedRemoteStreams(value: Double): Self = StObject.set(x, "maxReservedRemoteStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReservedRemoteStreamsUndefined: Self = StObject.set(x, "maxReservedRemoteStreams", js.undefined)
    
    @scala.inline
    def setProtocol(value: httpColon | httpsColon): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
