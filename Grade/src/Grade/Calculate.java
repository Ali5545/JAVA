package Grade;

import java.util.Scanner;

public class Calculate {
	static Scanner input= new Scanner(System.in);
	
	public Calculate(int NumGrades)
	{
		int count=0;
		double total=0;
		
		while(count< NumGrades)
		{
			System.out.println("Enter grade " + (count+1)+": " );
			double grade= input.nextDouble();
			
			if (grade>0 && grade<=100)
			{
				int range= (int)(grade/10);
				String lettergrade="";
				double gpa=0;
				switch(range)
				{
				case 10: lettergrade= "A"; gpa=4.0; break;
				case 9: lettergrade="A"; gpa=4.0; break;
				case 8: lettergrade="B"; gpa= 3.0;break;
				case 7: lettergrade="C"; gpa=2.0;break;
				case 6: 
					if (grade>65) 
					{
					lettergrade="D"; gpa=2.0;
					}
					else if (grade<65)
					{
						lettergrade="F"; gpa=1.0;
					}
					break;
				default:
					break;
				}
				System.out.println("Letter Grade: "+ lettergrade);
				System.out.println("GPA: "+gpa);
				total=total+grade;
				count++;
			}
			else 
			{
				System.out.println("The grade is not valid please try again!");
				
			}
		}
		
		double avg= total/NumGrades;
		double gradegpa= (avg/100)*4;
		System.out.println("Grade Average: "+ avg);
		System.out.println("Grade GPA: "+ gradegpa);
		
	}
}
