package com.jake.composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppRP {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("students");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		ReasearchProject research1 = new ReasearchProject("Survey portal");
		ReasearchProject research2 = new ReasearchProject("AAL");
		
		Professor professor1 = new Professor("Ken");
		Professor professor2 = new Professor("Nyanjui");
		
		research1.assignProfessorToProject(professor1);
		research2.assignProfessorToProject(professor2);
		
		professor1.assignProjectToProfessor(research1);
		professor2.assignProjectToProfessor(research2);
		
		entityManager.persist(research1);
		entityManager.persist(research2);
		entityManager.persist(professor1);
		entityManager.persist(professor2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
