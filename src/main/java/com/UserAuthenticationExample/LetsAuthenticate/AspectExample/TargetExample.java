package com.UserAuthenticationExample.LetsAuthenticate.AspectExample;


import org.apache.tomcat.util.security.Escape;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class TargetExample {

    @Around("target(com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService)")

    //Target ka kaam yei hota hai ki jaha per bhi kissi bhi class ko autowired kiya gaya hai
    //jabhi uska object use hoga to call any method of the Student Service class mei tab Advice invoke ho jayage
    //Humare case mei use are using StudentController jiskei andar StudentService Autowired hai
    public Object hello(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("This is before join Point");
        Object proceed = joinPoint.proceed();
        System.out.println("Hello bhai mai Join point kei baad ka hoon");
        return proceed;
    }
}
