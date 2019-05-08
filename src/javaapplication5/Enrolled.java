package javaapplication5;

public class Enrolled{
private Student	student; 
private Course course;
public Enrolled(Student	student, Course course){
	this.student=student;
	this.course=course;
}
public Student getstudent(){
	return student;
}
public void setstudent(Student student){
	this.student=student;
}
public Course getcourse(){
	return course;
}
public void setcourse(Course course){
	this.course=course;
}
public String getEnrollmentInfo(){
	return student.getStudentName() + "\t is enrolled in course\t" +
course.getCourseName() + "\t offered by\t" +
course.getUniversity().getUniversityName();
}
}