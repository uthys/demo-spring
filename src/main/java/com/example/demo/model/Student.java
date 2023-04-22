package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@Table(name="STUDENT")
public class Student {
    @Id
    @Autowired
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Mark")
    private String mark;

    @Column(name="Name")
    private String name;
}
