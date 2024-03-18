package com.hdd.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author hdd
 * @description:
 * @date 2024年03月16日
 */
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	public String print() {
		System.out.println(personService.print());
		return "PersonController";
	}

}
