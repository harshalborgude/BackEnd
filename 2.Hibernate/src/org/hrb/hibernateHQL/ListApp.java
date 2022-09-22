package org.hrb.hibernateHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.hibernate.entity.User;

public class ListApp {
	
	// here we will be using HQL - hibernate query language.
	
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
			
			List<User> users=session.createQuery("from user").getResultList();
			
			for (User temp : users) {
				System.out.println(temp);
			}			
			
		} finally {
			session.close();
			factory.close();
		}
		
		
	}
}








