package hu.soter.spring_second;

public class DevelopementCourse extends BaseCourse {

	@Override
	public String learning() {
		return "Leaning to develop java. Coursename: " + courseName;
	}

}
