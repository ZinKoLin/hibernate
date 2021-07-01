package com.zkl.hibernateutils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zkl.entity.Latop;
import com.zkl.entity.People;

public class HibernateUtils {
	
	
	private static SessionFactory buildSessionFactory(){
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(People.class).addAnnotatedClass(Latop.class);
		
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		SessionFactory sf = config.buildSessionFactory(reg);
		
		
		return sf;
		
	}
	
	
	public static SessionFactory getSessionFactory() {
		return buildSessionFactory();
	}
	
	
	

}
