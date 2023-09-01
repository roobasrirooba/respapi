package com.rooba.vehicleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rooba.vehicleapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmployeeEmail(String userEmail);

}
