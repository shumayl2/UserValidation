package com.UserAuthenticationExample.LetsAuthenticate.AspectExample;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroudAspect {

    @Around("execution(* com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService.getAllUser(..))")
    public Object aroundexample(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("this is before method ");
        Object proceed = joinPoint.proceed();
        System.out.println("this is executed after the method");

        return proceed;
    }
}
