package com.pablomerinas.miett.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablomerinas.miett.persistence.model.EmployeeEntity;
import com.pablomerinas.miett.persistence.repository.EmployeeDAO;
import com.pablomerinas.miett.services.interfaces.EmployeeManagementI;

@Service
public class EmployeeManagementImpl implements EmployeeManagementI {

	@Autowired
	private EmployeeDAO employeeRepo;

	@Override
	public EmployeeEntity createEmployee(EmployeeEntity employee) {
		EmployeeEntity newEmployee = new EmployeeEntity();
		
		newEmployee.setFirstName(employee.getFirstName());
		newEmployee.setSurName1(employee.getSurName1());
		newEmployee.setSurName2(employee.getSurName2());
		
		employeeRepo.save(newEmployee);
		return newEmployee;
	}

}
