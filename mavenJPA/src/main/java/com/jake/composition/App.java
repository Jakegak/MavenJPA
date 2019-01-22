package com.jake.composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Employees emp = new Employees();
		emp.setName("Carol");
		Address add = new Address("Roasters", 22);
		
		add.setEmployee(emp);
		emp.setAddress(add);
		
		entityManager.persist(emp);
		entityManager.persist(add);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();

	}
}
