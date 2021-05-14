package com.assignment;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.third.Triangle;

public class Driver {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer cust=(Customer) context.getBean("Customer");
		cust.printDetails();
	}

}
