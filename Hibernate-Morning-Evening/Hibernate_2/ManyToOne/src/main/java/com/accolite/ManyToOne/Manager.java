package com.accolite.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
		
		Session session = sessionFactory.openSession();
		Customer user = new Customer(); 

		BankAccount account = new BankAccount(); 
		BankAccount account2 = new BankAccount(); 

		account.setAccount_no("17GAEI6005"); 
		account.setCustomer(user);

		account2.setAccount_no("18GAEE0987"); 
		account2.setCustomer(user);

		user.setName("John Doe"); 

		session.beginTransaction(); 
		session.save(account);
		session.save(account2);
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
}