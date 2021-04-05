package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.nodeBooleans.`false`
import tmttyped.node.nodeBooleans.`true`
import tmttyped.node.querystringMod.ParsedUrlQuery
import tmttyped.node.querystringMod.ParsedUrlQueryInput
import tmttyped.std.Iterable
import tmttyped.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("url", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
    def this(init: java.lang.String) = this()
    def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: js.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: Dict[java.lang.String | js.Array[java.lang.String]]) = this()
    def this(init: URLSearchParams) = this()
    
    def append(name: java.lang.String, value: java.lang.String): Unit = js.native
    
    def delete(name: java.lang.String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
    
    def forEach(
      callback: js.Function3[
          /* value */ java.lang.String, 
          /* name */ java.lang.String, 
          /* searchParams */ this.type, 
          Unit
        ]
    ): Unit = js.native
    
    def get(name: java.lang.String): java.lang.String | Null = js.native
    
    def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
    
    def has(name: java.lang.String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
    
    def keys(): IterableIterator[java.lang.String] = js.native
    
    def set(name: java.lang.String, value: java.lang.String): Unit = js.native
    
    def sort(): Unit = js.native
    
    def values(): IterableIterator[java.lang.String] = js.native
  }
  
  @JSImport("url", "URL")
  @js.native
  class URL_ protected () extends StObject {
    def this(input: java.lang.String) = this()
    def this(input: java.lang.String, base: java.lang.String) = this()
    def this(input: java.lang.String, base: URL_) = this()
    
    var hash: java.lang.String = js.native
    
    var host: java.lang.String = js.native
    
    var hostname: java.lang.String = js.native
    
    var href: java.lang.String = js.native
    
    val origin: java.lang.String = js.native
    
    var password: java.lang.String = js.native
    
    var pathname: java.lang.String = js.native
    
    var port: java.lang.String = js.native
    
    var protocol: java.lang.String = js.native
    
    var search: java.lang.String = js.native
    
    val searchParams: URLSearchParams = js.native
    
    def toJSON(): java.lang.String = js.native
    
    var username: java.lang.String = js.native
  }
  
  @scala.inline
  def domainToASCII(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def domainToUnicode(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  @scala.inline
  def fileURLToPath(url: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def fileURLToPath(url: URL_): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def format(URL: URL_): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def format(URL: URL_, options: URLFormatOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(urlObject: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def format(urlObject: UrlObject): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def parse(urlStr: java.lang.String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
  @scala.inline
  def parse(urlStr: java.lang.String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def parse(urlStr: java.lang.String, parseQueryString: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[Url]
  @scala.inline
  def parse(urlStr: java.lang.String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url]
  
  @scala.inline
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  @scala.inline
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  @scala.inline
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  @scala.inline
  def pathToFileURL(url: java.lang.String): URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToFileURL")(url.asInstanceOf[js.Any]).asInstanceOf[URL_]
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  trait URLFormatOptions extends StObject {
    
    var auth: js.UndefOr[Boolean] = js.undefined
    
    var fragment: js.UndefOr[Boolean] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object URLFormatOptions {
    
    @scala.inline
    def apply(): URLFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLFormatOptions]
    }
    
    @scala.inline
    implicit class URLFormatOptionsMutableBuilder[Self <: URLFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      @scala.inline
      def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
  
  // Output of `url.parse`
  trait Url extends StObject {
    
    var auth: java.lang.String | Null
    
    var hash: java.lang.String | Null
    
    var host: java.lang.String | Null
    
    var hostname: java.lang.String | Null
    
    var href: java.lang.String
    
    var path: java.lang.String | Null
    
    var pathname: java.lang.String | Null
    
    var port: java.lang.String | Null
    
    var protocol: java.lang.String | Null
    
    var query: java.lang.String | Null | ParsedUrlQuery
    
    var search: java.lang.String | Null
    
    var slashes: Boolean | Null
  }
  object Url {
    
    @scala.inline
    def apply(href: java.lang.String): Url = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPort(value: java.lang.String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setQuery(value: java.lang.String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesNull: Self = StObject.set(x, "slashes", null)
    }
  }
  
  // Input to `url.format`
  trait UrlObject extends StObject {
    
    var auth: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var hash: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var host: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var hostname: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var href: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var pathname: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var port: js.UndefOr[java.lang.String | Double | Null] = js.undefined
    
    var protocol: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var query: js.UndefOr[java.lang.String | Null | ParsedUrlQueryInput] = js.undefined
    
    var search: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var slashes: js.UndefOr[Boolean | Null] = js.undefined
  }
  object UrlObject {
    
    @scala.inline
    def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    @scala.inline
    implicit class UrlObjectMutableBuilder[Self <: UrlObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefNull: Self = StObject.set(x, "href", null)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setPort(value: java.lang.String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: java.lang.String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesNull: Self = StObject.set(x, "slashes", null)
      
      @scala.inline
      def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  trait UrlWithParsedQuery extends Url {
    
    @JSName("query")
    var query_UrlWithParsedQuery: ParsedUrlQuery
  }
  object UrlWithParsedQuery {
    
    @scala.inline
    def apply(href: java.lang.String, query: ParsedUrlQuery): UrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, search = null, slashes = null)
      __obj.asInstanceOf[UrlWithParsedQuery]
    }
    
    @scala.inline
    implicit class UrlWithParsedQueryMutableBuilder[Self <: UrlWithParsedQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlWithStringQuery extends Url {
    
    @JSName("query")
    var query_UrlWithStringQuery: java.lang.String | Null
  }
  object UrlWithStringQuery {
    
    @scala.inline
    def apply(href: java.lang.String): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    @scala.inline
    implicit class UrlWithStringQueryMutableBuilder[Self <: UrlWithStringQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: java.lang.String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
}
