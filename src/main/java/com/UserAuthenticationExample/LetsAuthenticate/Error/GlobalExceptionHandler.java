package com.UserAuthenticationExample.LetsAuthenticate.Error;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<ApiError> usernameNotFound(UsernameNotFoundException usernameNotFoundException ){
        ApiError apiError = new ApiError("User not found " + usernameNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return  new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
    }
}
