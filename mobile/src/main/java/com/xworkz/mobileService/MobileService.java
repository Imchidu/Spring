package com.xworkz.mobileService;

import java.util.List;
import java.util.Optional;

import com.xworkz.mobileEntity.MobileEntity;

public interface MobileService {
	
	public boolean validateAndSave(MobileEntity entity);
	
	Optional<List<MobileEntity>> findByBrand(String brand);

}
