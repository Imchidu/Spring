package com.xworkz.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.repo.StudentRepo;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired

	StudentRepo repo;

	public StudentServiceImpl() {
		System.out.println("created StudentServiceImpl");
	}

	@Override
	public boolean validateAndSave(StudentDto dto) {
		if (dto.getName().length() > 1 && dto.getAddress().length() > 2) {
			return repo.save(dto);
		}

		return true;
	}

	@Override
	public Optional<List<StudentDto>> findByName(String name) {

		return repo.findByName(name);
	}

}
