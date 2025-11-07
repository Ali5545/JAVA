package Grade;

import java.util.Scanner;

public class Collectinfo {
	static Scanner input = new Scanner(System.in);
	
	public Collectinfo()
	{
		askinfo();
	}
	
	public void askinfo()
	{
		float numgrades;
		boolean yesorno;
		
		System.out.print("How many grades will you be averaging? ");
		numgrades= input.nextFloat();
		yesorno= CheckNum(numgrades);
		if (yesorno == false)
		{
			System.out.print("Please enter a whole number (1-100)");
			askinfo();
		}
		else if (yesorno==true) 
		{
			Calculate input = new Calculate((int)numgrades);
		}
	}
	
	public boolean CheckNum(float gradenum)
	{
		boolean boolstate= true;
		
		float isyes = gradenum % 1;
		if (isyes >0)
		{
			return false;
		}
		else 
		{
			if (gradenum <1 || gradenum >=100)
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
