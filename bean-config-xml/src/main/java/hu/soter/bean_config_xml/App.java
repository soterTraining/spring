package hu.soter.bean_config_xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			System.out.println(context.getBean(Customer.class));
		}
	}
}
