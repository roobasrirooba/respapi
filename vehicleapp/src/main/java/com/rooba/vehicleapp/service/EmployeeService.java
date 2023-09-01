package com.rooba.vehicleapp.service;

import com.rooba.vehicleapp.dto.LoginDTO;
import com.rooba.vehicleapp.model.Employee;

public interface EmployeeService {
	
	public boolean loginEmployee(LoginDTO loginDTO);
	
	public Employee registerEmployee(Employee employee);
	
	public boolean isAdmin(String email);

}
