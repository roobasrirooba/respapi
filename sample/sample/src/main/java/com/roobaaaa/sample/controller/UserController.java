package com.roobaaaa.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getData() {
		return ResponseEntity.status(200).body("WELCOME");

	}

}
