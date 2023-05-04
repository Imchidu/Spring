package com.xworkz.student.repo;

import java.util.List;
import java.util.Optional;

import com.xworkz.student.dto.StudentDto;


public interface StudentRepo {
	boolean save(StudentDto dto);

	Optional<List<StudentDto>> findByName(String name);

	
}
