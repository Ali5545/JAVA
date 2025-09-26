import java.util.Scanner;

public class Studentinfos {
    private static Scanner scanner = new Scanner(System.in);
    private static Studentmain student1, student2, student3;
    private static int totalcount;

    public static void main(String[] args) {
        info();  
    }

    public static void info() {
        System.out.print("How many students would you like to enter? (max 3): ");
        totalcount = scanner.nextInt();
        scanner.nextLine();

        if (totalcount < 1 || totalcount > 3) {
            System.out.println("Invalid number. Exiting...");
            return;
        }
        if (totalcount >= 1) {
            System.out.println("\nEnter details for Student 1");
            student1 = createStudent();
        }
        if (totalcount >= 2) {
            System.out.println("\nEnter details for Student 2");
            student2 = createStudent();
        }
        if (totalcount == 3) {
            System.out.println("\nEnter details for Student 3");
            student3 = createStudent();
        }
        mainmenu();
    }

    private static Studentmain createStudent() {
        System.out.print("\tEnter name: ");
        String name = scanner.nextLine();
        System.out.print("\tEnter grade level: ");
        int grade = scanner.nextInt();
        System.out.print("\tEnter GPA (0-100 scale): ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        return new Studentmain(name, grade, (gpa / 100) * 4);
    }

    public static void mainmenu() {
        String menu = "\n\t********** Student Menu **********\n" +
                "\t1. Promote a student\n" +
                "\t2. Update a student's GPA\n" +
                "\t3. View student info\n" +
                "\t4. Exit\n" +
                "\t***********************************\n" +
                "\tEnter your choice (1-4): ";
        System.out.print(menu);
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 4) {
            System.out.println("Goodbye!");
            return;
        }
        System.out.print("\tSelect student (1 to " + totalcount + "): ");
        int students = scanner.nextInt();
        scanner.nextLine();
        Studentmain selected = null;
        if (students == 1){
			selected = student1;
		} 
        else if (students == 2) {
			selected = student2;
		}
        else if (students == 3) {
			selected = student3;
		}
        else {
            System.out.println("\tInvalid student number.");
            return;
        }

        if (choice == 1) {
            selected.promote();
        } else if (choice == 2) {
            System.out.print("\tEnter new average (0-100): ");
            double avg = scanner.nextDouble();
            scanner.nextLine();
            selected.updateGpa(avg);
        } else if (choice == 3) {
            selected.printInfo();
        } else {
            System.out.println("\tInvalid choice.");
        }

        askifcontinue();
    }

    private static void askifcontinue() {
        System.out.print("\n\tReturn to menu? (yes/no): ");
        String yorn = scanner.nextLine().toLowerCase();
        if (yorn.equals("yes")) {
            mainmenu();
        } else {
            System.out.println("\n\tThank you. Program ended.");
        }
    }
}


	}

}

