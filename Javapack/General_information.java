package Javapack;

public class General_information {

	public static void main(String[] args) 
	{
		Collectinfo();
	}
	
	private static void Collectinfo()
	{
		Person personinfo = new Person("Labron James ", 1984);
		
		System.out.println("Fullname in Upper Case: " + personinfo.FullnameUpper());
		System.out.println("Fullname in Lower Case: " + personinfo.FullnameLower());
		System.out.println("Length of fullname: " + personinfo.Fullnamelength());
		System.out.println("Person's Age: " + personinfo.PersonAge());
	}

}
