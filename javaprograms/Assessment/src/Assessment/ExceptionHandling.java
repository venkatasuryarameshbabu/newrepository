package Assessment;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		super("Age is Negative");
	}
}
class InsufficientAgeException extends Exception
{
	public InsufficientAgeException()
	{
		super("Age is Less Than 18");
	}

}
class Voting 
{
	public void testAge(int age) throws InsufficientAgeException,InvalidAgeException
	{
		if(age>0 && age<18)
			throw new InsufficientAgeException();
		else if(age<0)
			throw new InvalidAgeException();
		else
			System.out.println("Eligible for Voting");
	}
}
public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		Voting v=new Voting();
		try
		{
			v.testAge(age);
		}
		catch(InsufficientAgeException e)
		{
			System.out.println(e);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}
