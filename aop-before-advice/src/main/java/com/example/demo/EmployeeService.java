package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public Employee createEmployee(String empId,String firstName,String lastName) {
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setFirstName(firstName);
		emp.setSecondName(lastName);
		return emp;
	}
	public void deleteEmployee(String empId) {
		// Neeed to add delete functionality
	}
}
