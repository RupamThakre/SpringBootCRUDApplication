package com.assignment1.SpringbootAssign1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment1.SpringbootAssign1.entity.Employee;
import com.assignment1.SpringbootAssign1.service.EmployeeService;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value = "EmployeeController", description = "REST Apis related to Employee Entity!!!!")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController() {}
	
	@Autowired
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	@ApiOperation(value = "Get list of Employee in the System ", response = Iterable.class, tags = "employees")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })

		@GetMapping("/employees")
		public List<Employee> getAllEmployees() {
			return employeeService.getAllEmployees();
		}

		// add mapping for GET /employees/{employeeId}
	    @ApiOperation(value = "Get specific Employee in the System ", response = Employee.class, tags = "employees")
		@GetMapping("/employees/{employeeId}")
		public Employee getEmployee(@PathVariable int employeeId) {
			
			Employee theEmployee = employeeService.getEmployeeById(employeeId);
			
			if (theEmployee == null) {
				throw new RuntimeException("Employee id not found - " + employeeId);
			}
			
			return theEmployee;
		}
		
		// add mapping for POST /employees - add new employee
		
	    @ApiOperation(value = "add new Employee in the System ", response = Employee.class, tags = "employees")
		@PostMapping("/employees")
		public Employee addEmployee(@RequestBody Employee theEmployee) {
			
			// also just in case they pass an id in JSON ... set id to 0
			// this is to force a save of new item ... instead of update
			
			theEmployee.setId(0);
			
			employeeService.saveEmployee(theEmployee);
			
			return theEmployee;
		}
		
		// add mapping for PUT /employees - update existing employee
	    @ApiOperation(value = "put Employee in the System ", response = Employee.class, tags = "employees")
		@PutMapping("/employees")
		public Employee updateEmployee(@RequestBody Employee theEmployee) {
			
			employeeService.saveEmployee(theEmployee);
			
			return theEmployee;
		}
		
		// add mapping for DELETE /employees/{employeeId} - delete employee
	    @ApiOperation(value = "delete specific Employee in the System ", response = Employee.class, tags = "employees")
		@DeleteMapping("/employees/{employeeId}")
		public String deleteEmployee(@PathVariable int employeeId) {
			
			Employee tempEmployee = employeeService.getEmployeeById(employeeId);
			
			// throw exception if null
			
			if (tempEmployee == null) {
				throw new RuntimeException("Employee id not found - " + employeeId);
			}
			
			employeeService.deleteById(employeeId);
			
			return "Deleted employee id - " + employeeId;
		}
		

}
