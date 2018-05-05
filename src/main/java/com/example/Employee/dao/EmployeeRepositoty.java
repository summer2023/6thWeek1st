package com.example.Employee.dao;

import com.example.Employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoty extends JpaRepository<Employee,Long>{
    @Query("select t from Employee t where t.name= :name")
    Employee findByEmployeeName(@Param("name") String name);
}
