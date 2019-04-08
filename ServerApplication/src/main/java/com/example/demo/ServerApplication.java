package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping(path="/servers")
public class ServerApplication {
	
	@RequestMapping("/details")
	public String getDetail() {
		Test t1 = new Test();
		return ResponseEntity.ok().body("hi from server").getBody();
		
	}

}
