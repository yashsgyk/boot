package com.yash.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	//Comments
	@GetMapping("/employee")
	public String getEmployees() {
		System.out.println("Getting list of employees");
<<<<<<< HEAD
		System.out.println("Adding something");
=======
		System.out.println("Adding");
>>>>>>> 1ddd0706bb99328eac26fe737c243146daab8dac
		return "list of employees from db";
	}
	
	@GetMapping("/employee/{id}")
	public String getEmployee(@PathParam("id") Long id) {
		System.out.println("Getting employees with id");
		return "employee with id";
	}
	

}
