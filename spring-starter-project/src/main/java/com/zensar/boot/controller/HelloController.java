package com.zensar.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping
	public String sayHello() {
		return "<h1>hello</h1>";
	}

}
