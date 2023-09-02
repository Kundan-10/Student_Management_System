package com.student.Dto;

import java.time.LocalDate;

import com.student.enums.Gender;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	
    @NotBlank(message = "Name is required")
    private String name;

    @Past(message = "Date of birth should be in the past")
    @NotNull(message = "Date of birth is required")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Gender is required")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotBlank(message = "Unique student code is required")
    @Size(min = 8, max = 10, message = "Unique student code must be between 8 and 10 characters")
    private String uniqueStudentCode;

}
