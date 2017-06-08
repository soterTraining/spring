package hu.soter.bean_config_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("hu.soter.bean_config_java")
public class Beans {

	@Bean
	public Customer customer() {
		return new Customer();
	}
	
	@Bean
	public Customer hashmarkCustomer() {
		Customer c = new Customer();
		c.setFormatter(new HashmarkNameFormatter());
		
		return c;
	}
	
	@Bean
	public Formatter hashmarkNameFormatter() {
		return new HashmarkNameFormatter();
	}
	
	@Primary
	@Bean
	public Formatter underscoreNameFormatter() {
		return new UnderscoreNameFormatter();
	}
}
