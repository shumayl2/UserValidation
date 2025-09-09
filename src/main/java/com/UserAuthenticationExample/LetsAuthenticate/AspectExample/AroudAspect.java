package com.UserAuthenticationExample.LetsAuthenticate.AspectExample;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//public class AroudAspect {

//    @Pointcut("execution(* com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService.getAllUser(..))")
//    private void addPointCut(){
//
//    }
//
//   // @Around("execution(* com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService.getAllUser(..))")
//    @Around("addPointCut()")
//    public Object aroundexample(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("this is before method ");
//        Object proceed = joinPoint.proceed();
//        System.out.println("this is executed after the method");
//
//        return proceed;

        //We also have something called as named point cut
        //jaha we can generify the pontcut excpression  and directly apply on the Annotations like "Before" , "After" etc
        //Check line number 13.




//    }
//}
