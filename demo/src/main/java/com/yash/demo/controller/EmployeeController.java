package com.yash.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public String getEmployees() {
		System.out.println("Getting list of employees");
		return "list of employees";
	}

}
