package com.hdd.example.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author hdd
 * @description:
 * @date 2024年05月20日
 */
public class CglibMainTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/hdd");

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyCalculService.class);
        enhancer.setCallback(new CglibProxy());
        MyCalculService myCalculService = (MyCalculService) enhancer.create();
        myCalculService.add(1, 2);
        System.out.println(myCalculService.getClass());

    }
}
