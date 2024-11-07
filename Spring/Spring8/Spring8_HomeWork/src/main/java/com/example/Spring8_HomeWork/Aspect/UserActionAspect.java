package com.example.Spring8_HomeWork.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class UserActionAspect {

    private static final Logger logger = LoggerFactory.getLogger(UserActionAspect.class);

    @Before("@annotation(TrackUser)")
    public void Action(JoinPoint joinPoint) {
        String user = joinPoint.getSignature().getName();
        String methodName = joinPoint.getSignature().toString();
        Object[] args = joinPoint.getArgs();
        System.out.println("User " + user + " invoked " + methodName + " with arguments " + Arrays.toString(args));
    }
}
