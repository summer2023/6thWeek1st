package com.example.Employee.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="t_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message="姓名不能为空")
    @Column(nullable=false,length=20,name="name")
    private String name;

    @Column(nullable=false,name="age")
    private Integer age;

    @NotEmpty(message="姓名不能为空")
    @Column(nullable=false,length=2,name="gender")
    private String gender;

    public Employee(int id,String name,int age,String gender) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public int getId() {
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

    public Integer getAge() {
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
