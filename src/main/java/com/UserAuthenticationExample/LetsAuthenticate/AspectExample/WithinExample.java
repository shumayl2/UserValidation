package com.UserAuthenticationExample.LetsAuthenticate.AspectExample;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//public class WithinExample {
//
//    @Pointcut("within(com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService)")
//     private void shayan(){
//
//    }
//
//
//    @Around("shayan()")
//    public Object shumail(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Before the method");
//        Object proceed = joinPoint.proceed();
//        System.out.println("After join points");
//
//        return proceed;
//
//    }
//}
