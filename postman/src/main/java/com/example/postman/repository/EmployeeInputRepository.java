package com.example.postman.repository;

import com.example.postman.entity.EmployeeInputEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInputRepository extends JpaRepository<EmployeeInputEntity,Integer> {

    @Query(value = "select * from emp_input1 order by id desc limit 1",nativeQuery = true)
    public EmployeeInputEntity searchForInput();
}
