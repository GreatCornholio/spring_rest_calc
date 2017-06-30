package calc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalcController {

    @RequestMapping("/calc")
    public Calc calc(@RequestParam(value="op", required=true) String op,
                     @RequestParam(value="f", required=true) Float firstNum,
                     @RequestParam(value="s", required=false) Float secondNum
                     ) {
        return new Calc(op, firstNum, secondNum);
    }

    @ExceptionHandler(CalcException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(RuntimeException ex) {
        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.BAD_REQUEST.value());
        error.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
    }
}