package com.hdd.example.proxy.jdk;

import com.hdd.example.aop.CalculService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		MyCalculServiceIface proxy = CalculatorProxy.getProxy(new MyCalculService());
		proxy.add(1, 2);
		System.out.println(proxy.getClass().getName());
	}
}