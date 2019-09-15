package com.sda.model;

import javax.persistence.*;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @Column(name = "Department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Department", length = 40)
    private String department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
