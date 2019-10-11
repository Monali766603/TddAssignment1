package com.emp.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.emp.beans.Employee;
import com.emp.repository.IEmployeeRepository;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;

	@Mock
	private IEmployeeRepository employeeRepository;

	@Test
	public void shouldReturnListOfAllEmployees() {

		when(employeeRepository.findAll()).thenReturn(getListOfEmployee());
		List<Employee> actualResult = employeeServiceImpl.getEmployeeList();
		verify(employeeRepository).findAll();
		assertEquals(actualResult.get(0).getName(), "Monali");

	}

	@Test
	public void shouldReturnEmployeeById() {

		when(employeeRepository.findById(1L)).thenReturn(Optional.of(getEmployeeById()));
		Optional<Employee> actualResult = employeeServiceImpl.getEmployeeById(1L);
		verify(employeeRepository).findById(1L);
		assertEquals(actualResult.get().getName(), "Monali");

	}

	@Test
	public void shouldSaveEmployees() {
		Employee employee = getEmployeeById();
		when(employeeRepository.save(employee)).thenReturn(employee);
		Employee actualResult = employeeServiceImpl.addEmployee(employee);
		verify(employeeRepository).save(employee);
		assertEquals(actualResult.getName(), "Monali");

	}

	@Test
	public void shouldUpdateEmployeesById() {
		Employee employee = getEmployeeById();
		when(employeeRepository.save(employee)).thenReturn(employee);
		Employee actualResult = employeeServiceImpl.updateEmployee(employee);
		verify(employeeRepository).save(employee);
		assertEquals(actualResult.getName(), "Monali");

	}

	@Test
	public void shouldDeleteEmployeeById() {

		employeeServiceImpl.deleteEmployeeById(1L);
	}

	@Test
	public void shouldDeleteAllEmployees() {

		employeeServiceImpl.deleteAllEmployee();
	}

	public List<Employee> getListOfEmployee() {

		Employee emp = new Employee();
		emp.setId(1L);
		emp.setName("Monali");
		emp.setSalary(15000);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp);
		return employeeList;

	}

	public Employee getEmployeeById() {
		Employee emp1 = new Employee();
		emp1.setId(1L);
		emp1.setName("Monali");
		emp1.setSalary(10000);
		return emp1;

	}
}
