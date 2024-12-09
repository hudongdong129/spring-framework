package com.hdd.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		TestBean testBean = applicationContext.getBean(TestBean.class);
		testBean.test();
	}
}