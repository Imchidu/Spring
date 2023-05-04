package com.xworkz.mobileRepo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobileEntity.MobileEntity;


@Component
public class MobileRepoImpl implements MobileRepo {

	@Autowired
	EntityManagerFactory factory;

	public MobileRepoImpl() {
		System.out.println("Created  MobileRepoImpl");
	}

	@Override
	public boolean save(MobileEntity entity) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		return true;
	}

	public Optional<List<MobileEntity>> findByBrand(String brand) {
		System.out.println("find by name method in mobilerepo");
		 EntityManager creatEntityManager=factory.createEntityManager();
		try {	
		 Query createNamedQuery = creatEntityManager.createNamedQuery("findByBrand");
		 Query setParameter = createNamedQuery.setParameter("br",brand);
		 
		return Optional.ofNullable(createNamedQuery.getResultList());
		}
		finally {
			creatEntityManager.close();
		}
	}

	

}
