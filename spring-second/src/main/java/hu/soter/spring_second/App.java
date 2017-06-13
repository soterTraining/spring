package hu.soter.spring_second;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			Student lalyos = context.getBean("lalyos", Student.class);
			Student elek   = context.getBean("elek", Student.class);
			
			System.out.println(lalyos);
			System.out.println(elek);
    	}
	}
}
