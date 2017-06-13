package hu.soter.spring_first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private String street;
	private int number;

	@Autowired
	public Address(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", number=" + number + "]";
	}
	
	
}
