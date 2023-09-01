package com.rooba.vehicleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rooba.vehicleapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserEmail(String userEmail);
    
}
