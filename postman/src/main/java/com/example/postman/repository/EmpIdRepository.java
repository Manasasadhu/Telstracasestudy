package com.example.postman.repository;

import com.example.postman.entity.EmpIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpIdRepository extends JpaRepository<EmpIdEntity, Integer> {
}
