package javaPack;

import java.util.Scanner;

public class ArrayChar extends MainProgram{
	Scanner allinput=new Scanner(System.in);
	
	public void ArrayChar()
	{
		AcceptInfo();
	}
	
	public void AcceptInfo()
	{
		float numletters= allinput.nextFloat(); //Set a variable for the n amount of times a letter will be printed
		if(numletters % 1 !=0) //Checks if the number is a integer not a decimal 
		{
			System.out.print("incorrect value has been entered.\n");
			MainProgram.main(null);  //goes back to the start
		}
		else
		{
			int letternum= (int) numletters; //converts float to int
			allinput.nextLine();
			System.out.print("Enter a word: ");
			String wordent = allinput.nextLine();
			CheckWord(wordent, letternum);
		}
	}
	
	private void CheckWord(String entword, int letternum)
	{
		int wordlen= entword.length(); //strips the word to word length to check if the user entered a word
		if(wordlen==0)
		{
			MainProgram.main(null);
		}
		else
		{
			char[] wordarray= new char[wordlen];  //sets an array on length 
			for(int i=0; i<wordlen; i++)
			{
				wordarray[i]=entword.charAt(i); //check if the string is in lowercase
				if((int)wordarray[i] <= 96 || (int)wordarray[i] >= 123)
				{
					System.out.print(wordarray[i]+" is not a letter!\n");
				}
				else
				{
					System.out.print(wordarray[i]+ " Is a letter!\n");
					
					for (int x = 0; letternum>x; x++) //prints out a letter n amount of times 
					{
						System.out.println(wordarray[i]);
					}
				}
			}
		}
	}

}

