package org.sarsandi.rajeev.validationdemo.advise;

import org.sarsandi.rajeev.validationdemo.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public Map<String,String> handleInvalidArgException(MethodArgumentNotValidException ex){

        Map<String,String> errorMap=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->{
            errorMap.put(error.getField(),error.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public Map<String,String> handleUserIdNotFoundException(UserNotFoundException ex){

        Map<String,String> errorMap=new HashMap<>();
            errorMap.put("errorMessage",ex.getMessage());

        return errorMap;
    }
}
