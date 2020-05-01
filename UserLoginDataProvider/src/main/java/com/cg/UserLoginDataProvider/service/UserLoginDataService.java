package com.cg.UserLoginDataProvider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.UserLoginDataProvider.dao.UserLoginDataRepository;
import com.cg.UserLoginDataProvider.entity.User;

@Component(value="service")
public class UserLoginDataService implements UserLoginService{

	@Autowired
	public UserLoginDataRepository userRepo;
	
	public UserLoginDataService() {
		System.out.println("Inside UserLoginDataService ");
	}

	@Override
	public User addUser(User user) {
		System.out.println("Inside add users");
		userRepo.save(user);
		return user;
	}

	@Override
	public List<User> viewAllUsers() {
		System.out.println("inside vuew users");
		return userRepo.findAll();
	}

	@Override
	public List<User> findByUserId(int userId) {
		System.out.println("inside search by id");
		return userRepo.findByUserId(userId);
	}

	@Override
	public void deleteUser(int userId) {
		System.out.println("inside delete by id");
		userRepo.deleteById(userId);
	}
}
