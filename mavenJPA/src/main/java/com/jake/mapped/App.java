package com.jake.mapped;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Member member = new Member();
		member.setName("Margaret");
		member.setAge(28);
		member.setLocation("Kasarani");
		
		entityManager.persist(member);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();

	}
}
