package com.cg.UserLoginDataProvider.service;

import java.util.List;

import com.cg.UserLoginDataProvider.entity.User;

public interface UserLoginService {

	User addUser(User user);

	List<User> viewAllUsers();

	List<User> findByUserId(int userId);

	void deleteUser(int userId);
	
	
	
}
