package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/hello")
	public String greeting() {
		return "Hello";
	}
}