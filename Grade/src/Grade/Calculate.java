package Grade;

import java.util.Scanner;

public class Calculate {
	static Scanner input= new Scanner(System.in);
	
	public Calculate(int NumGrades) //the numgrade is the the amount of grade the user wants to calculate
	{
		int count=0;      //initializes the variables
		double total=0;
		
		while(count< NumGrades)  //while loop for multiple inputs and it will continue to loop until count is equal to Numgrade
		{
			System.out.println("Enter grade " + (count+1)+": " );
			double grade= input.nextDouble();
			
			if (grade>0 && grade<=100)   //after the user enters the grade, it checks if the grade is within 1-100
			{
				int range= (int)(grade/10);  //since the java switch gate doesn't let variable to be the case and only numbers. So the grade is divided by 10 and use int to make a range 
				String lettergrade="";
				double gpa=0;
				switch(range)
				{
				case 10: lettergrade= "A"; gpa=4.0; break; //based on the range it execute the only the case the range is equal to 
				case 9: lettergrade="A"; gpa=4.0; break;
				case 8: lettergrade="B"; gpa= 3.0; break;
				case 7: lettergrade="C"; gpa=2.0; break;
				case 6: 
					if (grade>=65) //for this since 65 is the failing mark, if statement is used so after 65 its's "D", "2.0" and not "F", "1.0"
					{
					lettergrade="D"; gpa=2.0;
					}
					else if (grade<65)  //below 65 is "F"
					{
						lettergrade="F"; gpa=1.0;
					}
					break;
				default:
					lettergrade="F"; gpa=1.0;
					break;
				}
				System.out.println("Letter Grade: "+ lettergrade);
				System.out.println("GPA: "+gpa);
				total=total+grade;  //all the grades gets totaled 
				count++; //the count increases 
			}
			else 
			{
				System.out.println("The grade is not valid please try again!");
				
			}
		}
		
		double avg= total/NumGrades; //the average for all the grades
		double gradegpa= (avg/100)*4; //the 4.0 scale average
		System.out.println("Grade Average: "+ avg);
		System.out.println("Grade GPA: "+ gradegpa);
		
	}
}
