package com.zensar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello() 
	{
		return "Hello javaTpoint && Hello World !!";
	}
	
//	@GetMapping("/employee")
//	public Employee getEmployee() {
//		return new Employee(1001,"Komal",1000);
//	}
}
