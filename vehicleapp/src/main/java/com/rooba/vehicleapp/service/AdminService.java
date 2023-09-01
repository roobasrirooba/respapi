package com.rooba.vehicleapp.service;

import com.rooba.vehicleapp.dto.LoginDTO;
import com.rooba.vehicleapp.model.Admin;

public interface AdminService {
	
	public boolean loginAdmin(LoginDTO loginAdmin);
	
	public Admin registerAdmin(Admin admin);

}
