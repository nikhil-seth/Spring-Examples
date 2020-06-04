package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository ur;
	public List<UserRecord> getAllUsers(){
		List<UserRecord>userRecords = new ArrayList<>();    
		ur.findAll().forEach(userRecords::add);    
		return userRecords;    
	}
	public void addUser(UserRecord userrecord) {
		ur.save(userrecord);
	}
}
