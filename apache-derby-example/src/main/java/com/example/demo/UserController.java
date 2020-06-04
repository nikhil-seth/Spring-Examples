package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	@RequestMapping("/")
	public List<UserRecord> getAllUsers(){
		return userservice.getAllUsers();
	}
	@PostMapping("/add-user")
	public void addUser(@RequestBody UserRecord ur) {
		userservice.addUser(ur);
	}
}