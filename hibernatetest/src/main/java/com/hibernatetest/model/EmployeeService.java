package com.hibernatetest.model;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernatetest.EntityManagerProvider;

public class EmployeeService {
	
	public void saveEmployee() {
		//entitymanager
		EntityManager entityManager = EntityManagerProvider.INSTANCE.getEntityManager();
		//create an obj employee
		Employee employee = new Employee();
		employee.setName("kartik");
		// start a transaction
		EntityTransaction transaction = entityManager.getTransaction();
		//save employee
		transaction.begin();
		entityManager.persist(employee);
		
		//commit transaction
		transaction.commit();
		
	}

}
