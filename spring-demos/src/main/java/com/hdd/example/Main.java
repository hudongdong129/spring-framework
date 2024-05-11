package com.hdd.example;

import com.hdd.example.aop.CalculService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//		Person person = applicationContext.getBean(Person.class);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		Integer add = applicationContext.getBean(CalculService.class).add(1, 2);
		System.out.println(add);
	}
}