package com.rooba.vehicleapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rooba.vehicleapp.dto.LoginDTO;
import com.rooba.vehicleapp.model.Admin;
import com.rooba.vehicleapp.model.Employee;
import com.rooba.vehicleapp.repository.AdminRepository;
import com.rooba.vehicleapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public boolean loginEmployee(LoginDTO loginEmployee) {
		Employee employee = employeeRepository.findByEmployeeEmail(loginEmployee.getEmailId());
		if(employee == null || !employee.getPassword().equals(loginEmployee.getPassword()))
			return false;
		return true;
	}

	@Override
	public Employee registerEmployee(Employee employee) {
		Employee findEmployee = employeeRepository.findByEmployeeEmail(employee.getEmployeeEmail());
		if(findEmployee != null)
			return null;
		Employee employeeInsert = employeeRepository.save(employee);
		return employeeInsert;
	}

	@Override
	public boolean isAdmin(String email) {
		Admin admin = adminRepository.findByAdminEmail(email);
		if(admin == null)
			return false;
		return true;
	}

}
