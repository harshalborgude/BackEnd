package org.hrb.hibernateHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.hibernate.entity.User;

public class WhereListHql {
	
	// hibernate where clause.
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session=factory.getCurrentSession();
		
		try {
			
			// Start transaction.
			session.beginTransaction();
			
			// this will return list of users.
			// this will build query automatically and will get all result in list.
			
			List<User> users=session.createQuery("from user where first_name='harsh' and username='harshal'").getResultList();
			
			for (User temp : users) {
				System.out.println(temp);
			}			
			
		} finally {
			session.close();
			factory.close();
		}
		
		
	}
}








