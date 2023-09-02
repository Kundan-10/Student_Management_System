package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.Dto.StudentDto;
import com.student.models.Student;
import com.student.service.StudentService;

import jakarta.validation.Valid;


@RestController
@Validated
@RequestMapping("/students")

public class StudentController {
	
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/search")
    public List<Student> searchStudentsByName(@RequestParam String name) {
        return studentService.getStudentsByName(name);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentDto studentDTO) {
        // Handle valid student data
        return ResponseEntity.ok("Student added successfully");
    }

}
