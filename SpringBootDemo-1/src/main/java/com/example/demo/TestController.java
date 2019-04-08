package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", method=RequestMethod.GET)
public class TestController {
	
	@RequestMapping("/test")
	public String sayHello() {
		return "hi, hello how are you";
	}
}
