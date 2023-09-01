package com.rooba.vehicleapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rooba.vehicleapp.dto.LoginDTO;
import com.rooba.vehicleapp.model.Admin;
import com.rooba.vehicleapp.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public boolean loginAdmin(LoginDTO loginAdmin) {
		Admin admin = adminRepository.findByAdminEmail(loginAdmin.getEmailId());
		if(admin == null || !admin.getPassword().equals(loginAdmin.getPassword()))
			return false;
		return true;
	}

	@Override
	public Admin registerAdmin(Admin admin) {
		Admin findAdmin = adminRepository.findByAdminEmail(admin.getAdminEmail());
		if(findAdmin != null)
			return null;
		Admin adminInsert = adminRepository.save(admin);
		return adminInsert;
	}

}
