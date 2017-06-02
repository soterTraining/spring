package teach.hello;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            Message message = (Message) context.getBean("helloWorld");
            System.out.println(message);
        }
    }
}
