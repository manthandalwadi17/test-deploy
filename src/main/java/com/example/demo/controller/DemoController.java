package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.repository.DemoRepository;

@RestController
public class DemoController {
	
	
//	@Autowired
//	private DemoRepository demoRepository;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		
		System.out.println("Calling hello controller");
		
		
		return "Hello";
	}
	

	
}
