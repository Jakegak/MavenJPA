package com.jake.mavenJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Person p = entityManager.find(Person.class, 1);
		entityManager.remove(p);
		
		entityManager.getTransaction().commit();
				
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
