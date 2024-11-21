package GlobalExceptionHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import  java.util.Date;

//this is one way of handling exception
//@Controler and ResponseEntityExceptionHandler
//ResponseEntityExceptionhandler
@ControllerAdvice
public class Exception extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        CustomeresponseException customeresponseException=new CustomeresponseException(new Date(),ex.getMessage());
    return  ResponseEntity.badRequest().body(customeresponseException);
    }
}
