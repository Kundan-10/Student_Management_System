package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.models.Course;
import com.student.models.Student;

@Repository
public interface StudentRepo {
	
	public interface StudentRepository extends JpaRepository<Student, Long> {
	    List<Student> findByName(String name);
	}
	


}
