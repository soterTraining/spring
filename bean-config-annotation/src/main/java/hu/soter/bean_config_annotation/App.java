package hu.soter.bean_config_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Beans.class)) {
			System.out.println(context.getBean(Customer.class));
		}
	}
}
