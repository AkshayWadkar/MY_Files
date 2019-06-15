package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;



import com.cg.entities.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Student save(Student student) {

		entityManager.persist(student);
		entityManager.flush();	
		
		return student;
	}
	
	@Override
	public List<Student> loadAll() {
		TypedQuery<Student> query = 
				entityManager.
				createQuery
				("SELECT s FROM Student s", 
						Student.class);
		return query.getResultList();
	}

}
