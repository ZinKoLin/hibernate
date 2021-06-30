package com.zkl.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Apple {

	public static void main(String[] args) {
		
		People obj = new People();
		obj.setName("Ko Ko");
		obj.setAge(20);
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(People.class);
		
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		SessionFactory sf = config.buildSessionFactory(reg);
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(obj);
		
		
		tx.commit();
		
		
		session.close();
		
		

	}

}
