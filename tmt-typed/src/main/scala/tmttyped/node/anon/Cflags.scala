package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cflags extends StObject {
  
  val cflags: js.Array[js.Any]
  
  val default_configuration: String
  
  val defines: js.Array[String]
  
  val include_dirs: js.Array[String]
  
  val libraries: js.Array[String]
}
object Cflags {
  
  @scala.inline
  def apply(
    cflags: js.Array[js.Any],
    default_configuration: String,
    defines: js.Array[String],
    include_dirs: js.Array[String],
    libraries: js.Array[String]
  ): Cflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cflags]
  }
  
  @scala.inline
  implicit class CflagsMutableBuilder[Self <: Cflags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCflags(value: js.Array[js.Any]): Self = StObject.set(x, "cflags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCflagsVarargs(value: js.Any*): Self = StObject.set(x, "cflags", js.Array(value :_*))
    
    @scala.inline
    def setDefault_configuration(value: String): Self = StObject.set(x, "default_configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    @scala.inline
    def setInclude_dirs(value: js.Array[String]): Self = StObject.set(x, "include_dirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_dirsVarargs(value: String*): Self = StObject.set(x, "include_dirs", js.Array(value :_*))
    
    @scala.inline
    def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value :_*))
  }
}
