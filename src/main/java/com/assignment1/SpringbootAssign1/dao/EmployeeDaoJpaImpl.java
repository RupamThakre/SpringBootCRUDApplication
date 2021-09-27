package com.assignment1.SpringbootAssign1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignment1.SpringbootAssign1.entity.Employee;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {
	
    private EntityManager entityManager;
	
	public EmployeeDaoJpaImpl() {}
	
	@Autowired
	public EmployeeDaoJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	

	@Override
	public List<Employee> getAllEmployees() {
		    // create a query
				Query theQuery= entityManager.createQuery("Select s from Employee s");
				
				// execute query and get result list
				@SuppressWarnings("unchecked")
				List<Employee> employees = theQuery.getResultList();
				
				// return the results		
				return employees;
	}

	@Override
	public Employee getEmployeeById(int theId) {
		// get employee
				Employee theEmployee = 
						entityManager.find(Employee.class, theId);
				
				// return employee
				return theEmployee;
	}

	@Override
	public void saveEmployee(Employee theEmployee) {
		// save or update the employee
				Employee dbEmployee = entityManager.merge(theEmployee);
				
				// update with id from db ... so we can get generated id for save/insert
				theEmployee.setId(dbEmployee.getId());
	}

	@Override
	public void deleteById(int theId) {
		
		// delete object with primary key
				Query theQuery = entityManager.createQuery(
									"delete from Employee where id=:employeeId");
				
				theQuery.setParameter("employeeId", theId);
				
				theQuery.executeUpdate();

	}

}
