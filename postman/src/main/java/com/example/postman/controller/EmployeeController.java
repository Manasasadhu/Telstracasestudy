package com.example.postman.controller;

import com.example.postman.entity.EmployeeEntity;
import com.example.postman.repository.EmployeeRepository;
import com.example.postman.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity){
        System.out.println(employeeEntity);
        return employeeService.saveEntity(employeeEntity);
    }

    @GetMapping("/getAllEmployees")
    public List<EmployeeEntity> getEmployees(){
        return employeeService.getAll();
    }
}

