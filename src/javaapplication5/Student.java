package javaapplication5;

public class Student{
 private String	StudentId;
private String StudentName;
 private University university;

public Student(String	StudentId, String StudentName, University university){
	this.StudentId=StudentId;
	this.StudentName=StudentName;
	this.university=university;
}
public String getStudentId(){
	return StudentId;
}
public void setStudentId(String StudentId){
	this.StudentId=StudentId;
}
public String getStudentName(){
	return StudentName;
}
public void setStudentName(String StudentName){
	this.StudentName=StudentName;
}
public University getUniversity(){
	return university;
}
public void setUniversity(University university){
	this.university=university;
}
public String getStudentInfo(){
	return "studentId:\t" + StudentId + "\tstudentName:\t" + StudentName + 
"\tregistered in University:\t" + university.getUniversityName();
}
}
