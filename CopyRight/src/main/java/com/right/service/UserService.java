package com.right.service;

import java.util.List;

import com.right.entity.User;

public interface UserService {
	
	User createUser(User user);
	User getUserId(Long id);
	
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	void deleteUser(Long id);

}
