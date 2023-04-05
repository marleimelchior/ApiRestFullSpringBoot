package com.marleimelchior.projectSpringRestFull.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marleimelchior.projectSpringRestFull.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User marlei = new User("1", "Marlei silva", "marlei@gmail");
		User fernanda = new User("2", "Fernanda silva", "fernanda@gmail");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(marlei, fernanda));
		return ResponseEntity.ok().body(list);
	}
}
