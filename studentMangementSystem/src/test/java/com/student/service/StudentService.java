package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.models.Student;
import com.student.repository.StudentRepo.StudentRepository;

@Service
public class StudentService {
	
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }
    
    

}
