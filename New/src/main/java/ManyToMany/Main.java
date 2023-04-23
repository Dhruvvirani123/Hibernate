package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory dv = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = dv.openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setId(1);
		t1.setTeachername("Dhruv");
		
		Teacher t2 = new Teacher();
		t2.setId(2);
		t2.setTeachername("Darshan");
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setStudentname("Tirth");	
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setStudentname("Gauvarang");
		
		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		
		List<Teacher> tlist = new ArrayList<Teacher>();
		tlist.add(t1);
		tlist.add(t2);
		
		t1.setStudents(slist);
		t1.setStudents(slist);
		
		s1.setTeachers(tlist);
		s2.setTeachers(tlist);
		
		session.save(t1);
		session.save(t1);
		session.save(s1);
		session.save(s2);
		
		tx.commit();
		session.close();
		dv.close();
	}
}