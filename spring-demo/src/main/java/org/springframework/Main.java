package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("applicationcontext.xml");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Person person = applicationContext.getBean(Person.class);

		System.out.println(person.getName());
	}
}