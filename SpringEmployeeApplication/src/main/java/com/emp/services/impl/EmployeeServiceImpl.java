package com.emp.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.beans.Employee;
import com.emp.repository.IEmployeeRepository;
import com.emp.services.IEmployeeService;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		employee = employeeRepository.save(employee);
		return employee;
	}

	@Override
	@Transactional
	public List<Employee> getEmployeeList() {

		List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
		return employeeList;
	}

	@Override
	@Transactional
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);

	}

	@Override

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	@Transactional
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);

	}

	@Override
	@Transactional
	public void deleteAllEmployee() {
		employeeRepository.deleteAll();
	}

}
