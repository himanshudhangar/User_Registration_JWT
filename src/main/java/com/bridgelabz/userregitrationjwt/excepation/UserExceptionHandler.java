package com.bridgelabz.userregitrationjwt.excepation;
import com.bridgelabz.userregitrationjwt.dto.ResponseDTO;
import jdk.jshell.spi.ExecutionControl;
//import org.omg.CORBA.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList= exception.getBindingResult().getAllErrors();
        List<String> errMesg =  errorList.stream()
                .map(objectError -> objectError.getDefaultMessage())
                .collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Exception While processing REST Request",errMesg);
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ExecutionControl.UserException.class)
    public ResponseEntity<ResponseDTO> handleMethodUserException(ExecutionControl.UserException exception){
        ResponseDTO responseDTO = new ResponseDTO("Exception While processing REST Request",exception.getMessage());
        return new ResponseEntity<>(responseDTO,HttpStatus.BAD_REQUEST);
    }
}