package tmttyped.node

import tmttyped.node.anon.encodingBufferEncodingExe
import tmttyped.node.anon.encodingbuffernullExecOpt
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.childProcessMod.ChildProcess
import tmttyped.node.childProcessMod.ChildProcessByStdio
import tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams
import tmttyped.node.childProcessMod.ExecException
import tmttyped.node.childProcessMod.ExecFileException
import tmttyped.node.childProcessMod.ExecFileOptions
import tmttyped.node.childProcessMod.ExecFileOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.ExecFileOptionsWithOtherEncoding
import tmttyped.node.childProcessMod.ExecFileOptionsWithStringEncoding
import tmttyped.node.childProcessMod.ExecFileSyncOptions
import tmttyped.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
import tmttyped.node.childProcessMod.ExecOptions
import tmttyped.node.childProcessMod.ExecSyncOptions
import tmttyped.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import tmttyped.node.childProcessMod.ForkOptions
import tmttyped.node.childProcessMod.SpawnOptions
import tmttyped.node.childProcessMod.SpawnOptionsWithStdioTuple
import tmttyped.node.childProcessMod.SpawnOptionsWithoutStdio
import tmttyped.node.childProcessMod.SpawnSyncOptions
import tmttyped.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import tmttyped.node.childProcessMod.SpawnSyncReturns
import tmttyped.node.childProcessMod.StdioNull
import tmttyped.node.childProcessMod.StdioPipe
import tmttyped.node.fsMod.ObjectEncodingOptions
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.nodeStreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeChildProcessMod {
  
  @JSImport("node:child_process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Spawns a shell then executes the `command` within that shell, buffering any
    * generated output. The `command` string passed to the exec function is processed
    * directly by the shell and special characters (vary based on[shell](https://en.wikipedia.org/wiki/List_of_command-line_interpreters))
    * need to be dealt with accordingly:
    *
    * ```js
    * const { exec } = require('child_process');
    *
    * exec('"/path/to/test file/test.sh" arg1 arg2');
    * // Double quotes are used so that the space in the path is not interpreted as
    * // a delimiter of multiple arguments.
    *
    * exec('echo "The \\$HOME variable is $HOME"');
    * // The $HOME variable is escaped in the first instance, but not in the second.
    * ```
    *
    * **Never pass unsanitized user input to this function. Any input containing shell**
    * **metacharacters may be used to trigger arbitrary command execution.**
    *
    * If a `callback` function is provided, it is called with the arguments`(error, stdout, stderr)`. On success, `error` will be `null`. On error,`error` will be an instance of `Error`. The
    * `error.code` property will be
    * the exit code of the process. By convention, any exit code other than `0`indicates an error. `error.signal` will be the signal that terminated the
    * process.
    *
    * The `stdout` and `stderr` arguments passed to the callback will contain the
    * stdout and stderr output of the child process. By default, Node.js will decode
    * the output as UTF-8 and pass strings to the callback. The `encoding` option
    * can be used to specify the character encoding used to decode the stdout and
    * stderr output. If `encoding` is `'buffer'`, or an unrecognized character
    * encoding, `Buffer` objects will be passed to the callback instead.
    *
    * ```js
    * const { exec } = require('child_process');
    * exec('cat *.js missing_file | wc -l', (error, stdout, stderr) => {
    *   if (error) {
    *     console.error(`exec error: ${error}`);
    *     return;
    *   }
    *   console.log(`stdout: ${stdout}`);
    *   console.error(`stderr: ${stderr}`);
    * });
    * ```
    *
    * If `timeout` is greater than `0`, the parent will send the signal
    * identified by the `killSignal` property (the default is `'SIGTERM'`) if the
    * child runs longer than `timeout` milliseconds.
    *
    * Unlike the [`exec(3)`](http://man7.org/linux/man-pages/man3/exec.3.html) POSIX system call, `child_process.exec()` does not replace
    * the existing process and uses a shell to execute the command.
    *
    * If this method is invoked as its `util.promisify()` ed version, it returns
    * a `Promise` for an `Object` with `stdout` and `stderr` properties. The returned`ChildProcess` instance is attached to the `Promise` as a `child` property. In
    * case of an error (including any error resulting in an exit code other than 0), a
    * rejected promise is returned, with the same `error` object given in the
    * callback, but with two additional properties `stdout` and `stderr`.
    *
    * ```js
    * const util = require('util');
    * const exec = util.promisify(require('child_process').exec);
    *
    * async function lsExample() {
    *   const { stdout, stderr } = await exec('ls');
    *   console.log('stdout:', stdout);
    *   console.error('stderr:', stderr);
    * }
    * lsExample();
    * ```
    *
    * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
    * the error passed to the callback will be an `AbortError`:
    *
    * ```js
    * const { exec } = require('child_process');
    * const controller = new AbortController();
    * const { signal } = controller;
    * const child = exec('grep ssh', { signal }, (error) => {
    *   console.log(error); // an AbortError
    * });
    * controller.abort();
    * ```
    * @since v0.1.90
    * @param command The command to run, with space-separated arguments.
    * @param callback called with the output when process terminates.
    */
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def exec(command: java.lang.String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(command: java.lang.String, options: ObjectEncodingOptions with ExecOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    options: ObjectEncodingOptions with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    options: Unit,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  @scala.inline
  def exec(command: java.lang.String, options: encodingBufferEncodingExe): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    options: encodingBufferEncodingExe,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  @scala.inline
  def exec(command: java.lang.String, options: encodingbuffernullExecOpt): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    options: encodingbuffernullExecOpt,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  @scala.inline
  def exec(command: java.lang.String, options: ExecOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def exec(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  /**
    * The `child_process.execFile()` function is similar to {@link exec} except that it does not spawn a shell by default. Rather, the specified
    * executable `file` is spawned directly as a new process making it slightly more
    * efficient than {@link exec}.
    *
    * The same options as {@link exec} are supported. Since a shell is
    * not spawned, behaviors such as I/O redirection and file globbing are not
    * supported.
    *
    * ```js
    * const { execFile } = require('child_process');
    * const child = execFile('node', ['--version'], (error, stdout, stderr) => {
    *   if (error) {
    *     throw error;
    *   }
    *   console.log(stdout);
    * });
    * ```
    *
    * The `stdout` and `stderr` arguments passed to the callback will contain the
    * stdout and stderr output of the child process. By default, Node.js will decode
    * the output as UTF-8 and pass strings to the callback. The `encoding` option
    * can be used to specify the character encoding used to decode the stdout and
    * stderr output. If `encoding` is `'buffer'`, or an unrecognized character
    * encoding, `Buffer` objects will be passed to the callback instead.
    *
    * If this method is invoked as its `util.promisify()` ed version, it returns
    * a `Promise` for an `Object` with `stdout` and `stderr` properties. The returned`ChildProcess` instance is attached to the `Promise` as a `child` property. In
    * case of an error (including any error resulting in an exit code other than 0), a
    * rejected promise is returned, with the same `error` object given in the
    * callback, but with two additional properties `stdout` and `stderr`.
    *
    * ```js
    * const util = require('util');
    * const execFile = util.promisify(require('child_process').execFile);
    * async function getVersion() {
    *   const { stdout } = await execFile('node', ['--version']);
    *   console.log(stdout);
    * }
    * getVersion();
    * ```
    *
    * **If the `shell` option is enabled, do not pass unsanitized user input to this**
    * **function. Any input containing shell metacharacters may be used to trigger**
    * **arbitrary command execution.**
    *
    * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
    * the error passed to the callback will be an `AbortError`:
    *
    * ```js
    * const { execFile } = require('child_process');
    * const controller = new AbortController();
    * const { signal } = controller;
    * const child = execFile('node', ['--version'], { signal }, (error) => {
    *   console.log(error); // an AbortError
    * });
    * controller.abort();
    * ```
    * @since v0.1.91
    * @param file The name or path of the executable file to run.
    * @param args List of string arguments.
    * @param callback Called with the output when process terminates.
    */
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def execFile(file: java.lang.String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ObjectEncodingOptions with ExecFileOptions
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ObjectEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Null,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Unit,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    callback: js.Function3[
      ExecFileException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(file: java.lang.String, args: Null, options: ObjectEncodingOptions with ExecFileOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ObjectEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: Null,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: Unit,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    callback: js.Function3[
      ExecFileException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(file: java.lang.String, args: Unit, options: ObjectEncodingOptions with ExecFileOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: ObjectEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: Null,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: Unit,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Unit,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // no `options` definitely means stdout/stderr are `string`.
  @scala.inline
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(file: java.lang.String, options: ObjectEncodingOptions with ExecFileOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ObjectEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  @scala.inline
  def execFileSync(command: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String], options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, args: Unit, options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, args: Unit, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, args: Unit, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
    * return until the child process has fully closed. When a timeout has been
    * encountered and `killSignal` is sent, the method won't return until the process
    * has completely exited.
    *
    * If the child process intercepts and handles the `SIGTERM` signal and
    * does not exit, the parent process will still wait until the child process has
    * exited.
    *
    * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
    *
    * **If the `shell` option is enabled, do not pass unsanitized user input to this**
    * **function. Any input containing shell metacharacters may be used to trigger**
    * **arbitrary command execution.**
    * @since v0.11.12
    * @param file The name or path of the executable file to run.
    * @param args List of string arguments.
    * @return The stdout from the command.
    */
  @scala.inline
  def execFileSync_Buffer(command: java.lang.String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync_Buffer(command: java.lang.String, args: js.Array[java.lang.String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def execSync(command: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def execSync(command: java.lang.String, options: ExecSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithStringEncoding): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * The `child_process.execSync()` method is generally identical to {@link exec} with the exception that the method will not return
    * until the child process has fully closed. When a timeout has been encountered
    * and `killSignal` is sent, the method won't return until the process has
    * completely exited. If the child process intercepts and handles the `SIGTERM`signal and doesn't exit, the parent process will wait until the child process
    * has exited.
    *
    * If the process times out or has a non-zero exit code, this method will throw.
    * The `Error` object will contain the entire result from {@link spawnSync}.
    *
    * **Never pass unsanitized user input to this function. Any input containing shell**
    * **metacharacters may be used to trigger arbitrary command execution.**
    * @since v0.11.12
    * @param command The command to run.
    * @return The stdout from the command.
    */
  @scala.inline
  def execSync_Buffer(command: java.lang.String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * The `child_process.fork()` method is a special case of {@link spawn} used specifically to spawn new Node.js processes.
    * Like {@link spawn}, a `ChildProcess` object is returned. The
    * returned `ChildProcess` will have an additional communication channel
    * built-in that allows messages to be passed back and forth between the parent and
    * child. See `subprocess.send()` for details.
    *
    * Keep in mind that spawned Node.js child processes are
    * independent of the parent with exception of the IPC communication channel
    * that is established between the two. Each process has its own memory, with
    * their own V8 instances. Because of the additional resource allocations
    * required, spawning a large number of child Node.js processes is not
    * recommended.
    *
    * By default, `child_process.fork()` will spawn new Node.js instances using the `process.execPath` of the parent process. The `execPath` property in the`options` object allows for an alternative
    * execution path to be used.
    *
    * Node.js processes launched with a custom `execPath` will communicate with the
    * parent process using the file descriptor (fd) identified using the
    * environment variable `NODE_CHANNEL_FD` on the child process.
    *
    * Unlike the [`fork(2)`](http://man7.org/linux/man-pages/man2/fork.2.html) POSIX system call, `child_process.fork()` does not clone the
    * current process.
    *
    * The `shell` option available in {@link spawn} is not supported by`child_process.fork()` and will be ignored if set.
    *
    * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
    * the error passed to the callback will be an `AbortError`:
    *
    * ```js
    * if (process.argv[2] === 'child') {
    *   setTimeout(() => {
    *     console.log(`Hello from ${process.argv[2]}!`);
    *   }, 1_000);
    * } else {
    *   const { fork } = require('child_process');
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const child = fork(__filename, ['child'], { signal });
    *   child.on('error', (err) => {
    *     // This will be called with err being an AbortError if the controller aborts
    *   });
    *   controller.abort(); // Stops the child process
    * }
    * ```
    * @since v0.5.0
    * @param modulePath The module to run in the child.
    * @param args List of string arguments.
    */
  @scala.inline
  def fork(modulePath: java.lang.String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String], options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: Unit, options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  /**
    * The `child_process.spawn()` method spawns a new process using the given`command`, with command-line arguments in `args`. If omitted, `args` defaults
    * to an empty array.
    *
    * **If the `shell` option is enabled, do not pass unsanitized user input to this**
    * **function. Any input containing shell metacharacters may be used to trigger**
    * **arbitrary command execution.**
    *
    * A third argument may be used to specify additional options, with these defaults:
    *
    * ```js
    * const defaults = {
    *   cwd: undefined,
    *   env: process.env
    * };
    * ```
    *
    * Use `cwd` to specify the working directory from which the process is spawned.
    * If not given, the default is to inherit the current working directory. If given,
    * but the path does not exist, the child process emits an `ENOENT` error
    * and exits immediately. `ENOENT` is also emitted when the command
    * does not exist.
    *
    * Use `env` to specify environment variables that will be visible to the new
    * process, the default is `process.env`.
    *
    * `undefined` values in `env` will be ignored.
    *
    * Example of running `ls -lh /usr`, capturing `stdout`, `stderr`, and the
    * exit code:
    *
    * ```js
    * const { spawn } = require('child_process');
    * const ls = spawn('ls', ['-lh', '/usr']);
    *
    * ls.stdout.on('data', (data) => {
    *   console.log(`stdout: ${data}`);
    * });
    *
    * ls.stderr.on('data', (data) => {
    *   console.error(`stderr: ${data}`);
    * });
    *
    * ls.on('close', (code) => {
    *   console.log(`child process exited with code ${code}`);
    * });
    * ```
    *
    * Example: A very elaborate way to run `ps ax | grep ssh`
    *
    * ```js
    * const { spawn } = require('child_process');
    * const ps = spawn('ps', ['ax']);
    * const grep = spawn('grep', ['ssh']);
    *
    * ps.stdout.on('data', (data) => {
    *   grep.stdin.write(data);
    * });
    *
    * ps.stderr.on('data', (data) => {
    *   console.error(`ps stderr: ${data}`);
    * });
    *
    * ps.on('close', (code) => {
    *   if (code !== 0) {
    *     console.log(`ps process exited with code ${code}`);
    *   }
    *   grep.stdin.end();
    * });
    *
    * grep.stdout.on('data', (data) => {
    *   console.log(data.toString());
    * });
    *
    * grep.stderr.on('data', (data) => {
    *   console.error(`grep stderr: ${data}`);
    * });
    *
    * grep.on('close', (code) => {
    *   if (code !== 0) {
    *     console.log(`grep process exited with code ${code}`);
    *   }
    * });
    * ```
    *
    * Example of checking for failed `spawn`:
    *
    * ```js
    * const { spawn } = require('child_process');
    * const subprocess = spawn('bad_command');
    *
    * subprocess.on('error', (err) => {
    *   console.error('Failed to start subprocess.');
    * });
    * ```
    *
    * Certain platforms (macOS, Linux) will use the value of `argv[0]` for the process
    * title while others (Windows, SunOS) will use `command`.
    *
    * Node.js currently overwrites `argv[0]` with `process.execPath` on startup, so`process.argv[0]` in a Node.js child process will not match the `argv0`parameter passed to `spawn` from the parent,
    * retrieve it with the`process.argv0` property instead.
    *
    * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
    * the error passed to the callback will be an `AbortError`:
    *
    * ```js
    * const { spawn } = require('child_process');
    * const controller = new AbortController();
    * const { signal } = controller;
    * const grep = spawn('grep', ['ssh'], { signal });
    * grep.on('error', (err) => {
    *   // This will be called with err being an AbortError if the controller aborts
    * });
    * controller.abort(); // Stops the child process
    * ```
    * @since v0.1.90
    * @param command The command to run.
    * @param args List of string arguments.
    */
  // overloads of spawn with 'args'
  @scala.inline
  def spawn(command: java.lang.String): ChildProcessWithoutNullStreams = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Writable, Readable, Readable]]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Writable, Readable, Readable]]
  @scala.inline
  def spawn(command: java.lang.String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  
  /**
    * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
    * until the child process has fully closed. When a timeout has been encountered
    * and `killSignal` is sent, the method won't return until the process has
    * completely exited. If the process intercepts and handles the `SIGTERM` signal
    * and doesn't exit, the parent process will wait until the child process has
    * exited.
    *
    * **If the `shell` option is enabled, do not pass unsanitized user input to this**
    * **function. Any input containing shell metacharacters may be used to trigger**
    * **arbitrary command execution.**
    * @since v0.11.12
    * @param command The command to run.
    * @param args List of string arguments.
    */
  @scala.inline
  def spawnSync(command: java.lang.String): SpawnSyncReturns[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any]).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: Unit, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: Unit, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: Unit, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
}
