package IntroPack;

import java.util.Scanner;

public class CandyFriends {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total candies:  ");
		int candies = input.nextInt();
		
		System.out.print("Enter number of friends:  ");
		int friends = input.nextInt();
		
		int eachget = candies / friends;
		int leftover = candies % friends;
		
		System.out.print("Enter your height in meters: ");
		double height = input.nextDouble();
		
		System.out.print("Enter your weight in kilograms: ");
		double weight = input.nextDouble();
		double bmi = weight / (height * height);
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("Each friend gets " + eachget + " candies");
		System.out.println("Leftover candies: " + leftover);


	}

}
