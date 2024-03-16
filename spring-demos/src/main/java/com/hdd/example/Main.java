package com.hdd.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Person person = applicationContext.getBean(Person.class);

		System.out.println(person.getName());
	}
}