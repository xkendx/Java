package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerDal customerDal = context.getBean("database", ICustomer.class);
		
		// CustomerManager manager = new CustomerManager(new CustomerDal());,		CustomerManager manager = new CustomerManager(new CustomerDal());
		// CustomerManager manager = new CustomerManager(new MySqlDal());
		// CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
	
		// manager.add();
		
		customerDal.add();

	}
	
	// IoC - Inversion of Control
	// Dependency Injection
	// Spaghetti
	// SOLID -
	
	
	
}