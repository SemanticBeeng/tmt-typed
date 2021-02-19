package tmttyped.node.dnsMod

import tmttyped.node.anon.FnCallHostnameOptions
import tmttyped.node.anon.FnCallHostnameRrtype
import tmttyped.node.anon.Hostname
import tmttyped.node.nodeStrings.A
import tmttyped.node.nodeStrings.AAAA
import tmttyped.node.nodeStrings.ANY
import tmttyped.node.nodeStrings.CNAME
import tmttyped.node.nodeStrings.MX
import tmttyped.node.nodeStrings.NAPTR
import tmttyped.node.nodeStrings.NS
import tmttyped.node.nodeStrings.PTR
import tmttyped.node.nodeStrings.SOA
import tmttyped.node.nodeStrings.SRV
import tmttyped.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promises {
  
  @JSImport("dns", "promises.Resolver")
  @js.native
  class Resolver () extends StObject {
    def this(options: ResolverOptions) = this()
    
    def cancel(): Unit = js.native
    
    def getServers(): js.Array[String] = js.native
    @JSName("getServers")
    var getServers_Original: js.Function0[js.Array[String]] = js.native
    
    def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    @JSName("resolve4")
    var resolve4_Original: FnCallHostnameOptions = js.native
    
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    @JSName("resolve6")
    var resolve6_Original: FnCallHostnameOptions = js.native
    
    def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolveAny")
    var resolveAny_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[AnyRecord]]] = js.native
    
    def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
    @JSName("resolveCname")
    var resolveCname_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    
    def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolveMx")
    var resolveMx_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[MxRecord]]] = js.native
    
    def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolveNaptr")
    var resolveNaptr_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[NaptrRecord]]] = js.native
    
    def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
    @JSName("resolveNs")
    var resolveNs_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    
    def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
    @JSName("resolvePtr")
    var resolvePtr_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    
    def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
    @JSName("resolveSoa")
    var resolveSoa_Original: js.Function1[/* hostname */ String, js.Promise[SoaRecord]] = js.native
    
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolveSrv")
    var resolveSrv_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[SrvRecord]]] = js.native
    
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
    @JSName("resolveTxt")
    var resolveTxt_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[js.Array[String]]]] = js.native
    
    @JSName("resolve")
    def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    var resolve_Original: FnCallHostnameRrtype = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
    
    def reverse(ip: String): js.Promise[js.Array[String]] = js.native
    @JSName("reverse")
    var reverse_Original: js.Function1[/* ip */ String, js.Promise[js.Array[String]]] = js.native
    
    def setLocalAddress(): Unit = js.native
    def setLocalAddress(ipv4: js.UndefOr[scala.Nothing], ipv6: String): Unit = js.native
    def setLocalAddress(ipv4: String): Unit = js.native
    def setLocalAddress(ipv4: String, ipv6: String): Unit = js.native
    
    def setServers(servers: js.Array[String]): Unit = js.native
    @JSName("setServers")
    var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
  }
  
  @JSImport("dns", "promises.getServers")
  @js.native
  def getServers(): js.Array[String] = js.native
  
  @JSImport("dns", "promises.lookup")
  @js.native
  def lookup(hostname: String): js.Promise[LookupAddress] = js.native
  @JSImport("dns", "promises.lookup")
  @js.native
  def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
  @JSImport("dns", "promises.lookup")
  @js.native
  def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  @JSImport("dns", "promises.lookup")
  @js.native
  def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  @JSImport("dns", "promises.lookup")
  @js.native
  def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
  
  @JSImport("dns", "promises.lookupService")
  @js.native
  def lookupService(address: String, port: Double): js.Promise[Hostname] = js.native
  
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  
  @JSImport("dns", "promises.resolve4")
  @js.native
  def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve4")
  @js.native
  def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  @JSImport("dns", "promises.resolve4")
  @js.native
  def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  
  @JSImport("dns", "promises.resolve6")
  @js.native
  def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve6")
  @js.native
  def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  @JSImport("dns", "promises.resolve6")
  @js.native
  def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  
  @JSImport("dns", "promises.resolveAny")
  @js.native
  def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
  
  @JSImport("dns", "promises.resolveCname")
  @js.native
  def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("dns", "promises.resolveMx")
  @js.native
  def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
  
  @JSImport("dns", "promises.resolveNaptr")
  @js.native
  def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
  
  @JSImport("dns", "promises.resolveNs")
  @js.native
  def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("dns", "promises.resolvePtr")
  @js.native
  def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("dns", "promises.resolveSoa")
  @js.native
  def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
  
  @JSImport("dns", "promises.resolveSrv")
  @js.native
  def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
  
  @JSImport("dns", "promises.resolveTxt")
  @js.native
  def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
  
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSImport("dns", "promises.resolve")
  @js.native
  def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
  
  @JSImport("dns", "promises.reverse")
  @js.native
  def reverse(ip: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("dns", "promises.setServers")
  @js.native
  def setServers(servers: js.Array[String]): Unit = js.native
}
