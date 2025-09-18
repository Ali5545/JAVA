package Javapack;

public class Person 
{
	private String fullname;
	private int year;
	
	public Person(String fullname, int year)
	{
		this.fullname= fullname;
		this.year= year;
	}
	
	public String FullnameUpper()
	{
		return fullname.toUpperCase();
	}
	public String FullnameLower()
	{
		return fullname.toLowerCase();
	}
	public int Fullnamelength()
	{
		return fullname.length();
	}
	public int PersonAge()
	{
		return 2025- year;
	}

}
