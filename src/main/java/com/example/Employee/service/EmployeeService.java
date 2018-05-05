package com.example.Employee.service;

import com.example.Employee.Entity.Employee;
import com.example.Employee.dao.EmployeeRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepositoty employeeRepositoty;

    public Employee addEmployee(Employee employee) {
        return employeeRepositoty.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepositoty.delete(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepositoty.save(employee);
    }
    
    public List<Employee> listEmployees() {
        return employeeRepositoty.findAll();
    }

    public Employee findEmployeeByName(String name){
        Employee employee=null;
        try {
            employee = employeeRepositoty.findByEmployeeName(name);
        } catch (Exception e) {

        }
        return employee;
    }
}
