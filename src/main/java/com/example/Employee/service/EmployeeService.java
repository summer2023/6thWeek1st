package com.example.Employee.service;

import com.example.Employee.Entity.Employee;
import com.example.Employee.dao.EmployeeRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepositoty employeeRepositoty;
    public Employee findEmployeeByName(String name){
        Employee employee=null;
        try {
            employee = employeeRepositoty.findByEmployeeName(name);
        } catch (Exception e) {

        }
        return employee;
    }
}
