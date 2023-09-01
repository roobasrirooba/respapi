package com.rooba.vehicleapp.service;

import com.rooba.vehicleapp.dto.LoginDTO;
import com.rooba.vehicleapp.model.User;

public interface UserService {

	public boolean userLogin(LoginDTO loginUser);

	public User userRegister(User user);

}
