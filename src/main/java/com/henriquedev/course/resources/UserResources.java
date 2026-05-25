package com.henriquedev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henriquedev.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping()
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Neymar Jr", "neymar@gmail.com", "1111111", "124345");
		return ResponseEntity.ok().body(user);
	}
	
}
