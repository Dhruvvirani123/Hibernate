package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Seller s1 = new Seller();
		s1.setId(1);
		s1.setName("Dhruv");
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setPname("Leptop");
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setPname("Iped");
		
		List<Product> pList = new ArrayList<Product>();
		pList.add(p1);
		pList.add(p2);
		
		s1.setProducts(pList);
		p1.setSnmae(s1);
		p1.setSnmae(s1);
		
		session.save(s1);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		sf.close();
	}
}