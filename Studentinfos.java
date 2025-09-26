package Javapack;

import java.util.Scanner;

public class Studentinfos {
	Scanner input = new Scanner(System.in);
	private Studentmain student1, student2, student3;
	private int total
	public static void main(String[] args) {
		System.out.print("How many students would you like to enter? (max 3): ");
		int studentcount= Scanner.nextInt();
		
	}
	public void mainmenu()
	{
		String menu = "\n\t********** Student Menu **********\n" +
                "\t1. Promote a student\n" +
                "\t2. Update a student's GPA\n" +
                "\t3. View student info\n" +
                "\t4. Exit\n"+
                "\t5***********************************\n"+
                "\tEnter your choice (1-4): "; 
		System.out.print(menu);
		
		int choice = Scanner.nextInt();
		
		if (choice == 5)
		{
			System.out.println("Goodbye!");
			return;
		}
		

	}

}
