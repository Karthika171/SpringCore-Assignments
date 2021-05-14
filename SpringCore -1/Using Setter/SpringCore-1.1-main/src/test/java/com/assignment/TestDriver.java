package com.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestD {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer cust=(Customer) context.getBean("Customer");
		assertAll(
		()->assertEquals(cust.getCustomerName(),"sk"),
		()->assertEquals(cust.getCustomerId(),1),
		()->assertEquals(cust.getCustomerContact(),63748792),
		()->assertEquals(cust.getCustomerAddress().getStreet(),"NGGO Colony"),
		()->assertEquals(cust.getCustomerAddress().getCity(),"RKV road"),
		()->assertEquals(cust.getCustomerAddress().getZip(),638005),
		()->assertEquals(cust.getCustomerAddress().getCountry(),"India")
	);
	}

}
