package com.example.demo.exception;

import org.springframework.web.bind.annotaion.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String>handleValidationException(Validat){
        return new ResponseBody
    }
}