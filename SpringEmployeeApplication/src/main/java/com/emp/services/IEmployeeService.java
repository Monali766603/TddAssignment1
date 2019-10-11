package com.emp.services;

import java.util.List;
import java.util.Optional;

import com.emp.beans.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployeeList();

	public Optional<Employee> getEmployeeById(Long id);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployeeById(Long id);

	public void deleteAllEmployee();

}
