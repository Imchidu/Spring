package com.xworkz.student.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.student.dto.StudentDto;

public interface StudentService {
	boolean validateAndSave(StudentDto dto);
	
	Optional<List<StudentDto>> findByName(String name);

}
