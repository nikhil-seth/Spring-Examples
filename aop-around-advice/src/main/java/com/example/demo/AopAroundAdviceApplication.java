package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//@EnableAspectJAutoProxy annotation enables support for handling the components marked with @Aspect annotation. It is similar to tag in the xml configuration.
@SpringBootApplication
@EnableAspectJAutoProxy
public class AopAroundAdviceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopAroundAdviceApplication.class, args);
		// Fetching the employee object from the application context.  
		BankService bank = context.getBean(BankService.class);  
		// Displaying balance in the account  
		String accnumber = "12345";  
		bank.displayBalance(accnumber);  
		// Closing the context object  
		context.close();  
	}
}
