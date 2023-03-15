package com.reg.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.entity.User;
import com.reg.repository.UserRepository;
import com.reg.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository repo;
	
	@Override
	public User addUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public 	User checkEmail(String email) {
		return repo.checkEmail(email);
	}

	@Override
	public 	User checkPass(String pass) {
	return repo.checkPass(pass);
	}

	@Override
	public List<User> list(User user) {
	return repo.findAll();
	}

}
