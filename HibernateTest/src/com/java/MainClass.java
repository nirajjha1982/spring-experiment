package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setId(2);
		u1.setName("Name1");
		
		SessionFactory  sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(u1);
		session.getTransaction().commit();//this line is necessary otherwise query like insert does not executed, table/schema just created because of entity mapping is given hibernate configuration file
		//session.close();
		
	}

}
