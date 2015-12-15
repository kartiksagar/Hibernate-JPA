package com.hibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.ejb.Ejb3Configuration;

public enum EntityManagerProvider {
// enum for singleton object - one obj throught app
	// public static final EntityManagerProvider Instance = new EMP();
	INSTANCE;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	private EntityManagerProvider() {
		// to create EMF - connection
		Ejb3Configuration configuration  = new Ejb3Configuration();
		Ejb3Configuration configure = configuration.configure("my-app");
		entityManagerFactory = configure.buildEntityManagerFactory();
	}
	
	public EntityManager getEntityManager() {		
		return entityManagerFactory.createEntityManager();
	}
	
	
}
