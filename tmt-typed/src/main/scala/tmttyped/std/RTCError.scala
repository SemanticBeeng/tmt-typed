package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCError
  extends StObject
     with DOMException {
  
  val errorDetail: RTCErrorDetailType
  
  val receivedAlert: Double | Null
  
  val sctpCauseCode: Double | Null
  
  val sdpLineNumber: Double | Null
  
  val sentAlert: Double | Null
}
object RTCError {
  
  @scala.inline
  def apply(
    ABORT_ERR: Double,
    DATA_CLONE_ERR: Double,
    DOMSTRING_SIZE_ERR: Double,
    HIERARCHY_REQUEST_ERR: Double,
    INDEX_SIZE_ERR: Double,
    INUSE_ATTRIBUTE_ERR: Double,
    INVALID_ACCESS_ERR: Double,
    INVALID_CHARACTER_ERR: Double,
    INVALID_MODIFICATION_ERR: Double,
    INVALID_NODE_TYPE_ERR: Double,
    INVALID_STATE_ERR: Double,
    NAMESPACE_ERR: Double,
    NETWORK_ERR: Double,
    NOT_FOUND_ERR: Double,
    NOT_SUPPORTED_ERR: Double,
    NO_DATA_ALLOWED_ERR: Double,
    NO_MODIFICATION_ALLOWED_ERR: Double,
    QUOTA_EXCEEDED_ERR: Double,
    SECURITY_ERR: Double,
    SYNTAX_ERR: Double,
    TIMEOUT_ERR: Double,
    TYPE_MISMATCH_ERR: Double,
    URL_MISMATCH_ERR: Double,
    VALIDATION_ERR: Double,
    WRONG_DOCUMENT_ERR: Double,
    code: Double,
    errorDetail: RTCErrorDetailType,
    message: java.lang.String,
    name: java.lang.String
  ): RTCError = {
    val __obj = js.Dynamic.literal(ABORT_ERR = ABORT_ERR.asInstanceOf[js.Any], DATA_CLONE_ERR = DATA_CLONE_ERR.asInstanceOf[js.Any], DOMSTRING_SIZE_ERR = DOMSTRING_SIZE_ERR.asInstanceOf[js.Any], HIERARCHY_REQUEST_ERR = HIERARCHY_REQUEST_ERR.asInstanceOf[js.Any], INDEX_SIZE_ERR = INDEX_SIZE_ERR.asInstanceOf[js.Any], INUSE_ATTRIBUTE_ERR = INUSE_ATTRIBUTE_ERR.asInstanceOf[js.Any], INVALID_ACCESS_ERR = INVALID_ACCESS_ERR.asInstanceOf[js.Any], INVALID_CHARACTER_ERR = INVALID_CHARACTER_ERR.asInstanceOf[js.Any], INVALID_MODIFICATION_ERR = INVALID_MODIFICATION_ERR.asInstanceOf[js.Any], INVALID_NODE_TYPE_ERR = INVALID_NODE_TYPE_ERR.asInstanceOf[js.Any], INVALID_STATE_ERR = INVALID_STATE_ERR.asInstanceOf[js.Any], NAMESPACE_ERR = NAMESPACE_ERR.asInstanceOf[js.Any], NETWORK_ERR = NETWORK_ERR.asInstanceOf[js.Any], NOT_FOUND_ERR = NOT_FOUND_ERR.asInstanceOf[js.Any], NOT_SUPPORTED_ERR = NOT_SUPPORTED_ERR.asInstanceOf[js.Any], NO_DATA_ALLOWED_ERR = NO_DATA_ALLOWED_ERR.asInstanceOf[js.Any], NO_MODIFICATION_ALLOWED_ERR = NO_MODIFICATION_ALLOWED_ERR.asInstanceOf[js.Any], QUOTA_EXCEEDED_ERR = QUOTA_EXCEEDED_ERR.asInstanceOf[js.Any], SECURITY_ERR = SECURITY_ERR.asInstanceOf[js.Any], SYNTAX_ERR = SYNTAX_ERR.asInstanceOf[js.Any], TIMEOUT_ERR = TIMEOUT_ERR.asInstanceOf[js.Any], TYPE_MISMATCH_ERR = TYPE_MISMATCH_ERR.asInstanceOf[js.Any], URL_MISMATCH_ERR = URL_MISMATCH_ERR.asInstanceOf[js.Any], VALIDATION_ERR = VALIDATION_ERR.asInstanceOf[js.Any], WRONG_DOCUMENT_ERR = WRONG_DOCUMENT_ERR.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], errorDetail = errorDetail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], receivedAlert = null, sctpCauseCode = null, sdpLineNumber = null, sentAlert = null)
    __obj.asInstanceOf[RTCError]
  }
  
  @scala.inline
  implicit class RTCErrorMutableBuilder[Self <: RTCError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: RTCErrorDetailType): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedAlert(value: Double): Self = StObject.set(x, "receivedAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedAlertNull: Self = StObject.set(x, "receivedAlert", null)
    
    @scala.inline
    def setSctpCauseCode(value: Double): Self = StObject.set(x, "sctpCauseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSctpCauseCodeNull: Self = StObject.set(x, "sctpCauseCode", null)
    
    @scala.inline
    def setSdpLineNumber(value: Double): Self = StObject.set(x, "sdpLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpLineNumberNull: Self = StObject.set(x, "sdpLineNumber", null)
    
    @scala.inline
    def setSentAlert(value: Double): Self = StObject.set(x, "sentAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentAlertNull: Self = StObject.set(x, "sentAlert", null)
  }
}
