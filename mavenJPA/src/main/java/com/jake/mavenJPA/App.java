package com.jake.mavenJPA;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		TypedQuery<Person> query = entityManager.createNamedQuery("Person.getname", Person.class);
		query.setParameter("name", "Jake");
		List<Person> people = query.getResultList();
		
		for(Person p : people){
			System.out.println(p);
		}
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
