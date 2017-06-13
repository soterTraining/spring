package hu.soter.spring_second;

import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private List<Course> courses;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		String courseMessages = "";
		
		for(final Course course : courses) {
			courseMessages += course.learning();
		}
		
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", courses=" + courseMessages;
	}
}
