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
	public String getName()
	{
		String name;
		name = studentname;
		return name;
	}
	public int getGrade()
	{
		int gradelvl;
		gradelvl= grade;
		return gradelvl;
	}
	public double getGpa()
	{
		double GPA;
		GPA=gpa;
		return GPA;
	}
	public void promote()
	{
		grade++;
		System.out.println(getName() + " has been promoted to "+ grade+ ".");
	}
	public boolean ishonorroll()
	{
		return gpa>=3.5;
	}
	public void honorrollstat()
	{
		if (ishonorroll())
		{
			System.out.println("Honor Roll: Yes");
		} 
		else {
			System.out.println("Honor Roll: No");
		}
	}
	public void updateGpa(double average)
	{
		gpa=(average/100)*4;
		System.out.println(getName()+"'s GPA has been updated to:"+ gpa);
	}
	public void printInfo()
	{
        System.out.println("Name      : " + getName());
        System.out.println("Grade     : " + getGrade());
        System.out.println("GPA (4.0 scale) : " + getGpa());
        System.out.println("Honor roll: "+ ishonorroll());
        System.out.println("--------------------------------------------------");
	}
	
}
