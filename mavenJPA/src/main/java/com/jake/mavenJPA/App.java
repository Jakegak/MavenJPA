package com.jake.mavenJPA;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createNativeQuery("SELECT * FROM person", Person.class);
		List<Person> people = (List<Person>) query.getResultList();
		
		for(Person p : people){
			System.out.println(p);
		}
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
