package com.example.postman.service;

import com.example.postman.entity.EmployeeEntity;
import com.example.postman.entity.EmployeeInputEntity;
import com.example.postman.repository.EmployeeInputRepository;
import com.example.postman.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

     public EmployeeEntity saveEntity(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }

    public List<EmployeeEntity> getAll() {
         return employeeRepository.findAll();
    }

}
