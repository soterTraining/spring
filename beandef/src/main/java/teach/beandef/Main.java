package teach.beandef;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	Message message;
	
	
    public static void main(String... args) {
    	try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
    		MailBox mailbox = context.getBean("mailbox", MailBox.class);
    		System.out.println(mailbox);
    	}
    }
    
    
}
