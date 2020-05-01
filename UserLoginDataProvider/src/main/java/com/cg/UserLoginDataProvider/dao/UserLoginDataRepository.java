package com.cg.UserLoginDataProvider.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.UserLoginDataProvider.entity.User;

public interface UserLoginDataRepository extends JpaRepository<User, Integer> {
	public List<User> findByUserId(int userId);
}
