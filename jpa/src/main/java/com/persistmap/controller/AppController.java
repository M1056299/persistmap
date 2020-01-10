package com.persistmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistmap.entity.User;
import com.persistmap.service.UserService;

@RestController
public class AppController {

	@Autowired
	private UserService us;

	@PostMapping("/adduser")
	public String adduser(User user) {
		us.addUser(user);
		return "inserted";
	}

}
