package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Dto.CourseDto;
import com.student.models.Course;
import com.student.service.CourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@Valid @RequestBody CourseDto courseDTO) {
        // Handle valid course data
        return ResponseEntity.ok("Course added successfully");
    }

}
