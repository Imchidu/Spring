package com.xworkz.mobileService;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.mobileEntity.MobileEntity;
import com.xworkz.mobileRepo.MobileRepo;
@Service

public class MobileServiceImpl implements MobileService {
	
@Autowired
	MobileRepo repo;

	public MobileServiceImpl() {
		System.out.println("Created MobileServiceImpl");
	}

	@Override
	public boolean validateAndSave(MobileEntity entity) {
		System.out.println("created  validateAndSave");
		String brand = entity.getBrand();
		String color = entity.getColor();
		int price = entity.getPrice();
		String type = entity.getType();

		if (brand.length() > 2 && price > 5000) {
			System.out.println("data is valid");
		return	repo.save(entity);
		} else {
			System.err.println("data invalid");
			return false;

		}
	}

	@Override
	public Optional<List<MobileEntity>> findByBrand(String brand) {

		return repo.findByBrand(brand);
		
	}

}
