package com.springrest.sprinfrest.services;

import com.springrest.sprinfrest.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServicdImpl implements employeeService {
    List<Employee> emp;

    public EmployeeServicdImpl() {
        emp = new ArrayList<>();
        emp.add(new Employee(123, "Panchali"));
        emp.add(new Employee(111, "Arghya"));
        emp.add(new Employee(7989, "Ral"));
    }

    @Override
    public List<Employee> getEmployee() {
        return emp;
    }

    @Override
    public Employee getEmployee(Long empId) {
        Employee e = null;
        for (Employee employee : emp) {
            if (employee.getID() == empId) {
                e = employee;
                break;
            }
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee empl) {
        emp.add(empl);
        return empl;

    }

    @Override
    public void deleteEmployee(Integer empId) {
        for (Employee em : emp) {
            if (em.getID() == empId) {
                emp.remove(empId);
            }
        }
    }
}