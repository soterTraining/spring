package hu.soter.spring_first;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			User user = context.getBean(User.class);
			System.out.println(user);
    	}
	}
}
