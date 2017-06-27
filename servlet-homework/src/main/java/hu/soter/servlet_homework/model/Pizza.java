package hu.soter.servlet_homework.model;

public class Pizza {
	private long id;
	private String name;
	private int price;
	
	public Pizza(long id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
