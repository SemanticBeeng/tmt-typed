package tmttyped.std

import tmttyped.std.stdStrings.anyfunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  trait CompileError extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - tmttyped.std.WebAssembly.Global
    - tmttyped.std.WebAssembly.Memory
    - tmttyped.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  trait Global
    extends StObject
       with _ExportValue {
    
    var value: js.Any
  }
  object Global {
    
    @scala.inline
    def apply(value: js.Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalDescriptor extends StObject {
    
    var mutable: js.UndefOr[scala.Boolean] = js.undefined
    
    var value: ValueType
  }
  object GlobalDescriptor {
    
    @scala.inline
    def apply(value: ValueType): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
    
    @scala.inline
    implicit class GlobalDescriptorMutableBuilder[Self <: GlobalDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.stdStrings.function
    - tmttyped.std.stdStrings.global
    - tmttyped.std.stdStrings.memory
    - tmttyped.std.stdStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    @scala.inline
    def function: tmttyped.std.stdStrings.function = "function".asInstanceOf[tmttyped.std.stdStrings.function]
    
    @scala.inline
    def global: tmttyped.std.stdStrings.global = "global".asInstanceOf[tmttyped.std.stdStrings.global]
    
    @scala.inline
    def memory: tmttyped.std.stdStrings.memory = "memory".asInstanceOf[tmttyped.std.stdStrings.memory]
    
    @scala.inline
    def table: tmttyped.std.stdStrings.table = "table".asInstanceOf[tmttyped.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  trait Instance extends StObject {
    
    val exports: Exports
  }
  object Instance {
    
    @scala.inline
    def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkError extends StObject
  
  trait Memory
    extends StObject
       with _ExportValue {
    
    val buffer: js.typedarray.ArrayBuffer
    
    def grow(delta: Double): Double
  }
  object Memory {
    
    @scala.inline
    def apply(buffer: js.typedarray.ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    @scala.inline
    implicit class MemoryMutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  trait MemoryDescriptor extends StObject {
    
    var initial: Double
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var shared: js.UndefOr[scala.Boolean] = js.undefined
  }
  object MemoryDescriptor {
    
    @scala.inline
    def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    @scala.inline
    implicit class MemoryDescriptorMutableBuilder[Self <: MemoryDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setShared(value: scala.Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    }
  }
  
  trait Module extends StObject
  
  trait ModuleExportDescriptor extends StObject {
    
    var kind: ImportExportKind
    
    var name: java.lang.String
  }
  object ModuleExportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    @scala.inline
    implicit class ModuleExportDescriptorMutableBuilder[Self <: ModuleExportDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleImportDescriptor extends StObject {
    
    var kind: ImportExportKind
    
    var module: java.lang.String
    
    var name: java.lang.String
  }
  object ModuleImportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    @scala.inline
    implicit class ModuleImportDescriptorMutableBuilder[Self <: ModuleImportDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  trait RuntimeError extends StObject
  
  @js.native
  trait Table
    extends StObject
       with _ExportValue {
    
    def get(index: Double): js.Function | Null = js.native
    
    def grow(delta: Double): Double = js.native
    
    val length: Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: js.Function): Unit = js.native
  }
  
  trait TableDescriptor extends StObject {
    
    var element: TableKind
    
    var initial: Double
    
    var maximum: js.UndefOr[Double] = js.undefined
  }
  object TableDescriptor {
    
    @scala.inline
    def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    @scala.inline
    implicit class TableDescriptorMutableBuilder[Self <: TableDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  type TableKind = anyfunc
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.stdStrings.f32
    - tmttyped.std.stdStrings.f64
    - tmttyped.std.stdStrings.i32
    - tmttyped.std.stdStrings.i64
  */
  trait ValueType extends StObject
  object ValueType {
    
    @scala.inline
    def f32: tmttyped.std.stdStrings.f32 = "f32".asInstanceOf[tmttyped.std.stdStrings.f32]
    
    @scala.inline
    def f64: tmttyped.std.stdStrings.f64 = "f64".asInstanceOf[tmttyped.std.stdStrings.f64]
    
    @scala.inline
    def i32: tmttyped.std.stdStrings.i32 = "i32".asInstanceOf[tmttyped.std.stdStrings.i32]
    
    @scala.inline
    def i64: tmttyped.std.stdStrings.i64 = "i64".asInstanceOf[tmttyped.std.stdStrings.i64]
  }
  
  trait WebAssemblyInstantiatedSource extends StObject {
    
    var instance: Instance
    
    var module: Module
  }
  object WebAssemblyInstantiatedSource {
    
    @scala.inline
    def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    @scala.inline
    implicit class WebAssemblyInstantiatedSourceMutableBuilder[Self <: WebAssemblyInstantiatedSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExportValue extends StObject
}
