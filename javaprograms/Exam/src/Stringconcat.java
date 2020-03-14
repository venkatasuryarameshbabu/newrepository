import java.util.Scanner;
public class Stringconcat {
  public static void main(String[] args)
  {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the String:");
	 String s1=s.nextLine();
	 System.out.println("enter the number for frst n +ve int and last n +ve int:");
	 int n1=s.nextInt();
	 String x=s1.substring(0,n1);
	 String y=s1.substring(s1.length()-n1,s1.length());
     System.out.println("the new cocatenated String is:"+x.concat(y)); 
  }
}
