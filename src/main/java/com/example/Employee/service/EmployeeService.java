package com.example.Employee.service;

import com.example.Employee.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    private void validateEmployee(int employeeId) {
        boolean find = employees.stream().anyMatch(e -> e.getId() == employeeId);

    }

    public EmployeeService() {
        employees.add(new Employee(0, "小明", 20, "男"));
        employees.add(new Employee(1, "小红", 19, "女"));
        employees.add(new Employee(2, "小智", 25, "男"));
        employees.add(new Employee(3, "小刚", 16, "男"));
        employees.add(new Employee(4, "小霞", 15, "女"));
    }


    public List<Employee> getEmployeeList() {
        return employees;
    }


    public Employee saveEmployee(Employee employee) {
        boolean exist = employees.stream().anyMatch(e -> e.getId() == employee.getId());

        employees.add(employee);
        return employee;
    }

    public Employee getEmployee(int id) {
        this.validateEmployee(id);
        return employees.stream().filter(item -> item.getId() == id).findFirst().get();
    }


    public Employee updateEmployee(int id, Employee newEmployee) {
        this.validateEmployee(id);
        Employee employee = employees.stream().filter(item -> item.getId() == id).findFirst().get();
        employee.setAge(newEmployee.getAge());
        employee.setGender(newEmployee.getGender());
        employee.setName(newEmployee.getName());
        return employee;
    }

    public void deleteEmployee(int id) {
        this.validateEmployee(id);
        Employee employee = employees.stream().filter(item -> item.getId() == id).findFirst().get();
        employees.remove(employee);
    }
}
