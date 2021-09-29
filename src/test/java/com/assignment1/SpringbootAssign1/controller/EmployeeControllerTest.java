package com.assignment1.SpringbootAssign1.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.assignment1.SpringbootAssign1.entity.Employee;
import com.assignment1.SpringbootAssign1.service.EmployeeService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers=EmployeeController.class)
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService employeeService;
	
	Employee testData = new Employee(1,"Rupam","Thakre","rupamthakre15@gmail.com");
	
	@Test
	public void retrieveEmployeeData() throws Exception {
		
		Mockito.when(employeeService.getEmployeeById(Mockito.anyInt())).thenReturn(testData);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/employees/1").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println("Testing response "+result.getResponse().getContentAsString());
		
		String expected = "{id:1,firstName:Rupam,lastName:Thakre,email:rupamthakre15@gmail.com}";
		
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
		
		
		
	}
}
