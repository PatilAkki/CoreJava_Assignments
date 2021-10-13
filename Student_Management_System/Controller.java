package Student_Management_System;

import java.util.Scanner;

public class Controller 
{
	
	static void menuDriven()
	{
		System.out.println("Please Enter the option to Proceed in the Application");
		System.out.println("1----To Register New Student");
		System.out.println("2----To View Existing Student Records");
		System.out.println("3----To Update Student Record");
		System.out.println("4----To Delete Student Record");
		System.out.println("0----To Exit from the Application");
	}

	public static void main(String[] args) 
	{
		
		Operations operation = new Operations();

		int option;
		do 
		{
			//Student st = new Student();
			menuDriven();
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch(option)
			{
			case 1:operation.addStudent();
			       System.out.println("__________ Congratulations __________");
			       System.out.println("Your Data Has Been Submitted...  Back to Menu");
			       System.out.println("*********************************************************");
			       break;
			       
			       
			case 2:operation.viewStudent();
			       System.out.println("***********************************************************");
			       break;
			       
			case 3:operation.updateStudent();
			       System.out.println("Student Data has been Updated Successfully");
			       System.out.println("***********************************************************");
			       
		       break;
			       
			case 4:operation.deleteStudent();
			       System.out.println("Student Data has been Deleted Successfully");
			       System.out.println("***********************************************************");
		           break;
			       
						       
			}
		}
		while(option !=0);
			

	}

}
