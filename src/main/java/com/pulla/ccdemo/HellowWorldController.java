package com.pulla.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi i am CC Demo -v2";
	}

}
