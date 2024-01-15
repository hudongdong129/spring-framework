package com.hdd.annotation;

import org.springframework.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hdd
 * @description:
 * @date 2024年01月08日
 */
@Configuration
public class MyPropertyValue {

	@Bean
	public Person person() {
		return new Person();
	}
}
