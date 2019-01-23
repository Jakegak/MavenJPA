package com.jake.article;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory enitytMangerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = enitytMangerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Articles articles = new Articles("My first article");
		
		entityManager.persist(articles);
		entityManager.getTransaction().commit();
		
		enitytMangerFactory.close();
		entityManager.close();
	}

}
