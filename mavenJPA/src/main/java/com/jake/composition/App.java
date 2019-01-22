package com.jake.composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();

		University uni = new University("Middlesex");
		
		Student stud1 = new Student("Jacob");
		stud1.setUniversity(uni);
		Student stud2 = new Student("Joseph");
		stud2.setUniversity(uni);
		
		uni.addStudent(stud1);
		uni.addStudent(stud2);
		

		entityManager.persist(uni);
		entityManager.persist(stud1);
		entityManager.persist(stud2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
