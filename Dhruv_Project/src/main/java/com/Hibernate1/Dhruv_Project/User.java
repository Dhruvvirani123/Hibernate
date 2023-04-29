package com.Hibernate1.Dhruv_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class User {
	public static void main(String[] args) {

		SessionFactory fc = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory(); // Connection Databaase
		
		Session se = fc.openSession();
		Transaction tx = se.beginTransaction();

		Student st = new Student();
		st.setName("Dhruv");
		st.setAddress("Amreli");
		System.out.println(st);
		
		Address ad = new Address();
		ad.setStreet("Street 1");
		ad.setCity("Surat");
		ad.setIsopen(true);
		ad.setX(12.34);
		
		

		se.save(st);
		se.save(ad);

		tx.commit();
		se.close();
		se.close();

		System.out.println("Done");
	}
}
