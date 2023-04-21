package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory dv = new Configuration().configure("hibarnate.cfg.xml").buildSessionFactory();
		Session session = dv.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("Dhruv Name Meaning ?");
		
		
		Question q2 = new Question();
		q2.setId(2);
		q2.setQuestion("Who was Gujarat’s first sultan ?");
		
		Answer a1 = new Answer();
		a1.setId(3);
		a1.setAnswer("Immovable");
		
		Answer a2 = new Answer();
		a2.setId(4);
		a2.setAnswer("Ahmed Shah");
		
		
	}
}