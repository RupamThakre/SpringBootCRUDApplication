package com.assignment1.SpringbootAssign1.dao;

import java.util.List;

import com.assignment1.SpringbootAssign1.entity.Employee;

public interface EmployeeDao {
	
    public List<Employee> getAllEmployees();
    
	public Employee getEmployeeById(int theId);
	
	public void saveEmployee(Employee theEmployee);
	
	public void deleteById(int theId);
	

}
