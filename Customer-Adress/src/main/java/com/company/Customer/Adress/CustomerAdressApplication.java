package com.company.Customer.Adress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CustomerAdressApplication {
    private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("config.xml");
		Customer customer=(Customer) context.getBean("Customer");
		customer.customerdetails();
		SpringApplication.run(CustomerAdressApplication.class, args);
	}

}
