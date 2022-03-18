package com.org.employeeapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.employeeapi.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
