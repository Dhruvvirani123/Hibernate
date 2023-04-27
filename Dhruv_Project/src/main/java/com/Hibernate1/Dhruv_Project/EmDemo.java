package com.Hibernate1.Dhruv_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		SessionFactory fc = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session se = fc.openSession();
		Transaction tx = se.beginTransaction();
		
		Student stu = new Student();
		stu.setId(200782);
		stu.setName("Dhruv Virani");
		stu.setAddress("Bhavnagar");
		
		Certificate cer = new Certificate();
		cer.setCourse("Java");
		cer.setDuration("10 Month");
		
		stu.setCerti(cer);
		
		
	}
}
