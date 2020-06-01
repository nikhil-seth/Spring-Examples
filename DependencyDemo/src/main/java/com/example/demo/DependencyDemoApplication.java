package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyDemoApplication.class, args);
		// Import Conf... , It will return object at time of execution. This will help us get it.
		Customers c=context.getBean(Customers.class);
		// We create an object of class Customers at Runtime.
		c.display();
		// We called customers class ka display method
	}
}
