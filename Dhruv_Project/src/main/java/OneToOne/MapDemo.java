package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory fc = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session se = fc.openSession();
		Transaction tx = se.beginTransaction();

		Question q1 = new Question();
		q1.setQuestion_id(1);
		q1.setQuestion("What is Java ?");

		Answer ans = new Answer();
		ans.setAnswer_id(1);
		ans.setAnswer("Java is Programing Language");

		q1.setAnswer(ans);
		se.save(q1);
		se.save(ans);

		tx.commit();
		fc.close();
	}
}
