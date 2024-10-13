package com.pablomerinas.miett.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablomerinas.miett.persistence.model.EmployeeEntity;
import com.pablomerinas.miett.services.implement.EmployeeManagementImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeManagementImpl employeeImpl;

	@PostMapping
	public String createEmployeeBad(@RequestBody EmployeeEntity e) {
		return employeeImpl.createEmployee(e).toString();
	}

	@PostMapping("/createEmployee")
	public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity e) {
		if (e == null || e.getFirstName() == null || e.getFirstName().isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		try {
			EmployeeEntity newEmployee = employeeImpl.createEmployee(e);
			return ResponseEntity.status(HttpStatus.CREATED).body(newEmployee);
		} catch (Exception exception) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
