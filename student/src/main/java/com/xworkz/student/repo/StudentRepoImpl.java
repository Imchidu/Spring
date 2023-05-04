package com.xworkz.student.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.student.dto.StudentDto;

@Component
public class StudentRepoImpl implements StudentRepo {

	@Autowired
	EntityManagerFactory factory;

	public StudentRepoImpl() {
		System.out.println("Creating StudentRepoImpl");
	}

	@Override
	public boolean save(StudentDto dto) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(dto);
		entityManager.getTransaction().commit();

		return true;
	}

	@Override
	public Optional<List<StudentDto>> findByName(String name) {
	    EntityManager entityManager = factory.createEntityManager();
	    entityManager.getTransaction().begin();
	    try {
	        Query createNamedQuery = entityManager.createNamedQuery("findByName");
	        Query setParameter = createNamedQuery.setParameter("nm", name);
	        List<StudentDto> resultList = createNamedQuery.getResultList();
	        entityManager.getTransaction().commit();
	        if (resultList.isEmpty()) {
	            return Optional.empty();
	        } else {
	            return Optional.of(resultList);
	        }
	    } catch (NoResultException | NonUniqueResultException e) {
	        e.printStackTrace();
	    } finally {
	        entityManager.close();
	    }
	    return Optional.empty();
	}


}
