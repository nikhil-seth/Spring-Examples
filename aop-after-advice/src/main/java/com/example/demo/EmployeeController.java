package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	@GetMapping("/add/employee")
	public Employee addEmployee(@RequestParam("empId") String empId,@RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
		return empservice.createEmployee(empId,firstName,secondName);
	}
	@GetMapping("/remove/employee")
	public String removeEmployee(@RequestParam("empId") String empId) {
		empservice.deleteEmployee(empId);
		return "Employee Removed";
	}
}