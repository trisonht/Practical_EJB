package com.example.crudapidemo.repository;

import com.example.crudapidemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
