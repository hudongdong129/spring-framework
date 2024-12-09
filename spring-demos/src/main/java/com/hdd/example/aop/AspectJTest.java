package com.hdd.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author hdd
 * @description:
 * @date 2024年11月28日
 */
@Aspect
public class AspectJTest {


    @Pointcut("execution(* *.test(..))")
    public void test(){
    }

    @Before("test()")
    public void beforeTest(){
        System.out.println("before test");
    }

    @After("test()")
    public void afterTest(){
        System.out.println("after test");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p){
        System.out.println("before1");
        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("after1");
        return o;
    }
}
