package com.xworkz.mobileRepo;

import java.util.List;
import java.util.Optional;

import com.xworkz.mobileEntity.MobileEntity;

public interface MobileRepo {
	
	public boolean save(MobileEntity entity);
	
	Optional<List<MobileEntity>> findByBrand(String brand);
}
