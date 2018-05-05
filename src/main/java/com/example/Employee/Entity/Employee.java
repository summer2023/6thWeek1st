package com.example.Employee.Entity;

import javax.persistence.*;

@Entity
@Table(name="t_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private String gender;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age=age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender=gender;
    }


}
