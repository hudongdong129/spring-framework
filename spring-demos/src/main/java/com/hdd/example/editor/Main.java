package com.hdd.example.editor;

import com.hdd.example.aop.CalculService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("convert-application.xml");
		Person bean = applicationContext.getBean(Person.class);
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//		Integer add = applicationContext.getBean(CalculService.class).add(1, 2);
		System.out.println(bean);
	}
}