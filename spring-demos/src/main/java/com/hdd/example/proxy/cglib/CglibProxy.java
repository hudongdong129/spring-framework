package com.hdd.example.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author hdd
 * @description:
 * @date 2024年05月20日
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("——————————————————————————");
        System.out.println("下一位请登台发言！");
        //目标方法调用
        Object result = proxy.invokeSuper(obj, args);
        //目标方法后执行
        System.out.println("大家掌声鼓励！");
        return result;
    }
}
