package com.org.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.employeeapi.model.Employee;
import com.org.employeeapi.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
     private EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getAllTheEmployee() {
        return employeeService.getAllEmployee();
    }
    @RequestMapping("/employee/{foo}")
    public Employee getTopic(@PathVariable("foo") String id) {
        return employeeService.getEmployee(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    public void addEmployee(@RequestBody Employee employee) {
    	employeeService.addEmployee(employee);  
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
    public void updateEmployee(@RequestBody Employee employee,@PathVariable String id) {
    	employeeService.updateEmployee(id,employee);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
    public void deleteEmployee(@PathVariable String id) {
    	employeeService.deleteEmployee(id);
    }
}