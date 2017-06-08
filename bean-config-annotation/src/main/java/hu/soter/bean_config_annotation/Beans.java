package hu.soter.bean_config_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("hu.soter.bean_config_annotation")
public class Beans {

	@Bean
	public Customer customer() {
		Customer customer = new Customer();
		customer.setFormatter(hashmarkNameFormatter());
		
		return customer;
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
