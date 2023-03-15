package com.reg.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.reg.entity.User;
import com.reg.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	public UserService service;
	
//	Default mapping for pages             *****************************************************
	@GetMapping("/")
	public String home() {
		return "login";
}
	@GetMapping("log")
	public String login() {
		return "login";
}
	@GetMapping("reg")
	public String register() {
		return "register";
}

	
	// for register Employee             *******************************************************
	
	@PostMapping("register")
	public String register(@ModelAttribute User user ) {
		 service.addUser(user);
		 return "register";
	}
	
	// for login Employee   
	@PostMapping("/getlogin")
	public String login(User user) {
		User  name=service.checkEmail(user.getEmail());
		User pass=service.checkPass(user.getPassword());
		
		List<User> list=service.list(user);
		
		Iterator<User> itr=list.iterator();
		
		while(itr.hasNext()) {
			User user2=itr.next();
			
			if(name==user2 && pass==user2) {
				System.out.println(user2);
				return "register";
			}
			else {
				
			}	
		}
		System.out.println("User Not found");
		return "login";
	}
}

