package Javapack;

public class Studentmain {
	private String studentname;
	private int grade;
	private double gpa;
	
	public Studentmain(String studentname, int grade, double gpa)
	{
		this.studentname= studentname;
		this.grade=grade;
		this.gpa=gpa;
	}
	public String getname()
	{
		String name;
		name = studentname;
		return name;
	}
	public int getgrade()
	{
		int gradelvl;
		gradelvl= grade;
		return gradelvl;
	}
	public double getgpa()
	{
		double GPA;
		GPA=gpa;
		return GPA;
	}
	public void promote()
	{
		grade++;
		System.out.println(getname() + " has been promoted to "+ grade+ ".");
	}
	public boolean ishonorroll()
	{
		return gpa>=3.5;
	}
	public void updategpa(double average)
	{
		double update=(average/100)*4;
		System.out.println(getname()+"'s GPA has been updated to:"+ gpa);
	}
	public void printinfo()
	{
        System.out.println("Name      : " + getname());
        System.out.println("Grade     : " + getgrade());
        System.out.println("GPA (4.0 scale) : " + getgpa());
        System.out.println("Honor roll: "+ ishonorroll());
        System.out.println("--------------------------------------------------");
	}
	public class StudentMenu {
	    public StudentMenu() {
	    	String title = "\n\t*** Welcome to the Student Tracker System ***\n";
	        String line = "\t----------------------------------------------\n";
	        String menu = "\t1. Show Student Details\n\t2. Promote Student\n\t3. Update GPA\n\t4. Exit\n";
	    //for the escapes (for the option
	    }

}
