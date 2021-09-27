package com.assignment1.SpringbootAssign1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.SpringbootAssign1.dao.EmployeeDao;
import com.assignment1.SpringbootAssign1.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
   private EmployeeDao employeeDAO;
	
	public EmployeeServiceImpl() {}
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int theId) {
       return employeeDAO.getEmployeeById(theId);
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
	 employeeDAO.saveEmployee(theEmployee);
	
	}

	@Override
	@Transactional
	public void deleteById(int theId) {

		employeeDAO.deleteById(theId);
	}

}
