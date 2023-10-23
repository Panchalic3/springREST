package com.springrest.sprinfrest.services;

import com.springrest.sprinfrest.entities.Employee;

import java.util.List;

public interface employeeService {
    List<Employee> getEmployee();
    Employee getEmployee(Long empId);
    Employee addEmployee(Employee emp);
}
