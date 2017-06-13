package hu.soter.spring_second;

public class DrawingCourse extends BaseCourse {

	@Override
	public String learning() {
		return "Learning to draw because this is a " + courseName + " course.";
	}
}
