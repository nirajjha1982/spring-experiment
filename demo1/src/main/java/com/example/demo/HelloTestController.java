package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {
	@GetMapping
	public String hello() {
		return "hello";
		
	}

}
