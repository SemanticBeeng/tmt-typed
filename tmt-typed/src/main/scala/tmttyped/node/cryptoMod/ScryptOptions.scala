package tmttyped.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScryptOptions extends StObject {
  
  var N: js.UndefOr[Double] = js.undefined
  
  var blockSize: js.UndefOr[Double] = js.undefined
  
  var cost: js.UndefOr[Double] = js.undefined
  
  var maxmem: js.UndefOr[Double] = js.undefined
  
  var p: js.UndefOr[Double] = js.undefined
  
  var parallelization: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
}
object ScryptOptions {
  
  @scala.inline
  def apply(): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScryptOptions]
  }
  
  @scala.inline
  implicit class ScryptOptionsMutableBuilder[Self <: ScryptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    @scala.inline
    def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    @scala.inline
    def setMaxmem(value: Double): Self = StObject.set(x, "maxmem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxmemUndefined: Self = StObject.set(x, "maxmem", js.undefined)
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    @scala.inline
    def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
