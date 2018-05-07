package com.example.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class EmployeeApplication {
    public EmployeeApplication() {
    }


    public static void main(String[] args){
        SpringApplication.run(EmployeeApplication.class, args);
    }
}
