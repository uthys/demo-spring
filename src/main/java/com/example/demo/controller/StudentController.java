package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Controller
@RequestMapping
public class StudentController {
    @Autowired(required = true)
    private StudentRepository studentRepository;

    @GetMapping("/add")
    public String getView(Model model){
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/add")
    public @ResponseBody String addStudent(Model model, @ModelAttribute Student student){
        model.addAttribute("student", student);
        student.setName(student.getName());
        student.setMark(student.getMark());
        studentRepository.save(student);
        return "Saved";
    }

    @GetMapping("/delete")
    public @ResponseBody String deleteStudent(@RequestParam Long id){
        studentRepository.deleteById(id);
        return "user deleted";
    }
    @GetMapping("/all")
    public String getAllStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "all";
    }
}
