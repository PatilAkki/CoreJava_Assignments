package Assignment_6_Sept;

public class Student {
	
	int rollNo;
	String studentFirstName;
	String studentLastName;
	int studentAge;

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.rollNo = 1;
		s1.studentFirstName = "Raj";
		s1.studentLastName = "Roy";
		s1.studentAge = 15;
		
		s2.rollNo = 2;
		s2.studentFirstName = "Prasad";
		s2.studentLastName = "Patil";
		s2.studentAge = 16;
		
		System.out.println(s1.rollNo+" "+s1.studentFirstName+" "+s1.studentLastName+" "+s1.studentAge);
		
		System.out.println(s2.rollNo+" "+s2.studentFirstName+" "+s2.studentLastName+" "+s2.studentAge);
	}

}
