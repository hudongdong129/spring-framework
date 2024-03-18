package com.hdd.example.annotation;

import org.springframework.stereotype.Service;

/**
 * @author hdd
 * @description: 实现类
 * @date 2024年03月16日
 */
@Service
public class PersonService {


	public String print() {
		System.out.println("PersonService doing......");
		return "PersonService";
	}
}
