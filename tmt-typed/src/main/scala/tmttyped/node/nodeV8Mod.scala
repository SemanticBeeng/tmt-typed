package tmttyped.node

import tmttyped.node.NodeJS.TypedArray
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.v8Mod.HeapCodeStatistics
import tmttyped.node.v8Mod.HeapInfo
import tmttyped.node.v8Mod.HeapSpaceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeV8Mod {
  
  @JSImport("node:v8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A subclass of `Deserializer` corresponding to the format written by `DefaultSerializer`.
    * @since v8.0.0
    */
  @JSImport("node:v8", "DefaultDeserializer")
  @js.native
  class DefaultDeserializer protected ()
    extends tmttyped.node.v8Mod.DefaultDeserializer {
    def this(data: TypedArray) = this()
  }
  
  /**
    * A subclass of `Serializer` that serializes `TypedArray`(in particular `Buffer`) and `DataView` objects as host objects, and only
    * stores the part of their underlying `ArrayBuffer`s that they are referring to.
    * @since v8.0.0
    */
  @JSImport("node:v8", "DefaultSerializer")
  @js.native
  class DefaultSerializer ()
    extends tmttyped.node.v8Mod.DefaultSerializer
  
  /**
    * @since v8.0.0
    */
  @JSImport("node:v8", "Deserializer")
  @js.native
  class Deserializer protected ()
    extends tmttyped.node.v8Mod.Deserializer {
    def this(data: TypedArray) = this()
  }
  
  /**
    * @since v8.0.0
    */
  @JSImport("node:v8", "Serializer")
  @js.native
  class Serializer ()
    extends tmttyped.node.v8Mod.Serializer
  
  /**
    * Returns an integer representing a version tag derived from the V8 version,
    * command-line flags, and detected CPU features. This is useful for determining
    * whether a `vm.Script` `cachedData` buffer is compatible with this instance
    * of V8.
    *
    * ```js
    * console.log(v8.cachedDataVersionTag()); // 3947234607
    * // The value returned by v8.cachedDataVersionTag() is derived from the V8
    * // version, command-line flags, and detected CPU features. Test that the value
    * // does indeed update when flags are toggled.
    * v8.setFlagsFromString('--allow_natives_syntax');
    * console.log(v8.cachedDataVersionTag()); // 183726201
    * ```
    * @since v8.0.0
    */
  @scala.inline
  def cachedDataVersionTag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cachedDataVersionTag")().asInstanceOf[Double]
  
  /**
    * Uses a `DefaultDeserializer` with default options to read a JS value
    * from a buffer.
    * @since v8.0.0
    * @param buffer A buffer returned by {@link serialize}.
    */
  @scala.inline
  def deserialize(data: TypedArray): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Returns an object with the following properties:
    *
    * ```js
    * {
    *   code_and_metadata_size: 212208,
    *   bytecode_and_metadata_size: 161368,
    *   external_script_source_size: 1410794
    * }
    * ```
    * @since v12.8.0
    */
  @scala.inline
  def getHeapCodeStatistics(): HeapCodeStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapCodeStatistics")().asInstanceOf[HeapCodeStatistics]
  
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine. Therefore, the schema may change from one version of V8 to the next.
    *
    * ```js
    * // Print heap snapshot to the console
    * const v8 = require('v8');
    * const stream = v8.getHeapSnapshot();
    * stream.pipe(process.stdout);
    * ```
    * @since v11.13.0
    * @return A Readable Stream containing the V8 heap snapshot
    */
  @scala.inline
  def getHeapSnapshot(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSnapshot")().asInstanceOf[Readable]
  
  /**
    * Returns statistics about the V8 heap spaces, i.e. the segments which make up
    * the V8 heap. Neither the ordering of heap spaces, nor the availability of a
    * heap space can be guaranteed as the statistics are provided via the
    * V8[`GetHeapSpaceStatistics`](https://v8docs.nodesource.com/node-13.2/d5/dda/classv8_1_1_isolate.html#ac673576f24fdc7a33378f8f57e1d13a4) function and may change from one V8 version to the
    * next.
    *
    * The value returned is an array of objects containing the following properties:
    *
    * ```json
    * [
    *   {
    *     "space_name": "new_space",
    *     "space_size": 2063872,
    *     "space_used_size": 951112,
    *     "space_available_size": 80824,
    *     "physical_space_size": 2063872
    *   },
    *   {
    *     "space_name": "old_space",
    *     "space_size": 3090560,
    *     "space_used_size": 2493792,
    *     "space_available_size": 0,
    *     "physical_space_size": 3090560
    *   },
    *   {
    *     "space_name": "code_space",
    *     "space_size": 1260160,
    *     "space_used_size": 644256,
    *     "space_available_size": 960,
    *     "physical_space_size": 1260160
    *   },
    *   {
    *     "space_name": "map_space",
    *     "space_size": 1094160,
    *     "space_used_size": 201608,
    *     "space_available_size": 0,
    *     "physical_space_size": 1094160
    *   },
    *   {
    *     "space_name": "large_object_space",
    *     "space_size": 0,
    *     "space_used_size": 0,
    *     "space_available_size": 1490980608,
    *     "physical_space_size": 0
    *   }
    * ]
    * ```
    * @since v6.0.0
    */
  @scala.inline
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSpaceStatistics")().asInstanceOf[js.Array[HeapSpaceInfo]]
  
  /**
    * Returns an object with the following properties:
    *
    * `does_zap_garbage` is a 0/1 boolean, which signifies whether the`--zap_code_space` option is enabled or not. This makes V8 overwrite heap
    * garbage with a bit pattern. The RSS footprint (resident set size) gets bigger
    * because it continuously touches all heap pages and that makes them less likely
    * to get swapped out by the operating system.
    *
    * `number_of_native_contexts` The value of native\_context is the number of the
    * top-level contexts currently active. Increase of this number over time indicates
    * a memory leak.
    *
    * `number_of_detached_contexts` The value of detached\_context is the number
    * of contexts that were detached and not yet garbage collected. This number
    * being non-zero indicates a potential memory leak.
    *
    * ```js
    * {
    *   total_heap_size: 7326976,
    *   total_heap_size_executable: 4194304,
    *   total_physical_size: 7326976,
    *   total_available_size: 1152656,
    *   used_heap_size: 3476208,
    *   heap_size_limit: 1535115264,
    *   malloced_memory: 16384,
    *   peak_malloced_memory: 1127496,
    *   does_zap_garbage: 0,
    *   number_of_native_contexts: 1,
    *   number_of_detached_contexts: 0
    * }
    * ```
    * @since v1.0.0
    */
  @scala.inline
  def getHeapStatistics(): HeapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapInfo]
  
  /**
    * Uses a `DefaultSerializer` to serialize `value` into a buffer.
    * @since v8.0.0
    */
  @scala.inline
  def serialize(value: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * The `v8.setFlagsFromString()` method can be used to programmatically set
    * V8 command-line flags. This method should be used with care. Changing settings
    * after the VM has started may result in unpredictable behavior, including
    * crashes and data loss; or it may simply do nothing.
    *
    * The V8 options available for a version of Node.js may be determined by running`node --v8-options`.
    *
    * Usage:
    *
    * ```js
    * // Print GC events to stdout for one minute.
    * const v8 = require('v8');
    * v8.setFlagsFromString('--trace_gc');
    * setTimeout(() => { v8.setFlagsFromString('--notrace_gc'); }, 60e3);
    * ```
    * @since v1.0.0
    */
  @scala.inline
  def setFlagsFromString(flags: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlagsFromString")(flags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The `v8.stopCoverage()` method allows the user to stop the coverage collection
    * started by `NODE_V8_COVERAGE`, so that V8 can release the execution count
    * records and optimize code. This can be used in conjunction with {@link takeCoverage} if the user wants to collect the coverage on demand.
    * @since v15.1.0, v12.22.0
    */
  @scala.inline
  def stopCoverage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCoverage")().asInstanceOf[Unit]
  
  /**
    * The `v8.takeCoverage()` method allows the user to write the coverage started by `NODE_V8_COVERAGE` to disk on demand. This method can be invoked multiple
    * times during the lifetime of the process. Each time the execution counter will
    * be reset and a new coverage report will be written to the directory specified
    * by `NODE_V8_COVERAGE`.
    *
    * When the process is about to exit, one last coverage will still be written to
    * disk unless {@link stopCoverage} is invoked before the process exits.
    * @since v15.1.0, v12.22.0
    */
  @scala.inline
  def takeCoverage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("takeCoverage")().asInstanceOf[Unit]
  
  /**
    * Generates a snapshot of the current V8 heap and writes it to a JSON
    * file. This file is intended to be used with tools such as Chrome
    * DevTools. The JSON schema is undocumented and specific to the V8
    * engine, and may change from one version of V8 to the next.
    *
    * A heap snapshot is specific to a single V8 isolate. When using `worker threads`, a heap snapshot generated from the main thread will
    * not contain any information about the workers, and vice versa.
    *
    * ```js
    * const { writeHeapSnapshot } = require('v8');
    * const {
    *   Worker,
    *   isMainThread,
    *   parentPort
    * } = require('worker_threads');
    *
    * if (isMainThread) {
    *   const worker = new Worker(__filename);
    *
    *   worker.once('message', (filename) => {
    *     console.log(`worker heapdump: ${filename}`);
    *     // Now get a heapdump for the main thread.
    *     console.log(`main thread heapdump: ${writeHeapSnapshot()}`);
    *   });
    *
    *   // Tell the worker to create a heapdump.
    *   worker.postMessage('heapdump');
    * } else {
    *   parentPort.once('message', (message) => {
    *     if (message === 'heapdump') {
    *       // Generate a heapdump for the worker
    *       // and return the filename to the parent.
    *       parentPort.postMessage(writeHeapSnapshot());
    *     }
    *   });
    * }
    * ```
    * @since v11.13.0
    * @param filename The file path where the V8 heap snapshot is to be saved. If not specified, a file name with the pattern `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process, `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from the main Node.js thread or the id of a
    * worker thread.
    * @return The filename where the snapshot was saved.
    */
  @scala.inline
  def writeHeapSnapshot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")().asInstanceOf[java.lang.String]
  @scala.inline
  def writeHeapSnapshot(fileName: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")(fileName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
