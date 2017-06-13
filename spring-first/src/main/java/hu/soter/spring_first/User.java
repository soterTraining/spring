package hu.soter.spring_first;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	private String name;
	
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + "]";
	}
}
