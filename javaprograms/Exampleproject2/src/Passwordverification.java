import java.util.Scanner;

public class Passwordverification {
   public void verify(String s2)
   {
	   String s="(?=.*d{1}).(?=.*[@#$]).{6,20}";
	   if(s2.equals(s))
		  {
			  System.out.println("entered password is correct format");
		  }
		else
		{
			System.out.println("entered password is not a correct format");
		}
   }
}
