package com.reg.service;


import java.util.List;

import com.reg.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public List<User> list(User user);
	
	public 	User checkEmail(String email);
	
	public User checkPass(String pass);
}
