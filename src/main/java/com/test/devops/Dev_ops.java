package com.test.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dev_ops {
	@GetMapping(value="/hi")
	public String getHello() {
		return "welcome Jenkins";
	}


}
