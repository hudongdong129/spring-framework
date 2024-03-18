package com.hdd.example.annotation;

import com.hdd.example.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationText {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		PersonController personController = applicationContext.getBean(PersonController.class);

		System.out.println(personController.print());
	}
}