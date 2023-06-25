package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		int index = 1;
		String str = "Greetings from Spring Boot + Tanzu!! Welcome! (" + index++ + ")";
		return str;
	}

}
