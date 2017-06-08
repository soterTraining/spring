package hu.soter.bean_config_java;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Beans.class)) {
			Customer customer = context.getBean("customer", Customer.class);
			System.out.println(customer);
			
			//customer = context.getBean("hashmarkCustomer", Customer.class);
			Formatter formatter = context.getBean("hashmarkNameFormatter", Formatter.class);
			customer.setFormatter(formatter);
			
			System.out.println(customer);
		}
	}
}
