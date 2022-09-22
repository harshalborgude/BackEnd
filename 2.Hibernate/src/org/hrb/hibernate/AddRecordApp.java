package org.hrb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.hibernate.entity.User;

public class AddRecordApp {
	
	// Create object of entity class type.
	// Start transaction.
	// Perform operation.
	// Commit the transaction.
	// in hibernate ORM we do operations with entity object itself and hibernate himself will do all stuffs in DB.
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session=factory.getCurrentSession();
		
		try {
			
			// Create object of entity class type.
			User user = new User("harshal6", "mysql", "harsh", "borgude");
			// Start transaction.
			session.beginTransaction();
			// Perform operation.
			session.save(user);
			// Commit the transaction.
			session.getTransaction().commit();
			
			System.out.println("row added!");
			
		} finally {
			session.close();
			factory.close();
		}
		
		
	}
}








