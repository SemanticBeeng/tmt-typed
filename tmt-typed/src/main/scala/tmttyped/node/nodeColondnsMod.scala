package tmttyped.node

import tmttyped.node.anon.Hostname
import tmttyped.node.dnsMod.AnyRecord
import tmttyped.node.dnsMod.CaaRecord
import tmttyped.node.dnsMod.LookupAddress
import tmttyped.node.dnsMod.LookupAllOptions
import tmttyped.node.dnsMod.LookupOneOptions
import tmttyped.node.dnsMod.LookupOptions
import tmttyped.node.dnsMod.MxRecord
import tmttyped.node.dnsMod.NaptrRecord
import tmttyped.node.dnsMod.RecordWithTtl
import tmttyped.node.dnsMod.ResolveOptions
import tmttyped.node.dnsMod.ResolveWithTtlOptions
import tmttyped.node.dnsMod.ResolverOptions
import tmttyped.node.dnsMod.SoaRecord
import tmttyped.node.dnsMod.SrvRecord
import tmttyped.node.nodeStrings.A
import tmttyped.node.nodeStrings.AAAA
import tmttyped.node.nodeStrings.ANY
import tmttyped.node.nodeStrings.CAA
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

object nodeColondnsMod {
  
  @JSImport("node:dns/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:dns/promises", "Resolver")
  @js.native
  class Resolver ()
    extends tmttyped.node.promisesMod.Resolver {
    def this(options: ResolverOptions) = this()
  }
  
  /**
    * Returns an array of IP address strings, formatted according to [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6),
    * that are currently configured for DNS resolution. A string will include a port
    * section if a custom port is used.
    *
    * ```js
    * [
    *   '4.4.4.4',
    *   '2001:4860:4860::8888',
    *   '4.4.4.4:1053',
    *   '[2001:4860:4860::8888]:1053',
    * ]
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def getServers(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def lookup(hostname: java.lang.String): js.Promise[LookupAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LookupAddress]]
  /**
    * Resolves a host name (e.g. `'nodejs.org'`) into the first found A (IPv4) or
    * AAAA (IPv6) record. All `option` properties are optional. If `options` is an
    * integer, then it must be `4` or `6` – if `options` is not provided, then IPv4
    * and IPv6 addresses are both returned if found.
    *
    * With the `all` option set to `true`, the `Promise` is resolved with `addresses`being an array of objects with the properties `address` and `family`.
    *
    * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
    * Keep in mind that `err.code` will be set to `'ENOTFOUND'` not only when
    * the host name does not exist but also when the lookup fails in other ways
    * such as no available file descriptors.
    *
    * `dnsPromises.lookup()` does not necessarily have anything to do with the DNS
    * protocol. The implementation uses an operating system facility that can
    * associate names with addresses, and vice versa. This implementation can have
    * subtle but important consequences on the behavior of any Node.js program. Please
    * take some time to consult the `Implementation considerations section` before
    * using `dnsPromises.lookup()`.
    *
    * Example usage:
    *
    * ```js
    * const dns = require('dns');
    * const dnsPromises = dns.promises;
    * const options = {
    *   family: 6,
    *   hints: dns.ADDRCONFIG | dns.V4MAPPED,
    * };
    *
    * dnsPromises.lookup('example.com', options).then((result) => {
    *   console.log('address: %j family: IPv%s', result.address, result.family);
    *   // address: "2606:2800:220:1:248:1893:25c8:1946" family: IPv6
    * });
    *
    * // When options.all is true, the result will be an Array.
    * options.all = true;
    * dnsPromises.lookup('example.com', options).then((result) => {
    *   console.log('addresses: %j', result);
    *   // addresses: [{"address":"2606:2800:220:1:248:1893:25c8:1946","family":6}]
    * });
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def lookup(hostname: java.lang.String, family: Double): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
  @scala.inline
  def lookup(hostname: java.lang.String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LookupAddress]]]
  @scala.inline
  def lookup(hostname: java.lang.String, options: LookupOneOptions): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
  @scala.inline
  def lookup(hostname: java.lang.String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress | js.Array[LookupAddress]]]
  
  /**
    * Resolves the given `address` and `port` into a host name and service using
    * the operating system's underlying `getnameinfo` implementation.
    *
    * If `address` is not a valid IP address, a `TypeError` will be thrown.
    * The `port` will be coerced to a number. If it is not a legal port, a `TypeError`will be thrown.
    *
    * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
    *
    * ```js
    * const dnsPromises = require('dns').promises;
    * dnsPromises.lookupService('127.0.0.1', 22).then((result) => {
    *   console.log(result.hostname, result.service);
    *   // Prints: localhost ssh
    * });
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def lookupService(address: java.lang.String, port: Double): js.Promise[Hostname] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hostname]]
  
  /**
    * Uses the DNS protocol to resolve a host name (e.g. `'nodejs.org'`) into an array
    * of the resource records. When successful, the `Promise` is resolved with an
    * array of resource records. The type and structure of individual results vary
    * based on `rrtype`:
    *
    * <omitted>
    *
    * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
    * @since v10.6.0
    * @param hostname Host name to resolve.
    * @param rrtype Resource record type.
    */
  @scala.inline
  def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  @scala.inline
  def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ]]
  
  /**
    * Uses the DNS protocol to resolve IPv4 addresses (`A` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv4
    * addresses (e.g. `['74.125.79.104', '74.125.79.105', '74.125.79.106']`).
    * @since v10.6.0
    * @param hostname Host name to resolve.
    */
  @scala.inline
  def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  @scala.inline
  def resolve4(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | java.lang.String]]]
  @scala.inline
  def resolve4(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
  
  /**
    * Uses the DNS protocol to resolve IPv6 addresses (`AAAA` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv6
    * addresses.
    * @since v10.6.0
    * @param hostname Host name to resolve.
    */
  @scala.inline
  def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  @scala.inline
  def resolve6(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | java.lang.String]]]
  @scala.inline
  def resolve6(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
  
  /**
    * Uses the DNS protocol to resolve all records (also known as `ANY` or `*` query).
    * On success, the `Promise` is resolved with an array containing various types of
    * records. Each object has a property `type` that indicates the type of the
    * current record. And depending on the `type`, additional properties will be
    * present on the object:
    *
    * <omitted>
    *
    * Here is an example of the result object:
    *
    * ```js
    * [ { type: 'A', address: '127.0.0.1', ttl: 299 },
    *   { type: 'CNAME', value: 'example.com' },
    *   { type: 'MX', exchange: 'alt4.aspmx.l.example.com', priority: 50 },
    *   { type: 'NS', value: 'ns1.example.com' },
    *   { type: 'TXT', entries: [ 'v=spf1 include:_spf.example.com ~all' ] },
    *   { type: 'SOA',
    *     nsname: 'ns1.example.com',
    *     hostmaster: 'admin.example.com',
    *     serial: 156696742,
    *     refresh: 900,
    *     retry: 900,
    *     expire: 1800,
    *     minttl: 60 } ]
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def resolveAny(hostname: java.lang.String): js.Promise[js.Array[AnyRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
  
  /**
    * Uses the DNS protocol to resolve `CAA` records for the `hostname`. On success,
    * the `Promise` is resolved with an array of objects containing available
    * certification authority authorization records available for the `hostname`(e.g. `[{critical: 0, iodef: 'mailto:pki@example.com'},{critical: 128, issue: 'pki.example.com'}]`).
    * @since v15.0.0
    */
  @scala.inline
  def resolveCaa(hostname: java.lang.String): js.Promise[js.Array[CaaRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCaa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CaaRecord]]]
  
  /**
    * Uses the DNS protocol to resolve `CNAME` records for the `hostname`. On success,
    * the `Promise` is resolved with an array of canonical name records available for
    * the `hostname` (e.g. `['bar.example.com']`).
    * @since v10.6.0
    */
  @scala.inline
  def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  /**
    * Uses the DNS protocol to resolve mail exchange records (`MX` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects
    * containing both a `priority` and `exchange` property (e.g.`[{priority: 10, exchange: 'mx.example.com'}, ...]`).
    * @since v10.6.0
    */
  @scala.inline
  def resolveMx(hostname: java.lang.String): js.Promise[js.Array[MxRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MxRecord]]]
  
  /**
    * Uses the DNS protocol to resolve regular expression based records (`NAPTR`records) for the `hostname`. On success, the `Promise` is resolved with an array
    * of objects with the following properties:
    *
    * * `flags`
    * * `service`
    * * `regexp`
    * * `replacement`
    * * `order`
    * * `preference`
    *
    * ```js
    * {
    *   flags: 's',
    *   service: 'SIP+D2U',
    *   regexp: '',
    *   replacement: '_sip._udp.example.com',
    *   order: 30,
    *   preference: 100
    * }
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
  
  /**
    * Uses the DNS protocol to resolve name server records (`NS` records) for the`hostname`. On success, the `Promise` is resolved with an array of name server
    * records available for `hostname` (e.g.`['ns1.example.com', 'ns2.example.com']`).
    * @since v10.6.0
    */
  @scala.inline
  def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  /**
    * Uses the DNS protocol to resolve pointer records (`PTR` records) for the`hostname`. On success, the `Promise` is resolved with an array of strings
    * containing the reply records.
    * @since v10.6.0
    */
  @scala.inline
  def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  /**
    * Uses the DNS protocol to resolve a start of authority record (`SOA` record) for
    * the `hostname`. On success, the `Promise` is resolved with an object with the
    * following properties:
    *
    * * `nsname`
    * * `hostmaster`
    * * `serial`
    * * `refresh`
    * * `retry`
    * * `expire`
    * * `minttl`
    *
    * ```js
    * {
    *   nsname: 'ns.example.com',
    *   hostmaster: 'root.example.com',
    *   serial: 2013101809,
    *   refresh: 10000,
    *   retry: 2400,
    *   expire: 604800,
    *   minttl: 3600
    * }
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def resolveSoa(hostname: java.lang.String): js.Promise[SoaRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SoaRecord]]
  
  /**
    * Uses the DNS protocol to resolve service records (`SRV` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects with
    * the following properties:
    *
    * * `priority`
    * * `weight`
    * * `port`
    * * `name`
    *
    * ```js
    * {
    *   priority: 10,
    *   weight: 5,
    *   port: 21223,
    *   name: 'service.example.com'
    * }
    * ```
    * @since v10.6.0
    */
  @scala.inline
  def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[SrvRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
  
  /**
    * Uses the DNS protocol to resolve text queries (`TXT` records) for the`hostname`. On success, the `Promise` is resolved with a two-dimensional array
    * of the text records available for `hostname` (e.g.`[ ['v=spf1 ip4:0.0.0.0 ', '~all' ] ]`). Each sub-array contains TXT chunks of
    * one record. Depending on the use case, these could be either joined together or
    * treated separately.
    * @since v10.6.0
    */
  @scala.inline
  def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Array[java.lang.String]]]]
  
  @scala.inline
  def resolve_A(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def resolve_AAAA(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def resolve_ANY(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
  
  @scala.inline
  def resolve_CAA(hostname: java.lang.String, rrtype: CAA): js.Promise[js.Array[CaaRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CaaRecord]]]
  
  @scala.inline
  def resolve_CNAME(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def resolve_MX(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MxRecord]]]
  
  @scala.inline
  def resolve_NAPTR(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
  
  @scala.inline
  def resolve_NS(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def resolve_PTR(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def resolve_SOA(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SoaRecord]]
  
  @scala.inline
  def resolve_SRV(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
  
  @scala.inline
  def resolve_TXT(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Array[java.lang.String]]]]
  
  /**
    * Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an
    * array of host names.
    *
    * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
    * @since v10.6.0
    */
  @scala.inline
  def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  /**
    * Sets the IP address and port of servers to be used when performing DNS
    * resolution. The `servers` argument is an array of [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6) formatted
    * addresses. If the port is the IANA default DNS port (53) it can be omitted.
    *
    * ```js
    * dnsPromises.setServers([
    *   '4.4.4.4',
    *   '[2001:4860:4860::8888]',
    *   '4.4.4.4:1053',
    *   '[2001:4860:4860::8888]:1053',
    * ]);
    * ```
    *
    * An error will be thrown if an invalid address is provided.
    *
    * The `dnsPromises.setServers()` method must not be called while a DNS query is in
    * progress.
    *
    * This method works much like[resolve.conf](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
    * That is, if attempting to resolve with the first server provided results in a`NOTFOUND` error, the `resolve()` method will _not_ attempt to resolve with
    * subsequent servers provided. Fallback DNS servers will only be used if the
    * earlier ones time out or result in some other error.
    * @since v10.6.0
    * @param servers array of `RFC 5952` formatted addresses
    */
  @scala.inline
  def setServers(servers: js.Array[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
