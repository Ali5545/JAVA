package controltower;

import java.util.Scanner;

public class tower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Airplane Plane1 = new Airplane();
		Airplane Plane2 = new Airplane("AAA02", 15.8, 128, 30000);
		
		System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
		String cs= input.nextLine().toUpperCase();
		double dist= input.nextDouble();
		int dir = input.nextInt();
		int alt = input.nextInt();
		Airplane Plane3 = new Airplane(cs, dist, dir, alt);
		
		System.out.println("Initial Position:");
		System.out.println("Airplane 1: "+Plane1.toString());
		System.out.println("Airplane 2: "+Plane2.toString());
		System.out.println("Airplane 3: "+Plane3.toString());
		
		System.out.println("Initial Distances:");
		System.out.println("The distance between Airplane 1 and Airplane 2 is " + Plane1.distTo(Plane2)+ " miles");
		System.out.println("The distance between Airplane 1 and Airplane 3 is " + Plane1.distTo(Plane3)+ " miles");
		System.out.println("The distance between Airplane 2 and Airplane 3 is " + Plane2.distTo(Plane3)+ " miles");
		
		System.out.println("Initial Height Differences:");
		System.out.println("The difference in height between Airplane 1 and Airplane 2 is " +Plane1.getAlt(Plane2)+ " feet");
		System.out.println("The difference in height between Airplane 1 and Airplane 3 is " +Plane1.getAlt(Plane3)+ " feet");
		System.out.println("The difference in height between Airplane 2 and Airplane 3 is " +Plane2.getAlt(Plane3)+ " feet");
		Plane1.move(Plane2.distTo(Plane3), 65);
		Plane2.move(8.0,  135);
		Plane3.move(5.0, 55);
		Plane1.gainAlt(3000);
		Plane2.loseAlt(2000);
		Plane3.loseAlt(4000);
		System.out.println("New Position:");
		System.out.println("Airplane 1: "+Plane1.toString());
		System.out.println("Airplane 2: "+Plane2.toString());
		System.out.println("Airplane 3: "+Plane3.toString());
		
		System.out.println("New Distance Difference:");
		System.out.println("The distance between Airplane 1 and Airplane 2 is " + Plane1.distTo(Plane2)+ " miles");
		System.out.println("The distance between Airplane 1 and Airplane 3 is " + Plane1.distTo(Plane3)+ " miles");
		System.out.println("The distance between Airplane 2 and Airplane 3 is " + Plane2.distTo(Plane3)+ " miles");
		
		System.out.println("New Height Difference:");
		System.out.println("The difference in height between Airplane 1 and Airplane 2 is " +Plane1.getAlt(Plane2)+ " feet");
		System.out.println("The difference in height between Airplane 1 and Airplane 3 is " +Plane1.getAlt(Plane3)+ " feet");
		System.out.println("The difference in height between Airplane 2 and Airplane 3 is " +Plane2.getAlt(Plane3)+ " feet");
	}

}
