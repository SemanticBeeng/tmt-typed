package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.anon.Idle
import tmttyped.node.anon.`2`
import tmttyped.node.anon.`4`
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.nodeStrings.BE
import tmttyped.node.nodeStrings.IPv4
import tmttyped.node.nodeStrings.IPv6
import tmttyped.node.nodeStrings.LE
import tmttyped.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osMod {
  
  @JSImport("os", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("os", "EOL")
  @js.native
  val EOL: java.lang.String = js.native
  
  /**
    * Returns the operating system CPU architecture for which the Node.js binary was
    * compiled. Possible values are `'arm'`, `'arm64'`, `'ia32'`, `'mips'`,`'mipsel'`, `'ppc'`, `'ppc64'`, `'s390'`, `'s390x'`, `'x32'`, and `'x64'`.
    *
    * The return value is equivalent to `process.arch`.
    * @since v0.5.0
    */
  @scala.inline
  def arch(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("arch")().asInstanceOf[java.lang.String]
  
  object constants {
    
    @JSImport("os", "constants.UV_UDP_REUSEADDR")
    @js.native
    val UV_UDP_REUSEADDR: Double = js.native
    
    object errno {
      
      @JSImport("os", "constants.errno.E2BIG")
      @js.native
      val E2BIG: Double = js.native
      
      @JSImport("os", "constants.errno.EACCES")
      @js.native
      val EACCES: Double = js.native
      
      @JSImport("os", "constants.errno.EADDRINUSE")
      @js.native
      val EADDRINUSE: Double = js.native
      
      @JSImport("os", "constants.errno.EADDRNOTAVAIL")
      @js.native
      val EADDRNOTAVAIL: Double = js.native
      
      @JSImport("os", "constants.errno.EAFNOSUPPORT")
      @js.native
      val EAFNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.EAGAIN")
      @js.native
      val EAGAIN: Double = js.native
      
      @JSImport("os", "constants.errno.EALREADY")
      @js.native
      val EALREADY: Double = js.native
      
      @JSImport("os", "constants.errno.EBADF")
      @js.native
      val EBADF: Double = js.native
      
      @JSImport("os", "constants.errno.EBADMSG")
      @js.native
      val EBADMSG: Double = js.native
      
      @JSImport("os", "constants.errno.EBUSY")
      @js.native
      val EBUSY: Double = js.native
      
      @JSImport("os", "constants.errno.ECANCELED")
      @js.native
      val ECANCELED: Double = js.native
      
      @JSImport("os", "constants.errno.ECHILD")
      @js.native
      val ECHILD: Double = js.native
      
      @JSImport("os", "constants.errno.ECONNABORTED")
      @js.native
      val ECONNABORTED: Double = js.native
      
      @JSImport("os", "constants.errno.ECONNREFUSED")
      @js.native
      val ECONNREFUSED: Double = js.native
      
      @JSImport("os", "constants.errno.ECONNRESET")
      @js.native
      val ECONNRESET: Double = js.native
      
      @JSImport("os", "constants.errno.EDEADLK")
      @js.native
      val EDEADLK: Double = js.native
      
      @JSImport("os", "constants.errno.EDESTADDRREQ")
      @js.native
      val EDESTADDRREQ: Double = js.native
      
      @JSImport("os", "constants.errno.EDOM")
      @js.native
      val EDOM: Double = js.native
      
      @JSImport("os", "constants.errno.EDQUOT")
      @js.native
      val EDQUOT: Double = js.native
      
      @JSImport("os", "constants.errno.EEXIST")
      @js.native
      val EEXIST: Double = js.native
      
      @JSImport("os", "constants.errno.EFAULT")
      @js.native
      val EFAULT: Double = js.native
      
      @JSImport("os", "constants.errno.EFBIG")
      @js.native
      val EFBIG: Double = js.native
      
      @JSImport("os", "constants.errno.EHOSTUNREACH")
      @js.native
      val EHOSTUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.EIDRM")
      @js.native
      val EIDRM: Double = js.native
      
      @JSImport("os", "constants.errno.EILSEQ")
      @js.native
      val EILSEQ: Double = js.native
      
      @JSImport("os", "constants.errno.EINPROGRESS")
      @js.native
      val EINPROGRESS: Double = js.native
      
      @JSImport("os", "constants.errno.EINTR")
      @js.native
      val EINTR: Double = js.native
      
      @JSImport("os", "constants.errno.EINVAL")
      @js.native
      val EINVAL: Double = js.native
      
      @JSImport("os", "constants.errno.EIO")
      @js.native
      val EIO: Double = js.native
      
      @JSImport("os", "constants.errno.EISCONN")
      @js.native
      val EISCONN: Double = js.native
      
      @JSImport("os", "constants.errno.EISDIR")
      @js.native
      val EISDIR: Double = js.native
      
      @JSImport("os", "constants.errno.ELOOP")
      @js.native
      val ELOOP: Double = js.native
      
      @JSImport("os", "constants.errno.EMFILE")
      @js.native
      val EMFILE: Double = js.native
      
      @JSImport("os", "constants.errno.EMLINK")
      @js.native
      val EMLINK: Double = js.native
      
      @JSImport("os", "constants.errno.EMSGSIZE")
      @js.native
      val EMSGSIZE: Double = js.native
      
      @JSImport("os", "constants.errno.EMULTIHOP")
      @js.native
      val EMULTIHOP: Double = js.native
      
      @JSImport("os", "constants.errno.ENAMETOOLONG")
      @js.native
      val ENAMETOOLONG: Double = js.native
      
      @JSImport("os", "constants.errno.ENETDOWN")
      @js.native
      val ENETDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.ENETRESET")
      @js.native
      val ENETRESET: Double = js.native
      
      @JSImport("os", "constants.errno.ENETUNREACH")
      @js.native
      val ENETUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.ENFILE")
      @js.native
      val ENFILE: Double = js.native
      
      @JSImport("os", "constants.errno.ENOBUFS")
      @js.native
      val ENOBUFS: Double = js.native
      
      @JSImport("os", "constants.errno.ENODATA")
      @js.native
      val ENODATA: Double = js.native
      
      @JSImport("os", "constants.errno.ENODEV")
      @js.native
      val ENODEV: Double = js.native
      
      @JSImport("os", "constants.errno.ENOENT")
      @js.native
      val ENOENT: Double = js.native
      
      @JSImport("os", "constants.errno.ENOEXEC")
      @js.native
      val ENOEXEC: Double = js.native
      
      @JSImport("os", "constants.errno.ENOLCK")
      @js.native
      val ENOLCK: Double = js.native
      
      @JSImport("os", "constants.errno.ENOLINK")
      @js.native
      val ENOLINK: Double = js.native
      
      @JSImport("os", "constants.errno.ENOMEM")
      @js.native
      val ENOMEM: Double = js.native
      
      @JSImport("os", "constants.errno.ENOMSG")
      @js.native
      val ENOMSG: Double = js.native
      
      @JSImport("os", "constants.errno.ENOPROTOOPT")
      @js.native
      val ENOPROTOOPT: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSPC")
      @js.native
      val ENOSPC: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSR")
      @js.native
      val ENOSR: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSTR")
      @js.native
      val ENOSTR: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSYS")
      @js.native
      val ENOSYS: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTCONN")
      @js.native
      val ENOTCONN: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTDIR")
      @js.native
      val ENOTDIR: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTEMPTY")
      @js.native
      val ENOTEMPTY: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTSOCK")
      @js.native
      val ENOTSOCK: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTSUP")
      @js.native
      val ENOTSUP: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTTY")
      @js.native
      val ENOTTY: Double = js.native
      
      @JSImport("os", "constants.errno.ENXIO")
      @js.native
      val ENXIO: Double = js.native
      
      @JSImport("os", "constants.errno.EOPNOTSUPP")
      @js.native
      val EOPNOTSUPP: Double = js.native
      
      @JSImport("os", "constants.errno.EOVERFLOW")
      @js.native
      val EOVERFLOW: Double = js.native
      
      @JSImport("os", "constants.errno.EPERM")
      @js.native
      val EPERM: Double = js.native
      
      @JSImport("os", "constants.errno.EPIPE")
      @js.native
      val EPIPE: Double = js.native
      
      @JSImport("os", "constants.errno.EPROTO")
      @js.native
      val EPROTO: Double = js.native
      
      @JSImport("os", "constants.errno.EPROTONOSUPPORT")
      @js.native
      val EPROTONOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.EPROTOTYPE")
      @js.native
      val EPROTOTYPE: Double = js.native
      
      @JSImport("os", "constants.errno.ERANGE")
      @js.native
      val ERANGE: Double = js.native
      
      @JSImport("os", "constants.errno.EROFS")
      @js.native
      val EROFS: Double = js.native
      
      @JSImport("os", "constants.errno.ESPIPE")
      @js.native
      val ESPIPE: Double = js.native
      
      @JSImport("os", "constants.errno.ESRCH")
      @js.native
      val ESRCH: Double = js.native
      
      @JSImport("os", "constants.errno.ESTALE")
      @js.native
      val ESTALE: Double = js.native
      
      @JSImport("os", "constants.errno.ETIME")
      @js.native
      val ETIME: Double = js.native
      
      @JSImport("os", "constants.errno.ETIMEDOUT")
      @js.native
      val ETIMEDOUT: Double = js.native
      
      @JSImport("os", "constants.errno.ETXTBSY")
      @js.native
      val ETXTBSY: Double = js.native
      
      @JSImport("os", "constants.errno.EWOULDBLOCK")
      @js.native
      val EWOULDBLOCK: Double = js.native
      
      @JSImport("os", "constants.errno.EXDEV")
      @js.native
      val EXDEV: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEACCES")
      @js.native
      val WSAEACCES: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEADDRINUSE")
      @js.native
      val WSAEADDRINUSE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEADDRNOTAVAIL")
      @js.native
      val WSAEADDRNOTAVAIL: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEAFNOSUPPORT")
      @js.native
      val WSAEAFNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEALREADY")
      @js.native
      val WSAEALREADY: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEBADF")
      @js.native
      val WSAEBADF: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECANCELLED")
      @js.native
      val WSAECANCELLED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECONNABORTED")
      @js.native
      val WSAECONNABORTED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECONNREFUSED")
      @js.native
      val WSAECONNREFUSED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECONNRESET")
      @js.native
      val WSAECONNRESET: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEDESTADDRREQ")
      @js.native
      val WSAEDESTADDRREQ: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEDISCON")
      @js.native
      val WSAEDISCON: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEDQUOT")
      @js.native
      val WSAEDQUOT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEFAULT")
      @js.native
      val WSAEFAULT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEHOSTDOWN")
      @js.native
      val WSAEHOSTDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEHOSTUNREACH")
      @js.native
      val WSAEHOSTUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINPROGRESS")
      @js.native
      val WSAEINPROGRESS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINTR")
      @js.native
      val WSAEINTR: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINVAL")
      @js.native
      val WSAEINVAL: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINVALIDPROCTABLE")
      @js.native
      val WSAEINVALIDPROCTABLE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINVALIDPROVIDER")
      @js.native
      val WSAEINVALIDPROVIDER: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEISCONN")
      @js.native
      val WSAEISCONN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAELOOP")
      @js.native
      val WSAELOOP: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEMFILE")
      @js.native
      val WSAEMFILE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEMSGSIZE")
      @js.native
      val WSAEMSGSIZE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENAMETOOLONG")
      @js.native
      val WSAENAMETOOLONG: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENETDOWN")
      @js.native
      val WSAENETDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENETRESET")
      @js.native
      val WSAENETRESET: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENETUNREACH")
      @js.native
      val WSAENETUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOBUFS")
      @js.native
      val WSAENOBUFS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOMORE")
      @js.native
      val WSAENOMORE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOPROTOOPT")
      @js.native
      val WSAENOPROTOOPT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOTCONN")
      @js.native
      val WSAENOTCONN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOTEMPTY")
      @js.native
      val WSAENOTEMPTY: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOTSOCK")
      @js.native
      val WSAENOTSOCK: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEOPNOTSUPP")
      @js.native
      val WSAEOPNOTSUPP: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPFNOSUPPORT")
      @js.native
      val WSAEPFNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROCLIM")
      @js.native
      val WSAEPROCLIM: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROTONOSUPPORT")
      @js.native
      val WSAEPROTONOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROTOTYPE")
      @js.native
      val WSAEPROTOTYPE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROVIDERFAILEDINIT")
      @js.native
      val WSAEPROVIDERFAILEDINIT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEREFUSED")
      @js.native
      val WSAEREFUSED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEREMOTE")
      @js.native
      val WSAEREMOTE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAESHUTDOWN")
      @js.native
      val WSAESHUTDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAESOCKTNOSUPPORT")
      @js.native
      val WSAESOCKTNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAESTALE")
      @js.native
      val WSAESTALE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAETIMEDOUT")
      @js.native
      val WSAETIMEDOUT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAETOOMANYREFS")
      @js.native
      val WSAETOOMANYREFS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEUSERS")
      @js.native
      val WSAEUSERS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEWOULDBLOCK")
      @js.native
      val WSAEWOULDBLOCK: Double = js.native
      
      @JSImport("os", "constants.errno.WSANOTINITIALISED")
      @js.native
      val WSANOTINITIALISED: Double = js.native
      
      @JSImport("os", "constants.errno.WSASERVICE_NOT_FOUND")
      @js.native
      val WSASERVICE_NOT_FOUND: Double = js.native
      
      @JSImport("os", "constants.errno.WSASYSCALLFAILURE")
      @js.native
      val WSASYSCALLFAILURE: Double = js.native
      
      @JSImport("os", "constants.errno.WSASYSNOTREADY")
      @js.native
      val WSASYSNOTREADY: Double = js.native
      
      @JSImport("os", "constants.errno.WSATYPE_NOT_FOUND")
      @js.native
      val WSATYPE_NOT_FOUND: Double = js.native
      
      @JSImport("os", "constants.errno.WSAVERNOTSUPPORTED")
      @js.native
      val WSAVERNOTSUPPORTED: Double = js.native
      
      @JSImport("os", "constants.errno.WSA_E_CANCELLED")
      @js.native
      val WSA_E_CANCELLED: Double = js.native
      
      @JSImport("os", "constants.errno.WSA_E_NO_MORE")
      @js.native
      val WSA_E_NO_MORE: Double = js.native
    }
    
    object priority {
      
      @JSImport("os", "constants.priority.PRIORITY_ABOVE_NORMAL")
      @js.native
      val PRIORITY_ABOVE_NORMAL: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_BELOW_NORMAL")
      @js.native
      val PRIORITY_BELOW_NORMAL: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_HIGH")
      @js.native
      val PRIORITY_HIGH: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_HIGHEST")
      @js.native
      val PRIORITY_HIGHEST: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_LOW")
      @js.native
      val PRIORITY_LOW: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_NORMAL")
      @js.native
      val PRIORITY_NORMAL: Double = js.native
    }
    
    @JSImport("os", "constants.signals")
    @js.native
    val signals: SignalConstants = js.native
  }
  
  /**
    * Returns an array of objects containing information about each logical CPU core.
    *
    * The properties included on each object include:
    *
    * ```js
    * [
    *   {
    *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
    *     speed: 2926,
    *     times: {
    *       user: 252020,
    *       nice: 0,
    *       sys: 30340,
    *       idle: 1070356870,
    *       irq: 0
    *     }
    *   },
    *   {
    *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
    *     speed: 2926,
    *     times: {
    *       user: 306960,
    *       nice: 0,
    *       sys: 26980,
    *       idle: 1071569080,
    *       irq: 0
    *     }
    *   },
    *   {
    *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
    *     speed: 2926,
    *     times: {
    *       user: 248450,
    *       nice: 0,
    *       sys: 21750,
    *       idle: 1070919370,
    *       irq: 0
    *     }
    *   },
    *   {
    *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
    *     speed: 2926,
    *     times: {
    *       user: 256880,
    *       nice: 0,
    *       sys: 19430,
    *       idle: 1070905480,
    *       irq: 20
    *     }
    *   },
    * ]
    * ```
    *
    * `nice` values are POSIX-only. On Windows, the `nice` values of all processors
    * are always 0.
    * @since v0.3.3
    */
  @scala.inline
  def cpus(): js.Array[CpuInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("cpus")().asInstanceOf[js.Array[CpuInfo]]
  
  @JSImport("os", "devNull")
  @js.native
  val devNull: java.lang.String = js.native
  
  /**
    * Returns a string identifying the endianness of the CPU for which the Node.js
    * binary was compiled.
    *
    * Possible values are `'BE'` for big endian and `'LE'` for little endian.
    * @since v0.9.4
    */
  @scala.inline
  def endianness(): BE | LE = ^.asInstanceOf[js.Dynamic].applyDynamic("endianness")().asInstanceOf[BE | LE]
  
  /**
    * Returns the amount of free system memory in bytes as an integer.
    * @since v0.3.3
    */
  @scala.inline
  def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  /**
    * Returns the scheduling priority for the process specified by `pid`. If `pid` is
    * not provided or is `0`, the priority of the current process is returned.
    * @since v10.10.0
    * @param pid The process ID to retrieve scheduling priority for.
    */
  @scala.inline
  def getPriority(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPriority")().asInstanceOf[Double]
  @scala.inline
  def getPriority(pid: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPriority")(pid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns the string path of the current user's home directory.
    *
    * On POSIX, it uses the `$HOME` environment variable if defined. Otherwise it
    * uses the [effective UID](https://en.wikipedia.org/wiki/User_identifier#Effective_user_ID) to look up the user's home directory.
    *
    * On Windows, it uses the `USERPROFILE` environment variable if defined.
    * Otherwise it uses the path to the profile directory of the current user.
    * @since v2.3.0
    */
  @scala.inline
  def homedir(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("homedir")().asInstanceOf[java.lang.String]
  
  /**
    * Returns the host name of the operating system as a string.
    * @since v0.3.3
    */
  @scala.inline
  def hostname(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostname")().asInstanceOf[java.lang.String]
  
  /**
    * Returns an array containing the 1, 5, and 15 minute load averages.
    *
    * The load average is a measure of system activity calculated by the operating
    * system and expressed as a fractional number.
    *
    * The load average is a Unix-specific concept. On Windows, the return value is
    * always `[0, 0, 0]`.
    * @since v0.3.3
    */
  @scala.inline
  def loadavg(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[js.Array[Double]]
  
  /**
    * Returns an object containing network interfaces that have been assigned a
    * network address.
    *
    * Each key on the returned object identifies a network interface. The associated
    * value is an array of objects that each describe an assigned network address.
    *
    * The properties available on the assigned network address object include:
    *
    * ```js
    * {
    *   lo: [
    *     {
    *       address: '127.0.0.1',
    *       netmask: '255.0.0.0',
    *       family: 'IPv4',
    *       mac: '00:00:00:00:00:00',
    *       internal: true,
    *       cidr: '127.0.0.1/8'
    *     },
    *     {
    *       address: '::1',
    *       netmask: 'ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff',
    *       family: 'IPv6',
    *       mac: '00:00:00:00:00:00',
    *       scopeid: 0,
    *       internal: true,
    *       cidr: '::1/128'
    *     }
    *   ],
    *   eth0: [
    *     {
    *       address: '192.168.1.108',
    *       netmask: '255.255.255.0',
    *       family: 'IPv4',
    *       mac: '01:02:03:0a:0b:0c',
    *       internal: false,
    *       cidr: '192.168.1.108/24'
    *     },
    *     {
    *       address: 'fe80::a00:27ff:fe4e:66a1',
    *       netmask: 'ffff:ffff:ffff:ffff::',
    *       family: 'IPv6',
    *       mac: '01:02:03:0a:0b:0c',
    *       scopeid: 1,
    *       internal: false,
    *       cidr: 'fe80::a00:27ff:fe4e:66a1/64'
    *     }
    *   ]
    * }
    * ```
    * @since v0.6.0
    */
  @scala.inline
  def networkInterfaces(): Dict[js.Array[NetworkInterfaceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("networkInterfaces")().asInstanceOf[Dict[js.Array[NetworkInterfaceInfo]]]
  
  /**
    * Returns a string identifying the operating system platform. The value is set
    * at compile time. Possible values are `'aix'`, `'darwin'`, `'freebsd'`,`'linux'`, `'openbsd'`, `'sunos'`, and `'win32'`.
    *
    * The return value is equivalent to `process.platform`.
    *
    * The value `'android'` may also be returned if Node.js is built on the Android
    * operating system. [Android support is experimental](https://github.com/nodejs/node/blob/HEAD/BUILDING.md#androidandroid-based-devices-eg-firefox-os).
    * @since v0.5.0
    */
  @scala.inline
  def platform(): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[Platform]
  
  /**
    * Returns the operating system as a string.
    *
    * On POSIX systems, the operating system release is determined by calling[`uname(3)`](https://linux.die.net/man/3/uname). On Windows, `GetVersionExW()` is used.
    * See[https://en.wikipedia.org/wiki/Uname#Examples](https://en.wikipedia.org/wiki/Uname#Examples) for more information.
    * @since v0.3.3
    */
  @scala.inline
  def release(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("release")().asInstanceOf[java.lang.String]
  
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  @scala.inline
  def setPriority(pid: Double, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(pid.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Attempts to set the scheduling priority for the process specified by `pid`. If`pid` is not provided or is `0`, the process ID of the current process is used.
    *
    * The `priority` input must be an integer between `-20` (high priority) and `19`(low priority). Due to differences between Unix priority levels and Windows
    * priority classes, `priority` is mapped to one of six priority constants in`os.constants.priority`. When retrieving a process priority level, this range
    * mapping may cause the return value to be slightly different on Windows. To avoid
    * confusion, set `priority` to one of the priority constants.
    *
    * On Windows, setting priority to `PRIORITY_HIGHEST` requires elevated user
    * privileges. Otherwise the set priority will be silently reduced to`PRIORITY_HIGH`.
    * @since v10.10.0
    * @param pid The process ID to set scheduling priority for.
    * @param priority The scheduling priority to assign to the process.
    */
  @scala.inline
  def setPriority(priority: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(priority.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns the operating system's default directory for temporary files as a
    * string.
    * @since v0.9.9
    */
  @scala.inline
  def tmpdir(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[java.lang.String]
  
  /**
    * Returns the total amount of system memory in bytes as an integer.
    * @since v0.3.3
    */
  @scala.inline
  def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
  /**
    * Returns the operating system name as returned by [`uname(3)`](https://linux.die.net/man/3/uname). For example, it
    * returns `'Linux'` on Linux, `'Darwin'` on macOS, and `'Windows_NT'` on Windows.
    *
    * See [https://en.wikipedia.org/wiki/Uname#Examples](https://en.wikipedia.org/wiki/Uname#Examples) for additional information
    * about the output of running [`uname(3)`](https://linux.die.net/man/3/uname) on various operating systems.
    * @since v0.3.3
    */
  @scala.inline
  def `type`(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")().asInstanceOf[java.lang.String]
  
  /**
    * Returns the system uptime in number of seconds.
    * @since v0.3.3
    */
  @scala.inline
  def uptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uptime")().asInstanceOf[Double]
  
  @scala.inline
  def userInfo(): UserInfo_[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("userInfo")().asInstanceOf[UserInfo_[java.lang.String]]
  /**
    * Returns information about the currently effective user. On POSIX platforms,
    * this is typically a subset of the password file. The returned object includes
    * the `username`, `uid`, `gid`, `shell`, and `homedir`. On Windows, the `uid` and`gid` fields are `-1`, and `shell` is `null`.
    *
    * The value of `homedir` returned by `os.userInfo()` is provided by the operating
    * system. This differs from the result of `os.homedir()`, which queries
    * environment variables for the home directory before falling back to the
    * operating system response.
    *
    * Throws a `SystemError` if a user has no `username` or `homedir`.
    * @since v6.0.0
    */
  @scala.inline
  def userInfo(options: `2`): UserInfo_[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("userInfo")(options.asInstanceOf[js.Any]).asInstanceOf[UserInfo_[Buffer]]
  @scala.inline
  def userInfo(options: `4`): UserInfo_[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("userInfo")(options.asInstanceOf[js.Any]).asInstanceOf[UserInfo_[java.lang.String]]
  
  /**
    * Returns a string identifying the kernel version.
    *
    * On POSIX systems, the operating system release is determined by calling[`uname(3)`](https://linux.die.net/man/3/uname). On Windows, `RtlGetVersion()` is used, and if it is not
    * available, `GetVersionExW()` will be used. See[https://en.wikipedia.org/wiki/Uname#Examples](https://en.wikipedia.org/wiki/Uname#Examples) for more information.
    * @since v13.11.0, v12.17.0
    */
  @scala.inline
  def version(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[java.lang.String]
  
  trait CpuInfo extends StObject {
    
    var model: java.lang.String
    
    var speed: Double
    
    var times: Idle
  }
  object CpuInfo {
    
    @scala.inline
    def apply(model: java.lang.String, speed: Double, times: Idle): CpuInfo = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuInfo]
    }
    
    @scala.inline
    implicit class CpuInfoMutableBuilder[Self <: CpuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: java.lang.String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimes(value: Idle): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInterfaceBase extends StObject {
    
    var address: java.lang.String
    
    var cidr: java.lang.String | Null
    
    var internal: Boolean
    
    var mac: java.lang.String
    
    var netmask: java.lang.String
  }
  object NetworkInterfaceBase {
    
    @scala.inline
    def apply(address: java.lang.String, internal: Boolean, mac: java.lang.String, netmask: java.lang.String): NetworkInterfaceBase = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], cidr = null)
      __obj.asInstanceOf[NetworkInterfaceBase]
    }
    
    @scala.inline
    implicit class NetworkInterfaceBaseMutableBuilder[Self <: NetworkInterfaceBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidr(value: java.lang.String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrNull: Self = StObject.set(x, "cidr", null)
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: java.lang.String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetmask(value: java.lang.String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.osMod.NetworkInterfaceInfoIPv4
    - tmttyped.node.osMod.NetworkInterfaceInfoIPv6
  */
  trait NetworkInterfaceInfo extends StObject
  object NetworkInterfaceInfo {
    
    @scala.inline
    def NetworkInterfaceInfoIPv4(address: java.lang.String, internal: Boolean, mac: java.lang.String, netmask: java.lang.String): tmttyped.node.osMod.NetworkInterfaceInfoIPv4 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = "IPv4", internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], cidr = null)
      __obj.asInstanceOf[tmttyped.node.osMod.NetworkInterfaceInfoIPv4]
    }
    
    @scala.inline
    def NetworkInterfaceInfoIPv6(
      address: java.lang.String,
      internal: Boolean,
      mac: java.lang.String,
      netmask: java.lang.String,
      scopeid: Double
    ): tmttyped.node.osMod.NetworkInterfaceInfoIPv6 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = "IPv6", internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any], cidr = null)
      __obj.asInstanceOf[tmttyped.node.osMod.NetworkInterfaceInfoIPv6]
    }
  }
  
  trait NetworkInterfaceInfoIPv4
    extends StObject
       with NetworkInterfaceBase
       with NetworkInterfaceInfo {
    
    var family: IPv4
  }
  object NetworkInterfaceInfoIPv4 {
    
    @scala.inline
    def apply(address: java.lang.String, internal: Boolean, mac: java.lang.String, netmask: java.lang.String): NetworkInterfaceInfoIPv4 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = "IPv4", internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], cidr = null)
      __obj.asInstanceOf[NetworkInterfaceInfoIPv4]
    }
    
    @scala.inline
    implicit class NetworkInterfaceInfoIPv4MutableBuilder[Self <: NetworkInterfaceInfoIPv4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: IPv4): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInterfaceInfoIPv6
    extends StObject
       with NetworkInterfaceBase
       with NetworkInterfaceInfo {
    
    var family: IPv6
    
    var scopeid: Double
  }
  object NetworkInterfaceInfoIPv6 {
    
    @scala.inline
    def apply(
      address: java.lang.String,
      internal: Boolean,
      mac: java.lang.String,
      netmask: java.lang.String,
      scopeid: Double
    ): NetworkInterfaceInfoIPv6 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = "IPv6", internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any], cidr = null)
      __obj.asInstanceOf[NetworkInterfaceInfoIPv6]
    }
    
    @scala.inline
    implicit class NetworkInterfaceInfoIPv6MutableBuilder[Self <: NetworkInterfaceInfoIPv6] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: IPv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeid(value: Double): Self = StObject.set(x, "scopeid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in node.process.<global>.NodeJS.Signals ]: number} */
  trait SignalConstants extends StObject {
    
    var SIGABRT: Double
    
    var SIGALRM: Double
    
    var SIGBREAK: Double
    
    var SIGBUS: Double
    
    var SIGCHLD: Double
    
    var SIGCONT: Double
    
    var SIGFPE: Double
    
    var SIGHUP: Double
    
    var SIGILL: Double
    
    var SIGINFO: Double
    
    var SIGINT: Double
    
    var SIGIO: Double
    
    var SIGIOT: Double
    
    var SIGKILL: Double
    
    var SIGLOST: Double
    
    var SIGPIPE: Double
    
    var SIGPOLL: Double
    
    var SIGPROF: Double
    
    var SIGPWR: Double
    
    var SIGQUIT: Double
    
    var SIGSEGV: Double
    
    var SIGSTKFLT: Double
    
    var SIGSTOP: Double
    
    var SIGSYS: Double
    
    var SIGTERM: Double
    
    var SIGTRAP: Double
    
    var SIGTSTP: Double
    
    var SIGTTIN: Double
    
    var SIGTTOU: Double
    
    var SIGUNUSED: Double
    
    var SIGURG: Double
    
    var SIGUSR1: Double
    
    var SIGUSR2: Double
    
    var SIGVTALRM: Double
    
    var SIGWINCH: Double
    
    var SIGXCPU: Double
    
    var SIGXFSZ: Double
  }
  object SignalConstants {
    
    @scala.inline
    def apply(
      SIGABRT: Double,
      SIGALRM: Double,
      SIGBREAK: Double,
      SIGBUS: Double,
      SIGCHLD: Double,
      SIGCONT: Double,
      SIGFPE: Double,
      SIGHUP: Double,
      SIGILL: Double,
      SIGINFO: Double,
      SIGINT: Double,
      SIGIO: Double,
      SIGIOT: Double,
      SIGKILL: Double,
      SIGLOST: Double,
      SIGPIPE: Double,
      SIGPOLL: Double,
      SIGPROF: Double,
      SIGPWR: Double,
      SIGQUIT: Double,
      SIGSEGV: Double,
      SIGSTKFLT: Double,
      SIGSTOP: Double,
      SIGSYS: Double,
      SIGTERM: Double,
      SIGTRAP: Double,
      SIGTSTP: Double,
      SIGTTIN: Double,
      SIGTTOU: Double,
      SIGUNUSED: Double,
      SIGURG: Double,
      SIGUSR1: Double,
      SIGUSR2: Double,
      SIGVTALRM: Double,
      SIGWINCH: Double,
      SIGXCPU: Double,
      SIGXFSZ: Double
    ): SignalConstants = {
      val __obj = js.Dynamic.literal(SIGABRT = SIGABRT.asInstanceOf[js.Any], SIGALRM = SIGALRM.asInstanceOf[js.Any], SIGBREAK = SIGBREAK.asInstanceOf[js.Any], SIGBUS = SIGBUS.asInstanceOf[js.Any], SIGCHLD = SIGCHLD.asInstanceOf[js.Any], SIGCONT = SIGCONT.asInstanceOf[js.Any], SIGFPE = SIGFPE.asInstanceOf[js.Any], SIGHUP = SIGHUP.asInstanceOf[js.Any], SIGILL = SIGILL.asInstanceOf[js.Any], SIGINFO = SIGINFO.asInstanceOf[js.Any], SIGINT = SIGINT.asInstanceOf[js.Any], SIGIO = SIGIO.asInstanceOf[js.Any], SIGIOT = SIGIOT.asInstanceOf[js.Any], SIGKILL = SIGKILL.asInstanceOf[js.Any], SIGLOST = SIGLOST.asInstanceOf[js.Any], SIGPIPE = SIGPIPE.asInstanceOf[js.Any], SIGPOLL = SIGPOLL.asInstanceOf[js.Any], SIGPROF = SIGPROF.asInstanceOf[js.Any], SIGPWR = SIGPWR.asInstanceOf[js.Any], SIGQUIT = SIGQUIT.asInstanceOf[js.Any], SIGSEGV = SIGSEGV.asInstanceOf[js.Any], SIGSTKFLT = SIGSTKFLT.asInstanceOf[js.Any], SIGSTOP = SIGSTOP.asInstanceOf[js.Any], SIGSYS = SIGSYS.asInstanceOf[js.Any], SIGTERM = SIGTERM.asInstanceOf[js.Any], SIGTRAP = SIGTRAP.asInstanceOf[js.Any], SIGTSTP = SIGTSTP.asInstanceOf[js.Any], SIGTTIN = SIGTTIN.asInstanceOf[js.Any], SIGTTOU = SIGTTOU.asInstanceOf[js.Any], SIGUNUSED = SIGUNUSED.asInstanceOf[js.Any], SIGURG = SIGURG.asInstanceOf[js.Any], SIGUSR1 = SIGUSR1.asInstanceOf[js.Any], SIGUSR2 = SIGUSR2.asInstanceOf[js.Any], SIGVTALRM = SIGVTALRM.asInstanceOf[js.Any], SIGWINCH = SIGWINCH.asInstanceOf[js.Any], SIGXCPU = SIGXCPU.asInstanceOf[js.Any], SIGXFSZ = SIGXFSZ.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalConstants]
    }
    
    @scala.inline
    implicit class SignalConstantsMutableBuilder[Self <: SignalConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSIGABRT(value: Double): Self = StObject.set(x, "SIGABRT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGALRM(value: Double): Self = StObject.set(x, "SIGALRM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGBREAK(value: Double): Self = StObject.set(x, "SIGBREAK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGBUS(value: Double): Self = StObject.set(x, "SIGBUS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGCHLD(value: Double): Self = StObject.set(x, "SIGCHLD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGCONT(value: Double): Self = StObject.set(x, "SIGCONT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGFPE(value: Double): Self = StObject.set(x, "SIGFPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGHUP(value: Double): Self = StObject.set(x, "SIGHUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGILL(value: Double): Self = StObject.set(x, "SIGILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGINFO(value: Double): Self = StObject.set(x, "SIGINFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGINT(value: Double): Self = StObject.set(x, "SIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGIO(value: Double): Self = StObject.set(x, "SIGIO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGIOT(value: Double): Self = StObject.set(x, "SIGIOT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGKILL(value: Double): Self = StObject.set(x, "SIGKILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGLOST(value: Double): Self = StObject.set(x, "SIGLOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPIPE(value: Double): Self = StObject.set(x, "SIGPIPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPOLL(value: Double): Self = StObject.set(x, "SIGPOLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPROF(value: Double): Self = StObject.set(x, "SIGPROF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPWR(value: Double): Self = StObject.set(x, "SIGPWR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGQUIT(value: Double): Self = StObject.set(x, "SIGQUIT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSEGV(value: Double): Self = StObject.set(x, "SIGSEGV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSTKFLT(value: Double): Self = StObject.set(x, "SIGSTKFLT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSTOP(value: Double): Self = StObject.set(x, "SIGSTOP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSYS(value: Double): Self = StObject.set(x, "SIGSYS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTERM(value: Double): Self = StObject.set(x, "SIGTERM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTRAP(value: Double): Self = StObject.set(x, "SIGTRAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTSTP(value: Double): Self = StObject.set(x, "SIGTSTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTTIN(value: Double): Self = StObject.set(x, "SIGTTIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTTOU(value: Double): Self = StObject.set(x, "SIGTTOU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGUNUSED(value: Double): Self = StObject.set(x, "SIGUNUSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGURG(value: Double): Self = StObject.set(x, "SIGURG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGUSR1(value: Double): Self = StObject.set(x, "SIGUSR1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGUSR2(value: Double): Self = StObject.set(x, "SIGUSR2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGVTALRM(value: Double): Self = StObject.set(x, "SIGVTALRM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGWINCH(value: Double): Self = StObject.set(x, "SIGWINCH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGXCPU(value: Double): Self = StObject.set(x, "SIGXCPU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGXFSZ(value: Double): Self = StObject.set(x, "SIGXFSZ", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfo_[T] extends StObject {
    
    var gid: Double
    
    var homedir: T
    
    var shell: T
    
    var uid: Double
    
    var username: T
  }
  object UserInfo_ {
    
    @scala.inline
    def apply[T](gid: Double, homedir: T, shell: T, uid: Double, username: T): UserInfo_[T] = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo_[T]]
    }
    
    @scala.inline
    implicit class UserInfo_MutableBuilder[Self <: UserInfo_[_], T] (val x: Self with UserInfo_[T]) extends AnyVal {
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomedir(value: T): Self = StObject.set(x, "homedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: T): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: T): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
