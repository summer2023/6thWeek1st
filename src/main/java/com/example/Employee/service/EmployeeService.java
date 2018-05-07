package com.example.Employee.service;

import com.example.Employee.Entity.Employee;
import com.example.Employee.dao.EmployeeRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepositoty employeeRepositoty;

    List<Employee> employees = new ArrayList();
    public EmployeeService() {
        employees.add(new Employee(0, "小明",20,"男"));
        employees.add(new Employee(1, "小虹",19,"女"));
        employees.add(new Employee(2, "小智",25,"男"));
        employees.add(new Employee(3, "小刚",16,"男"));
        employees.add(new Employee(4, "小霞",15,"女"));

    }

    public List<Employee> getEmployees() {
        return employees;
    }


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
