package com.emp.controller;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.beans.Employee;
import com.emp.exception.EmployeeIdNotFoundException;
import com.emp.services.IEmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/employees")
@Api(value = "EmployeeInfo")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeServiceImpl;

	@ApiOperation(value = "Add a Employee", response = Employee.class)
	@PostMapping("/add")
	public Employee postEmployee(@RequestBody Employee employee) {
		System.out.println("postEmployee");
		return employeeServiceImpl.addEmployee(employee);

	}

	@ApiOperation(value = "View a list of available employees", response = Employee.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/read")
	public List<Employee> getAllEmployees() {
		List<Employee> empList = employeeServiceImpl.getEmployeeList();
		return empList;

	}

	@ApiOperation(value = "Search an employee with an ID", response = Employee.class)
	@GetMapping(path = "/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		Optional<Employee> emp = employeeServiceImpl.getEmployeeById(1L);
		if (!emp.isPresent()) {
			throw new EmployeeIdNotFoundException("Employee id not exists");
		}
		return emp.get();
	}

	@ApiOperation(value = "Update Employee")
	@PutMapping(path = "/{id}")
	public Employee updateEmployeeById(@PathVariable Long id, @RequestBody Employee updateEmployee) {
		Optional<Employee> employee = employeeServiceImpl.getEmployeeById(id);

		if (!employee.isPresent()) {
			throw new EmployeeIdNotFoundException("Employee is not exist");
		}

		Employee employeeToUpdate = employee.get();

		employeeToUpdate.setName(updateEmployee.getName());
		employeeToUpdate.setSalary(updateEmployee.getSalary());

		return employeeServiceImpl.updateEmployee(employeeToUpdate);

	}

	@ApiOperation(value = "Delete employee by id")
	@DeleteMapping(path = "/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {

		if (!employeeServiceImpl.getEmployeeById(id).isPresent()) {

			throw new EmployeeIdNotFoundException("Employee is not exist ");
		}
		employeeServiceImpl.deleteEmployeeById(id);

	}

	@ApiOperation(value = "Delete all employees")
	@DeleteMapping("/")
	public void deleteAllEmployee() {

		employeeServiceImpl.deleteAllEmployee();

	}

}
