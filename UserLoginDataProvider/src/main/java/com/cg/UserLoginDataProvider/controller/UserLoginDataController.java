package com.cg.UserLoginDataProvider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.UserLoginDataProvider.entity.User;
import com.cg.UserLoginDataProvider.service.UserLoginDataService;

@RestController
public class UserLoginDataController {

	@Autowired
	public UserLoginDataService service;
	
	public UserLoginDataController() {
		System.out.println("Inside DataProvider controller");
	}

	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		System.out.println("inside addMovie() of Controller");
		System.out.println(user);
		service.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> viewAllUsers() {
		System.out.println("inside retrieveAllProducts() of Controller");
		return service.viewAllUsers();
	}
	
	@GetMapping("/users/{userId}")
	public List<User> searchById(@PathVariable int userId) {
		System.out.println("inside retrieveMovie() of Controller");
		List<User> user = service.findByUserId(userId);
		System.out.println("returned user " + user);
		if (user == null) {
			System.out.println("user not found");
		}
		return user;
	}
	
	@DeleteMapping(path = "/deleteUser/{userId}")
	public List<User> deleteUser(@PathVariable int userId) {
		service.deleteUser(userId);
		return service.viewAllUsers();
	}
	
	@GetMapping("/users/id/{userId}/uname/{uname}/password/{password}/role/{role}")
	public void updateUser(@RequestBody User user,@PathVariable int userId,@PathVariable String uname,@PathVariable String password,@PathVariable String role) {
		List<User> users=service.findByUserId(userId);
		for (User x : users) {
			x.setUserId(userId);
			x.setUsername(uname);
			x.setPassword(password);
			x.setRole(role);
		}
		service.addUser(user);
	}
	
}
