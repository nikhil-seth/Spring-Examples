package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	@After(value="execution(* EmployeeService.*(..)) and args(empId,fname,lname)")
	public void afterAdvice(JoinPoint jp,String empId,String fname,String lname) {
		System.out.println("After method:" + jp.getSignature());
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + lname + " and id - " + empId);  
	}
}