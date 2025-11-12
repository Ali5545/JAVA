package Grade;

import java.util.Scanner;

public class Collectinfo {
	static Scanner input = new Scanner(System.in); //Scanner to take inputs from the user
	
	public Collectinfo()      //Calls askinfo 
	{
		askinfo();
	}
	
	public void askinfo()            //Ask the user how many grades they want to calculate
	{
		float numgrades;             //labels what type of variable they are
		boolean yesorno;
		
		System.out.print("How many grades will you be averaging? ");
		numgrades= input.nextFloat();
		yesorno= CheckNum(numgrades);    //checks out if the input is an integer 
		if (yesorno == false)
		{
			System.out.print("Please enter a whole number (1-100)");
			askinfo();
		}
		else if (yesorno==true) //if the input is correct then it gets sent to another class (calculate())
		{
			Calculate input = new Calculate((int)numgrades);
		}
	}
	
	public boolean CheckNum(float gradenum)   
	{
		boolean boolstate= true;
		
		float isyes = gradenum % 1; //checks if it is a decimal or integer
		if (isyes >0)
		{
			return false;
		}
		else 
		{
			if (gradenum <1 || gradenum >=100)  //checks if the number is within the rang between 1-100
			{
				return false;
			}
			else 
			{
				return true;
			}
		}
	}

}

