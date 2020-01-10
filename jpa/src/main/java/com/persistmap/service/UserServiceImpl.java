package com.persistmap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistmap.entity.User;
import com.persistmap.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepo;

	@Override
	public User addUser(User user) {

		return userrepo.save(user);
	}

}
