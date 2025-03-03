package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.anon.JsMemoryEstimate
import tmttyped.node.anon.Strings
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.nodeStrings.afterEvaluate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vmMod {
  
  @JSImport("vm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of the `vm.Script` class contain precompiled scripts that can be
    * executed in specific contexts.
    * @since v0.3.1
    */
  @JSImport("vm", "Script")
  @js.native
  class Script protected () extends StObject {
    def this(code: java.lang.String) = this()
    def this(code: java.lang.String, options: ScriptOptions) = this()
    
    var cachedDataRejected: js.UndefOr[Boolean] = js.native
    
    /**
      * Creates a code cache that can be used with the `Script` constructor's`cachedData` option. Returns a `Buffer`. This method may be called at any
      * time and any number of times.
      *
      * ```js
      * const script = new vm.Script(`
      * function add(a, b) {
      *   return a + b;
      * }
      *
      * const x = add(1, 2);
      * `);
      *
      * const cacheWithoutX = script.createCachedData();
      *
      * script.runInThisContext();
      *
      * const cacheWithX = script.createCachedData();
      * ```
      * @since v10.6.0
      */
    def createCachedData(): Buffer = js.native
    
    /**
      * Runs the compiled code contained by the `vm.Script` object within the given`contextifiedObject` and returns the result. Running code does not have access
      * to local scope.
      *
      * The following example compiles code that increments a global variable, sets
      * the value of another global variable, then execute the code multiple times.
      * The globals are contained in the `context` object.
      *
      * ```js
      * const vm = require('vm');
      *
      * const context = {
      *   animal: 'cat',
      *   count: 2
      * };
      *
      * const script = new vm.Script('count += 1; name = "kitty";');
      *
      * vm.createContext(context);
      * for (let i = 0; i < 10; ++i) {
      *   script.runInContext(context);
      * }
      *
      * console.log(context);
      * // Prints: { animal: 'cat', count: 12, name: 'kitty' }
      * ```
      *
      * Using the `timeout` or `breakOnSigint` options will result in new event loops
      * and corresponding threads being started, which have a non-zero performance
      * overhead.
      * @since v0.3.1
      * @param contextifiedObject A `contextified` object as returned by the `vm.createContext()` method.
      * @return the result of the very last statement executed in the script.
      */
    def runInContext(contextifiedSandbox: Context): js.Any = js.native
    def runInContext(contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
    
    /**
      * First contextifies the given `contextObject`, runs the compiled code contained
      * by the `vm.Script` object within the created context, and returns the result.
      * Running code does not have access to local scope.
      *
      * The following example compiles code that sets a global variable, then executes
      * the code multiple times in different contexts. The globals are set on and
      * contained within each individual `context`.
      *
      * ```js
      * const vm = require('vm');
      *
      * const script = new vm.Script('globalVar = "set"');
      *
      * const contexts = [{}, {}, {}];
      * contexts.forEach((context) => {
      *   script.runInNewContext(context);
      * });
      *
      * console.log(contexts);
      * // Prints: [{ globalVar: 'set' }, { globalVar: 'set' }, { globalVar: 'set' }]
      * ```
      * @since v0.3.1
      * @param contextObject An object that will be `contextified`. If `undefined`, a new object will be created.
      * @return the result of the very last statement executed in the script.
      */
    def runInNewContext(): js.Any = js.native
    def runInNewContext(sandbox: Unit, options: RunningScriptOptions): js.Any = js.native
    def runInNewContext(sandbox: Context): js.Any = js.native
    def runInNewContext(sandbox: Context, options: RunningScriptOptions): js.Any = js.native
    
    /**
      * Runs the compiled code contained by the `vm.Script` within the context of the
      * current `global` object. Running code does not have access to local scope, but_does_ have access to the current `global` object.
      *
      * The following example compiles code that increments a `global` variable then
      * executes that code multiple times:
      *
      * ```js
      * const vm = require('vm');
      *
      * global.globalVar = 0;
      *
      * const script = new vm.Script('globalVar += 1', { filename: 'myfile.vm' });
      *
      * for (let i = 0; i < 1000; ++i) {
      *   script.runInThisContext();
      * }
      *
      * console.log(globalVar);
      *
      * // 1000
      * ```
      * @since v0.3.1
      * @return the result of the very last statement executed in the script.
      */
    def runInThisContext(): js.Any = js.native
    def runInThisContext(options: RunningScriptOptions): js.Any = js.native
  }
  
  /**
    * Compiles the given code into the provided context (if no context is
    * supplied, the current context is used), and returns it wrapped inside a
    * function with the given `params`.
    * @since v10.10.0
    * @param code The body of the function to compile.
    * @param params An array of strings containing all parameters for the function.
    */
  @scala.inline
  def compileFunction(code: java.lang.String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String], options: CompileFunctionOptions): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def compileFunction(code: java.lang.String, params: Unit, options: CompileFunctionOptions): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * If given a `contextObject`, the `vm.createContext()` method will `prepare
    * that object` so that it can be used in calls to {@link runInContext} or `script.runInContext()`. Inside such scripts,
    * the `contextObject` will be the global object, retaining all of its existing
    * properties but also having the built-in objects and functions any standard[global object](https://es5.github.io/#x15.1) has. Outside of scripts run by the vm module, global variables
    * will remain unchanged.
    *
    * ```js
    * const vm = require('vm');
    *
    * global.globalVar = 3;
    *
    * const context = { globalVar: 1 };
    * vm.createContext(context);
    *
    * vm.runInContext('globalVar *= 2;', context);
    *
    * console.log(context);
    * // Prints: { globalVar: 2 }
    *
    * console.log(global.globalVar);
    * // Prints: 3
    * ```
    *
    * If `contextObject` is omitted (or passed explicitly as `undefined`), a new,
    * empty `contextified` object will be returned.
    *
    * The `vm.createContext()` method is primarily useful for creating a single
    * context that can be used to run multiple scripts. For instance, if emulating a
    * web browser, the method can be used to create a single context representing a
    * window's global object, then run all `<script>` tags together within that
    * context.
    *
    * The provided `name` and `origin` of the context are made visible through the
    * Inspector API.
    * @since v0.3.1
    * @return contextified object.
    */
  @scala.inline
  def createContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[Context]
  @scala.inline
  def createContext(sandbox: Unit, options: CreateContextOptions): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def createContext(sandbox: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(sandbox.asInstanceOf[js.Any]).asInstanceOf[Context]
  @scala.inline
  def createContext(sandbox: Context, options: CreateContextOptions): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  /**
    * Returns `true` if the given `object` object has been `contextified` using {@link createContext}.
    * @since v0.11.7
    */
  @scala.inline
  def isContext(sandbox: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContext")(sandbox.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Measure the memory known to V8 and used by all contexts known to the
    * current V8 isolate, or the main context.
    *
    * The format of the object that the returned Promise may resolve with is
    * specific to the V8 engine and may change from one version of V8 to the next.
    *
    * The returned result is different from the statistics returned by`v8.getHeapSpaceStatistics()` in that `vm.measureMemory()` measure the
    * memory reachable by each V8 specific contexts in the current instance of
    * the V8 engine, while the result of `v8.getHeapSpaceStatistics()` measure
    * the memory occupied by each heap space in the current V8 instance.
    *
    * ```js
    * const vm = require('vm');
    * // Measure the memory used by the main context.
    * vm.measureMemory({ mode: 'summary' })
    *   // This is the same as vm.measureMemory()
    *   .then((result) => {
    *     // The current format is:
    *     // {
    *     //   total: {
    *     //      jsMemoryEstimate: 2418479, jsMemoryRange: [ 2418479, 2745799 ]
    *     //    }
    *     // }
    *     console.log(result);
    *   });
    *
    * const context = vm.createContext({ a: 1 });
    * vm.measureMemory({ mode: 'detailed', execution: 'eager' })
    *   .then((result) => {
    *     // Reference the context here so that it won't be GC'ed
    *     // until the measurement is complete.
    *     console.log(context.a);
    *     // {
    *     //   total: {
    *     //     jsMemoryEstimate: 2574732,
    *     //     jsMemoryRange: [ 2574732, 2904372 ]
    *     //   },
    *     //   current: {
    *     //     jsMemoryEstimate: 2438996,
    *     //     jsMemoryRange: [ 2438996, 2768636 ]
    *     //   },
    *     //   other: [
    *     //     {
    *     //       jsMemoryEstimate: 135736,
    *     //       jsMemoryRange: [ 135736, 465376 ]
    *     //     }
    *     //   ]
    *     // }
    *     console.log(result);
    *   });
    * ```
    * @since v13.10.0
    * @experimental
    */
  @scala.inline
  def measureMemory(): js.Promise[MemoryMeasurement] = ^.asInstanceOf[js.Dynamic].applyDynamic("measureMemory")().asInstanceOf[js.Promise[MemoryMeasurement]]
  @scala.inline
  def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = ^.asInstanceOf[js.Dynamic].applyDynamic("measureMemory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryMeasurement]]
  
  /**
    * The `vm.runInContext()` method compiles `code`, runs it within the context of
    * the `contextifiedObject`, then returns the result. Running code does not have
    * access to the local scope. The `contextifiedObject` object _must_ have been
    * previously `contextified` using the {@link createContext} method.
    *
    * If `options` is a string, then it specifies the filename.
    *
    * The following example compiles and executes different scripts using a single `contextified` object:
    *
    * ```js
    * const vm = require('vm');
    *
    * const contextObject = { globalVar: 1 };
    * vm.createContext(contextObject);
    *
    * for (let i = 0; i < 10; ++i) {
    *   vm.runInContext('globalVar *= 2;', contextObject);
    * }
    * console.log(contextObject);
    * // Prints: { globalVar: 1024 }
    * ```
    * @since v0.3.1
    * @param code The JavaScript code to compile and run.
    * @param contextifiedObject The `contextified` object that will be used as the `global` when the `code` is compiled and run.
    * @return the result of the very last statement executed in the script.
    */
  @scala.inline
  def runInContext(code: java.lang.String, contextifiedSandbox: Context): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * The `vm.runInNewContext()` first contextifies the given `contextObject` (or
    * creates a new `contextObject` if passed as `undefined`), compiles the `code`,
    * runs it within the created context, then returns the result. Running code
    * does not have access to the local scope.
    *
    * If `options` is a string, then it specifies the filename.
    *
    * The following example compiles and executes code that increments a global
    * variable and sets a new one. These globals are contained in the `contextObject`.
    *
    * ```js
    * const vm = require('vm');
    *
    * const contextObject = {
    *   animal: 'cat',
    *   count: 2
    * };
    *
    * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
    * console.log(contextObject);
    * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
    * ```
    * @since v0.3.1
    * @param code The JavaScript code to compile and run.
    * @param contextObject An object that will be `contextified`. If `undefined`, a new object will be created.
    * @return the result of the very last statement executed in the script.
    */
  @scala.inline
  def runInNewContext(code: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Unit, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Unit, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Context): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Context, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * `vm.runInThisContext()` compiles `code`, runs it within the context of the
    * current `global` and returns the result. Running code does not have access to
    * local scope, but does have access to the current `global` object.
    *
    * If `options` is a string, then it specifies the filename.
    *
    * The following example illustrates using both `vm.runInThisContext()` and
    * the JavaScript [`eval()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval) function to run the same code:
    *
    * ```js
    * const vm = require('vm');
    * let localVar = 'initial value';
    *
    * const vmResult = vm.runInThisContext('localVar = "vm";');
    * console.log(`vmResult: '${vmResult}', localVar: '${localVar}'`);
    * // Prints: vmResult: 'vm', localVar: 'initial value'
    *
    * const evalResult = eval('localVar = "eval";');
    * console.log(`evalResult: '${evalResult}', localVar: '${localVar}'`);
    * // Prints: evalResult: 'eval', localVar: 'eval'
    * ```
    *
    * Because `vm.runInThisContext()` does not have access to the local scope,`localVar` is unchanged. In contrast,
    * [`eval()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval)_does_ have access to the
    * local scope, so the value `localVar` is changed. In this way`vm.runInThisContext()` is much like an [indirect `eval()` call](https://es5.github.io/#x10.4.2), e.g.`(0,eval)('code')`.
    *
    * ## Example: Running an HTTP server within a VM
    *
    * When using either `script.runInThisContext()` or {@link runInThisContext}, the code is executed within the current V8 global
    * context. The code passed to this VM context will have its own isolated scope.
    *
    * In order to run a simple web server using the `http` module the code passed to
    * the context must either call `require('http')` on its own, or have a reference
    * to the `http` module passed to it. For instance:
    *
    * ```js
    * 'use strict';
    * const vm = require('vm');
    *
    * const code = `
    * ((require) => {
    *   const http = require('http');
    *
    *   http.createServer((request, response) => {
    *     response.writeHead(200, { 'Content-Type': 'text/plain' });
    *     response.end('Hello World\\n');
    *   }).listen(8124);
    *
    *   console.log('Server running at http://127.0.0.1:8124/');
    * })`;
    *
    * vm.runInThisContext(code)(require);
    * ```
    *
    * The `require()` in the above case shares the state with the context it is
    * passed from. This may introduce risks when untrusted code is executed, e.g.
    * altering objects in the context in unwanted ways.
    * @since v0.3.1
    * @param code The JavaScript code to compile and run.
    * @return the result of the very last statement executed in the script.
    */
  @scala.inline
  def runInThisContext(code: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInThisContext(code: java.lang.String, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait BaseOptions extends StObject {
    
    /**
      * Specifies the column number offset that is displayed in stack traces produced by this script.
      * @default 0
      */
    var columnOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the filename used in stack traces produced by this script.
      * Default: `''`.
      */
    var filename: js.UndefOr[java.lang.String] = js.undefined
    
    /**
      * Specifies the line number offset that is displayed in stack traces produced by this script.
      * Default: `0`.
      */
    var lineOffset: js.UndefOr[Double] = js.undefined
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnOffsetUndefined: Self = StObject.set(x, "columnOffset", js.undefined)
      
      @scala.inline
      def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    }
  }
  
  trait CompileFunctionOptions
    extends StObject
       with BaseOptions {
    
    /**
      * Provides an optional data with V8's code cache data for the supplied source.
      */
    var cachedData: js.UndefOr[Buffer] = js.undefined
    
    /**
      * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
      */
    var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * The sandbox/context in which the said function should be compiled in.
      */
    var parsingContext: js.UndefOr[Context] = js.undefined
    
    /**
      * Specifies whether to produce new cache data.
      * Default: `false`,
      */
    var produceCachedData: js.UndefOr[Boolean] = js.undefined
  }
  object CompileFunctionOptions {
    
    @scala.inline
    def apply(): CompileFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileFunctionOptions]
    }
    
    @scala.inline
    implicit class CompileFunctionOptionsMutableBuilder[Self <: CompileFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachedData(value: Buffer): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
      
      @scala.inline
      def setContextExtensions(value: js.Array[js.Object]): Self = StObject.set(x, "contextExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextExtensionsUndefined: Self = StObject.set(x, "contextExtensions", js.undefined)
      
      @scala.inline
      def setContextExtensionsVarargs(value: js.Object*): Self = StObject.set(x, "contextExtensions", js.Array(value :_*))
      
      @scala.inline
      def setParsingContext(value: Context): Self = StObject.set(x, "parsingContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsingContextUndefined: Self = StObject.set(x, "parsingContext", js.undefined)
      
      @scala.inline
      def setProduceCachedData(value: Boolean): Self = StObject.set(x, "produceCachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduceCachedDataUndefined: Self = StObject.set(x, "produceCachedData", js.undefined)
    }
  }
  
  type Context = Dict[js.Any]
  
  trait CreateContextOptions extends StObject {
    
    var codeGeneration: js.UndefOr[Strings] = js.undefined
    
    /**
      * If set to `afterEvaluate`, microtasks will be run immediately after the script has run.
      */
    var microtaskMode: js.UndefOr[afterEvaluate] = js.undefined
    
    /**
      * Human-readable name of the newly created context.
      * @default 'VM Context i' Where i is an ascending numerical index of the created context.
      */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /**
      * Corresponds to the newly created context for display purposes.
      * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
      * like the value of the `url.origin` property of a URL object.
      * Most notably, this string should omit the trailing slash, as that denotes a path.
      * @default ''
      */
    var origin: js.UndefOr[java.lang.String] = js.undefined
  }
  object CreateContextOptions {
    
    @scala.inline
    def apply(): CreateContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateContextOptions]
    }
    
    @scala.inline
    implicit class CreateContextOptionsMutableBuilder[Self <: CreateContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeGeneration(value: Strings): Self = StObject.set(x, "codeGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeGenerationUndefined: Self = StObject.set(x, "codeGeneration", js.undefined)
      
      @scala.inline
      def setMicrotaskMode(value: afterEvaluate): Self = StObject.set(x, "microtaskMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicrotaskModeUndefined: Self = StObject.set(x, "microtaskMode", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.nodeStrings.summary
    - tmttyped.node.nodeStrings.detailed
  */
  trait MeasureMemoryMode extends StObject
  object MeasureMemoryMode {
    
    @scala.inline
    def detailed: tmttyped.node.nodeStrings.detailed = "detailed".asInstanceOf[tmttyped.node.nodeStrings.detailed]
    
    @scala.inline
    def summary: tmttyped.node.nodeStrings.summary = "summary".asInstanceOf[tmttyped.node.nodeStrings.summary]
  }
  
  trait MeasureMemoryOptions extends StObject {
    
    var context: js.UndefOr[Context] = js.undefined
    
    /**
      * @default 'summary'
      */
    var mode: js.UndefOr[MeasureMemoryMode] = js.undefined
  }
  object MeasureMemoryOptions {
    
    @scala.inline
    def apply(): MeasureMemoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeasureMemoryOptions]
    }
    
    @scala.inline
    implicit class MeasureMemoryOptionsMutableBuilder[Self <: MeasureMemoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setMode(value: MeasureMemoryMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait MemoryMeasurement extends StObject {
    
    var total: JsMemoryEstimate
  }
  object MemoryMeasurement {
    
    @scala.inline
    def apply(total: JsMemoryEstimate): MemoryMeasurement = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryMeasurement]
    }
    
    @scala.inline
    implicit class MemoryMeasurementMutableBuilder[Self <: MemoryMeasurement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotal(value: JsMemoryEstimate): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunningScriptOptions
    extends StObject
       with BaseOptions {
    
    /**
      * If `true`, the execution will be terminated when `SIGINT` (Ctrl+C) is received.
      * Existing handlers for the event that have been attached via `process.on('SIGINT')` will be disabled during script execution, but will continue to work after that.
      * If execution is terminated, an `Error` will be thrown.
      * Default: `false`.
      */
    var breakOnSigint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, if an `Error` occurs while compiling the `code`, the line of code causing the error is attached to the stack trace.
      * Default: `true`.
      */
    var displayErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `afterEvaluate`, microtasks will be run immediately after the script has run.
      */
    var microtaskMode: js.UndefOr[afterEvaluate] = js.undefined
    
    /**
      * Specifies the number of milliseconds to execute code before terminating execution.
      * If execution is terminated, an `Error` will be thrown. This value must be a strictly positive integer.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RunningScriptOptions {
    
    @scala.inline
    def apply(): RunningScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunningScriptOptions]
    }
    
    @scala.inline
    implicit class RunningScriptOptionsMutableBuilder[Self <: RunningScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakOnSigint(value: Boolean): Self = StObject.set(x, "breakOnSigint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakOnSigintUndefined: Self = StObject.set(x, "breakOnSigint", js.undefined)
      
      @scala.inline
      def setDisplayErrors(value: Boolean): Self = StObject.set(x, "displayErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayErrorsUndefined: Self = StObject.set(x, "displayErrors", js.undefined)
      
      @scala.inline
      def setMicrotaskMode(value: afterEvaluate): Self = StObject.set(x, "microtaskMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicrotaskModeUndefined: Self = StObject.set(x, "microtaskMode", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ScriptOptions
    extends StObject
       with BaseOptions {
    
    var cachedData: js.UndefOr[Buffer] = js.undefined
    
    var displayErrors: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated in favor of `script.createCachedData()` */
    var produceCachedData: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ScriptOptions {
    
    @scala.inline
    def apply(): ScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScriptOptions]
    }
    
    @scala.inline
    implicit class ScriptOptionsMutableBuilder[Self <: ScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachedData(value: Buffer): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
      
      @scala.inline
      def setDisplayErrors(value: Boolean): Self = StObject.set(x, "displayErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayErrorsUndefined: Self = StObject.set(x, "displayErrors", js.undefined)
      
      @scala.inline
      def setProduceCachedData(value: Boolean): Self = StObject.set(x, "produceCachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduceCachedDataUndefined: Self = StObject.set(x, "produceCachedData", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
