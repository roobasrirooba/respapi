package com.rooba.vehicleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rooba.vehicleapp.dto.LoginDTO;
import com.rooba.vehicleapp.model.User;
import com.rooba.vehicleapp.service.UserService;
import com.rooba.vehicleapp.utilities.UserConstants;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public String userLogin(@RequestBody LoginDTO loginUser) {
		boolean isAvailable = userService.userLogin(loginUser);
		if (isAvailable) {
			return UserConstants.USER_LOGGED_IN;
		}
		return UserConstants.USER_NOT_AVAILABLE;
	}

	@PostMapping("/register")
	public String userRegister(@RequestBody User user) {
		User userAdded = userService.userRegister(user);
		if (userAdded == null) {
			return UserConstants.USER_EXISTS;
		}
		return UserConstants.USER_ADDED;
	}

}
