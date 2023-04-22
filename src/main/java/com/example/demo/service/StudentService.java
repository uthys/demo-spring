package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

import java.util.Optional;

public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

}

