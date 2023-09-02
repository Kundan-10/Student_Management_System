package com.student.models;

import java.time.LocalDate;
import java.util.Date;

import com.student.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
	 private String name;
	 private LocalDate dateOfBirth;
	 private String gender;
	 private String uniqueStudentCode;
	
	

}
