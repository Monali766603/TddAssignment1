package com.emp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.beans.Employee;

@Repository("employeeRepository")
public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

}
