package com.marleimelchior.projectSpringRestFull.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marleimelchior.projectSpringRestFull.domain.User;
import com.marleimelchior.projectSpringRestFull.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
