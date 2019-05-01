package com.example.demo.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
public class TestController {
	@GetMapping("/{group}/{id}")
	public ResponseEntity<User> getUser(@PathVariable String group, @PathVariable String id) {
		log.info("# try getUser : {} / {}", group, id);
		return ResponseEntity.ok(new User(id, "khs"));
	}
	
	@PostMapping("/{group}/{id}")
	public ResponseEntity<User> postUser(@PathVariable String group, @PathVariable String id) {
		log.info("# try post User : {} / {}", group, id);
		return ResponseEntity.ok(new User(id, "updated khs")); 
	}
}
