package com.jake.mavenJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Person p1 = new Person("Jake", "gakungajake@gmail.com");
		Person p2 = new Person("Jacob", "gakungajacob7@gmail.com");
		
		entityManager.persist(p1);
		entityManager.persist(p2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
