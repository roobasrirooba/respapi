package com.rooba.vehicleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rooba.vehicleapp.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByAdminEmail(String userEmail);

}
