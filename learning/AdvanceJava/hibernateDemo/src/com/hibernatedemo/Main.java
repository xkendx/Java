package com.hibernatedemo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			// HQL --> Hibernate Query Language
			// Select * from city
			// from City c where c.countryCode='TUR' AND c.countryCode='USA'
			// from City c where c.name LIKE '%stan%'
			// ASC-Ascending
			// DESC-Descending
			List<City> cities = session.createQuery("from City c ORDER BY c.name DESC").getResultList();
					
			for(City city : cities) {
				System.out.println(city.getName());
			}
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}

}
