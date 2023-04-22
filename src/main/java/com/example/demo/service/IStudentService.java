package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

import java.util.Optional;

public interface IStudentService {
    Optional<Student> findById(Long id);
}
