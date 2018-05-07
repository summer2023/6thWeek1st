package com.example.Employee.controller;

import com.example.Employee.Entity.Employee;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ModelAndView queryAllstudent(Model model) {
        List<Employee> employees=employeeService.listEmployees();
        model.addAttribute("allEmployees", employees);
        model.addAttribute("title", "employeeTable");

        return new ModelAndView("index", "EmployeeModel", model);
    }

    @GetMapping("{name}")
    public ModelAndView view(@PathVariable("name") String name, Model model) {
        Employee employee = employeeService.findEmployeeByName(name);

        model.addAttribute("employee", employee);
        model.addAttribute("gender", employee.getGender());
        model.addAttribute("age", employee.getAge());
        model.addAttribute("id", employee.getId());

        return new ModelAndView("view", "EmployeeModel", model);
    }

//    @RequestMapping("add")
//    public ModelAndView addEmployee(Model model) {
//        model.addAttribute("title", "新增");
//
//        return new ModelAndView("add", "EmployeeModel", model);
//    }

    @RequestMapping("insert")
    public ModelAndView insertEmployee(Employee employee) {
        employeeService.addEmployee(employee);

        return new ModelAndView("redirect:/user");
    }

    @GetMapping("delete")
    public ModelAndView delEmployee(Employee employee) {
        employeeService.deleteEmployee(employee);

        return new ModelAndView("redirect:/user");
    }

    @PostMapping
    public ModelAndView updateEmployee(Employee employee) {
        employeeService.updateEmployee(employee);
        return new ModelAndView("redirect:/user");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmployeeController.class, args);
    }
}
