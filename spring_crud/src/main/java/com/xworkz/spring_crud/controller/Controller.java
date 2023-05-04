package com.xworkz.spring_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FirstPage")
public class Controller {

	@GetMapping("/Student/{phoneNo}")

	String getStudentByPhoneNumber(@PathVariable("phoneNo") Long phoneNo) {
		
		System.out.println(phoneNo);
		
		return "data valid";
	}

}
