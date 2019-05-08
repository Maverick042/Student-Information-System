package javaapplication5;

/**
 * @(#)StudentRegistration.java
 *
 *
 * @author
 * @version 1.00 2012/4/3
 */


public class StudentRegistration {
	private Student student;
	private Course course[];
	private University university;
    public StudentRegistration(Student student, Course course[], University university) {
    	this.course=course;
    	this.university=university;
    	this.student=student;
    }
    public void setStudent(Student student){
    	this.student=student;
    }
    public Student getStudent(){
    	return student;
    }
    public void setCourse(Student student){
    	this.course=course;
    }
    public Course[] getCourse(){
    	return course;
    }
    public void setUniversity(University university){
    	this.university=university;
    }
    public University university(){
    	return university;
    }
    public String getStudentRegistrationInfo(){
    	String output="";
    	output=output+"Name: "+student.getStudentName()+", University: "+university.getUniversityName()+", Courses: ";
    	for(int i=0;i<course.length;i++)
    	{
    		output=output+course[i].getCourseName();
    		if(i!=course.length-1){
    			output=output+", ";
    		}
    	}
    	return output;
    }
}