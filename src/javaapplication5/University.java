package javaapplication5;

public class University{
	
	private String UniversityName;
	public University(String UniversityName){
		
		this.UniversityName = UniversityName;
	}
	
	public String getUniversityName(){
		return UniversityName;
	}
	public void setUniversityName(String UniversityName){
		this.UniversityName = UniversityName;
	}
	public  String getUniversityInfo(){
		return "university name:\t" +UniversityName;
	}
}