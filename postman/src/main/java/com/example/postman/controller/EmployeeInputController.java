package com.example.postman.controller;

import com.example.postman.entity.EmpIdEntity;
import com.example.postman.entity.EmployeeEntity;
import com.example.postman.entity.EmployeeInputEntity;
import com.example.postman.exception.APIFailureException;
import com.example.postman.repository.EmpIdRepository;
import com.example.postman.service.EmployeeInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin("http://localhost:3000")
public class EmployeeInputController {

    @Autowired
    private EmployeeInputService service;
    public static EmployeeEntity employeeEntity;
    @Autowired
    private EmpIdRepository empIdRepository;

    @PostMapping("/addEmployeeInputEntity")
    public EmployeeInputEntity addProduct(@RequestBody EmployeeInputEntity employeeInputEntity){
        System.out.println(employeeInputEntity);
        return service.saveProduct(employeeInputEntity);
    }

    @PostMapping("/checkEmployeeInput")
    public EmployeeEntity checkEmployeeId(@RequestBody EmployeeInputEntity employeeInputEntity) throws APIFailureException{
        System.out.println(employeeInputEntity);
        System.out.println(employeeInputEntity.getEmpId()+" "+employeeInputEntity.getEmpName());
        if(employeeInputEntity == null){
            throw  new APIFailureException("EmployeeInputEntity is null");
        }
        employeeEntity = service.checkEmployeeId(employeeInputEntity);
        EmpIdEntity empIdEntity = new EmpIdEntity();
        empIdEntity.setEmpId(employeeEntity.getEmpId());
        empIdRepository.save(empIdEntity);
        System.out.println(empIdEntity);
        return employeeEntity;
    }


}
