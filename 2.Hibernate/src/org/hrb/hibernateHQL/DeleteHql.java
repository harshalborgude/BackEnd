package org.hrb.hibernateHQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.hibernate.entity.User;

public class DeleteHql {
	
	// hibernate where clause.
	// to delete also have to call executeUpdate() method.
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session=factory.getCurrentSession();
		
		try {
			
			// Start transaction.
			session.beginTransaction();
			
			// this will update all password clm as 'password'
			//session.createQuery("update user set password='password'").executeUpdate();
							
			session.createQuery("delete from user where user_id=2").executeUpdate();
			
			session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
		
		
	}
}








