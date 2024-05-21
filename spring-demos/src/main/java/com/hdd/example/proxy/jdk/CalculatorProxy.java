package com.hdd.example.proxy.jdk;

import com.hdd.example.aop.CalculService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hdd
 * @description:
 * @date 2024年05月20日
 */
public class CalculatorProxy {

    public static MyCalculServiceIface getProxy(MyCalculService calculService) {
        ClassLoader loader = calculService.getClass().getClassLoader();
        Class<?>[] interfaces = calculService.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               Object result = null;
                try {
                    result = method.invoke(calculService, args);
                    System.out.println("after");

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return result;
            }
        };
        Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
        return (MyCalculServiceIface) proxy;
    }


}
