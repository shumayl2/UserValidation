package com.UserAuthenticationExample.LetsAuthenticate.AspectExample;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService.getAllUser(..))")
    public void log(){
        System.out.println("this is logging before the method");
    }
}
