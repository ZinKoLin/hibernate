package com.zkl.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zkl.entity.FullName;
import com.zkl.entity.Latop;
import com.zkl.entity.People;
import com.zkl.hibernateutils.HibernateUtils;

public class App {

	public static void main(String[] args) {
		
		Latop  latop = new Latop();
		latop.setBrand("HP");
		latop.setDescription("Intel core i5");
		
		
		People obj = new People();
		obj.setName(new FullName("Mg Mg","Soe"));
		obj.setAge(18);
		obj.setLatop(latop);
		
		People obj1 = new People();
		obj1.setName(new FullName("Aung","Gyi"));
		obj1.setAge(30);
		obj1.setLatop(latop);;
		
	
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(obj);
		session.save(obj1);
		
		
		
		tx.commit();
		
		
		session.close();
		
		

	}

}
