package org.hrb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.hibernate.entity.User;

public class FetchDataApp {
	
	// Create object of entity class type.
	// Start transaction.
	// Perform operation.
	// Commit the transaction.
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session=factory.getCurrentSession();
		
		try {
			
			// Create object of entity class type.
			User user = new User();
			// Start transaction.
			session.beginTransaction();
			// Perform operation.
			user=session.get(User.class, 6);
			// Commit the transaction.
			session.getTransaction().commit();
			
			System.out.println(user);
			
		} finally {
			session.close();
			factory.close();
		}
		
		
	}
}








