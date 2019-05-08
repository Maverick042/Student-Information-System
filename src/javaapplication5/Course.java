package javaapplication5;

public class Course{
	
   private String CourseName;
 
 private University university;
public Course(String CourseName, University university){
	
	this.CourseName=CourseName;
	
	this.university=university;
}

public String getCourseName(){
	return CourseName;
}
public void setCourseName(String CourseName){
	this.CourseName=CourseName;
}

public University getUniversity(){
	return university;
}
public void setUniversity(University university){
	this.university=university;
}
public String getCourseInfo(){
	return "\tcourseName:\t" +
CourseName +
"\tCourseOfferedBy\t" + university.getUniversityName();
}
}
