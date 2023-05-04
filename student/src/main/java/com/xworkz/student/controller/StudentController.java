package com.xworkz.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.service.StudentService;

@Component
@Controller
@RequestMapping("/save")
public class StudentController {
	@Autowired
	StudentService service;

	public StudentController() {
		System.out.println("Created StudentController");
	}

	@PostMapping
	public String onSave(StudentDto dto, Model servletRequest) {
		System.out.println("Running onSave method");
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			servletRequest.addAttribute("message", "Data saving successfully");
			System.out.println("Saved details" + dto);
			
		} else {
			servletRequest.addAttribute("error", "Data not saved");

		}

		return "index";

	}
	
	@GetMapping
	 public String getByName(@RequestParam String name,Model model) {
		System.out.println("Getting details from Database");
		
		Optional<List<StudentDto>> findByName = service.findByName(name);
		System.out.println(findByName);
		if(findByName.isPresent()) {
			
			List<StudentDto> list = findByName.get();
			System.out.println(list);
			
			model.addAttribute("message","ResultFound");
			model.addAttribute("list",list);
			return "SearchResult";
			
		}
		else {
			model.addAttribute("error","Result not found");
			return "Search";
		}
		
		
		
		
		
	}

}
