package com.example.postman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "globalemp_id")
public class EmpIdEntity {

    @Id
    @Column(name ="gemp_id")
    private String gEmpId;

    public String getgEmpId() {
        return gEmpId;
    }

    public void setEmpId(String gEmpId) {
        this.gEmpId = gEmpId;
    }
}
