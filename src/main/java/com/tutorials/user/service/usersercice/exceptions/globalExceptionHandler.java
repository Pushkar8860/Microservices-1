package com.tutorials.user.service.usersercice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tutorials.user.service.usersercice.exceptions.ApiRespnse.ApiRespnseBuilder;

@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler(ResourceNotFpondException.class)
    public ResponseEntity<ApiRespnse> handleresourceNotFoundException(ResourceNotFpondException ex) {
        String message = ex.getMessage();
        ApiRespnseBuilder apiRespnse = ApiRespnse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND);
        return new ResponseEntity<ApiRespnse>(HttpStatus.NOT_FOUND);
    }
}
