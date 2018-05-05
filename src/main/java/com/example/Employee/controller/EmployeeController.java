package com.example.Employee.controller;

import com.example.Employee.Entity.Employee;
import com.example.Employee.service.EmployeeServiceImplement1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/employee")

public class EmployeeController {
    @Autowired
    private EmployeeServiceImplement1 employeeService;

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name) {
        Employee employee = employeeService.findEmployeeByName(name);
        if (null != employee) {
            return employee.getId()+"&"+employee.getName()+" "+employee.getAge()+" "+employee.getGender();
        }else {
            return "null";
        }
    }
    String home() {
        return "hello world!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmployeeController.class, args);
    }
}
