package com.marleimelchior.projectSpringRestFull.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.marleimelchior.projectSpringRestFull.domain.User;
import com.marleimelchior.projectSpringRestFull.repository.UserRepository;


@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		
		User marlei = new User(null, "marlei silva", "marlei@gmail.com");
		User fernanda = new User(null, "fernanda silva", "fernanda@gmail.com");
		User isaac = new User(null, "isaac silva", "isaac@gmail.com");
		
		
		userRepository.save(Arrays.asList(marlei, fernanda, isaac));
	}

}
