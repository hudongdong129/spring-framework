package com.hdd.example.aop;

/**
 * @author hdd
 * @description: 日志切面
 * @date 2024年05月11日
 */
//@Aspect
public class LogUtil {


    public void before(){
        System.out.println("before");
    }
    public void after(){
        System.out.println("after");
    }
    public void afterReturing(){
        System.out.println("afterReturing");
    }
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }
//    public void around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before");
//        //对原始方法的调用
//        pjp.proceed();
//        System.out.println("around after");
//    }
}
