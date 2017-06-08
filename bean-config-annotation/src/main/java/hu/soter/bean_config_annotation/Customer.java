package hu.soter.bean_config_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;
	
	@Autowired
	private Formatter formatter;
	
	public Customer() {
		this.name = "John Rambo";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Formatter getFormater() {
		return formatter;
	}

	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}

	@Override
	public String toString() {
		String formatted = name;
		if (this.formatter != null) {
			formatted = this.formatter.format(name);
		}
		
		return "Customer [name=" + formatted + "]";
	}
	
	
}
