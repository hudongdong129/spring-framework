package com.hdd.example.annotation;

import com.hdd.example.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hdd
 * @description:
 * @date 2024年03月16日
 */
@Configuration
public class ConfigurationText {

	@Bean
	public Person createPerson() {
		return new Person();
	}

}
