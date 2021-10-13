package Student_Management_System;

public class Student 
{
     
	
	
	private int id;
     private String  fName;
     private int age;
     private String Course;
     
     public Student() {
 		super();
 		// TODO Auto-generated constructor stub
 	}
     
     public Student(int id, String fName, int age, String course) {
 		super();
 		this.id = id;
 		this.fName = fName;
 		this.age = age;
 		Course = course;
     }
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
}


