package com.xworkz.mobileController;

import java.util.List;
import java.util.Optional;

import javax.naming.directory.SearchResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mobileEntity.MobileEntity;
import com.xworkz.mobileService.MobileService;
import com.xworkz.mobileService.MobileServiceImpl;

@Component
@RequestMapping("/save")

public class MobileController {
	@Autowired
	MobileService service;

	public MobileController() {
		System.out.println(" created controller");

	}

	@PostMapping
	public String onSave(MobileEntity entity, Model servletRequest) {
		System.out.println("hjsdchjuhdjdhfj");
		System.out.println("running on save method");
		boolean validateAndSave = service.validateAndSave(entity);
		if (validateAndSave) {
			servletRequest.addAttribute("message", "Data saving successfully");
			System.out.println("saved details" + entity);
		} else {
			servletRequest.addAttribute("error", "Data not saved");
		}
		return "index";
	}

	@GetMapping
	public String getByBrand(@RequestParam String brand, Model model) {

		System.out.println("getting the Details from database");

		Optional<List<MobileEntity>> findByBrand = service.findByBrand(brand);
		if (findByBrand.isPresent() && findByBrand.get().size() > 0) {

			List<MobileEntity> list = findByBrand.get();
			System.out.println(list);

			model.addAttribute("message", "result found");
			model.addAttribute("list", list);
			return "SearchResult";

		} else {
			model.addAttribute("error", "result not found");
			return "Search";
		}

	}

}
