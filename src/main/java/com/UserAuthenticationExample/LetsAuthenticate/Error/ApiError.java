package com.UserAuthenticationExample.LetsAuthenticate.Error;

import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import java.time.LocalDateTime;
import java.util.Date;

public class ApiError {
    private LocalDateTime date;

    private String error;

    private HttpStatus httpStatus;

    public  ApiError(){
    this.date = LocalDateTime.now();
    }
    public ApiError(String error,HttpStatus httpStatus){
        this();
        this.error = error;
        this.httpStatus = httpStatus;
    }
}