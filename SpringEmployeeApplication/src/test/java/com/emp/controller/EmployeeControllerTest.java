package com.emp.controller;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.emp.beans.Employee;
import com.emp.services.impl.EmployeeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private EmployeeServiceImpl employeeServiceImpl;

	@Test
	public void shouldAddEmployeeWhenAllDataIsGiven() throws Exception {

		mvc.perform(post("/employees/add").accept(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(getEmployee())).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnListOfEmployees() throws Exception {
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(getEmployee());

		when(employeeServiceImpl.getEmployeeList()).thenReturn(listOfEmployee);
		mvc.perform(get("/employees/read").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].name", comparesEqualTo("Monali")));
		verify(employeeServiceImpl).getEmployeeList();

	}

	@Test
	public void shouldReturnEmployeeByIdIfIsPresent() throws Exception {

		when(employeeServiceImpl.getEmployeeById(1L)).thenReturn(Optional.of(getEmployee()));

		mvc.perform(get("/employees/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.name", comparesEqualTo("Monali")));

		verify(employeeServiceImpl).getEmployeeById(1L);

	}

	 @Test
	public void shouldThrowExceptionWhenGettingEmployeeIfEmployeeIsNotPresent() throws Exception {

		when(employeeServiceImpl.getEmployeeById(1L)).thenReturn(Optional.empty());

		mvc.perform(get("/employees/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());

	} 

	@Test
	public void shouldDeleteEmployeeIfEmployeeIsPresent() throws Exception {
		when(employeeServiceImpl.getEmployeeById(1L)).thenReturn(Optional.of(getEmployee()));

		mvc.perform(delete("/employees/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());

		verify(employeeServiceImpl).deleteEmployeeById(1L);

	}

	/* @Test
	public void shouldThrowExceptionWhenDeletingEmployeeIfEmployeeIsNotPresent() throws Exception {

		when(employeeServiceImpl.getEmployeeById(1L)).thenReturn(Optional.empty());

		mvc.perform(delete("/employees/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());

	} */

	@Test
	public void shouldUpdateEmployeeeWhenDataIsValid() throws Exception {
		Employee employee = getEmployee();

		Employee employeeOutPut = new Employee();
		employeeOutPut.setId(1l);
		employeeOutPut.setName("Pranali");
		employeeOutPut.setSalary(10000);
		when(employeeServiceImpl.getEmployeeById(1L)).thenReturn(Optional.of(employee));
		when(employeeServiceImpl.updateEmployee(employee)).thenReturn(employeeOutPut);
		mvc.perform(put("/employees/1").accept(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(employeeOutPut)).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$.name", comparesEqualTo("Pranali")));
		verify(employeeServiceImpl).getEmployeeById(1L);

	}
	
	@Test
	public void shouldThrowExceptionWhenUpdatingEmployeeWhenEmployeeIsNotPresent() throws Exception {

		Employee employeeOutPut = new Employee();
		employeeOutPut.setId(1l);
		employeeOutPut.setName("Pranali");
		employeeOutPut.setSalary(35000);

		when(employeeServiceImpl.getEmployeeById(1L)).thenReturn(Optional.empty());

		mvc.perform(put("/employees/1").accept(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(employeeOutPut)).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());

	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("Monali");
		employee.setSalary(10000);
		return employee;
	}

}
