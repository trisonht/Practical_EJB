package com.example.crudapidemo.controller;

import com.example.crudapidemo.model.Employee;
import com.example.crudapidemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TutorialController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/listEm")
    public @ResponseBody
    Iterable<Employee> getTutorialById() {
        return employeeRepository.findAll();
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createTutorial(@RequestBody Employee Employee) {
        try {
            Employee _tutorial = employeeRepository
                    .save(new Employee(Employee.getName(), Employee.getWage()));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}