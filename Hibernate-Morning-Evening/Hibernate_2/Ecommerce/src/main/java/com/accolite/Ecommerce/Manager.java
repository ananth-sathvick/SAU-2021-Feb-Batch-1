package com.accolite.Ecommerce;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.accolite.util.Util;

public class Manager 
{
    public static void main( String[] args )
    {
    	Session session = Util.getSession();
    	Transaction tx = session.beginTransaction();

		Product product1 = new Product();
		Product product2 = new Product();
		product1.setName("Product 1");
		product2.setName("Product 2");
		

		Categories category1 = new Categories();
		Categories category2 = new Categories();
		Categories category3 = new Categories();
		category1.setName("Category 1");
		category2.setName("Category 2");
		category3.setName("Category 3");

		Supplier supplier1 = new Supplier();
		Supplier supplier2 = new Supplier();
		Supplier supplier3 = new Supplier();
		
		supplier1.setName("Supplier 1");
		supplier2.setName("Supplier 2");
		supplier3.setName("Supplier 3");
		
		Set<Categories> Categoryset1 = new HashSet<>();
		Categoryset1.add(category1);
		Categoryset1.add(category3);
		
		product1.setCategories(Categoryset1);
		
		Set<Categories> Categoryset2 = new HashSet<>();
		Categoryset2.add(category2);
		
		product2.setCategories(Categoryset2);
		
		
		category1.setProduct(product1);
		category2.setProduct(product2);
		category3.setProduct(product1);
		
		Set<Supplier> Supplierset1 = new HashSet<>();
		Supplierset1.add(supplier1);
		Supplierset1.add(supplier3);
		
		Set<Supplier> Supplierset2 = new HashSet<>();
		Supplierset2.add(supplier2);
		
		supplier1.setCategories(Categoryset2);
		supplier2.setCategories(Categoryset1);
		supplier3.setCategories(Categoryset2);
		
		category1.setSupplier(Supplierset2);
		category2.setSupplier(Supplierset1);
		category3.setSupplier(Supplierset2);
		

		

		session.save(product1);
		session.save(product2);
		session.save(category1);
		session.save(category2);
		session.save(category3);
		session.save(supplier1);
		session.save(supplier2);
		session.save(supplier3);
	
		tx.commit();
		session.close();
		
    }
}
