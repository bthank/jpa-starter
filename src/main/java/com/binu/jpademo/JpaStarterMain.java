package com.binu.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterMain {

	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Phil French");
		emp1.setType(EmployeeType.FULLTIME);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Mary Smith");
		emp2.setType(EmployeeType.CONTRACTOR);

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Paul Wilson");
		emp3.setType(EmployeeType.PAYROLL_EXEMPT);
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(emp1);
		entityManager.persist(emp2);
		entityManager.persist(emp3);
		entityTransaction.commit();
		
		
	}
	
	
	
	
}
