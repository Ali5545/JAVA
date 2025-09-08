package inputoutput;

import java.util.Scanner;

public class introjava {

	public static void main(String[] args) {
		Scanner allinput = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = allinput.nextLine();
		
		System.out.print("Enter your age: ");
		int age = allinput.nextInt();
		
		System.out.println("Hello, " + name + "! You are " + age + " years old.");
		

	}

}
