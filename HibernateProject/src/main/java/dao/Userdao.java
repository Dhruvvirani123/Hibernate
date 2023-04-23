package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Connection.DBConnection;
import model.User;

public class Userdao {
	Session session = null;
	Transaction tx = null;
	List<User> list = null;
	public void InsertData(User u) {
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
		System.out.println("Data Inserted");
	}
}