package com.masaischool.sprint5project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Dutils {

	static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("project");
	}
	
	public static EntityManager getManager() {
		return emf.createEntityManager();
	}
	
	
}
