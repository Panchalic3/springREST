package com.springrest.sprinfrest.controller;

import com.springrest.sprinfrest.entities.Employee;
import com.springrest.sprinfrest.services.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private employeeService emp;
    @GetMapping("/homeEmp")
    public String home(){
        return "This is home page of  EMPLOYEE LIST";
    }

    @GetMapping("/Employees")
    public List<Employee> getEmployee(){
       return this.emp.getEmployee();

    }
    @GetMapping("/Employees/{empId}")
    public Employee getEmpplyee(@PathVariable Long empId){
        return this.emp.getEmployee(empId);

    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee emp){
        return this.emp.addEmployee(emp);
    }
}
