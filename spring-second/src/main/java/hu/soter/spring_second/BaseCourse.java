package hu.soter.spring_second;

public abstract class BaseCourse implements Course {
	protected String courseName;
	private String courseId;
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	@Override
	public String toString() {
		return "BaseCourse [courseName=" + courseName + ", courseId=" + courseId + "]";
	}
}
