import java.util.Scanner;

public class kaspernumber {
	public static void main(String[] args)
	{
		System.out.println("enter the number:");
		Scanner n=new Scanner(System.in);
		int s1=n.nextInt();
		int square=s1*s1;
		String s2=Integer.toString(square);
		int len=s2.length();
		String n1=s2.substring(0,len/2);
	    String n2=s2.substring(len/2,len);
	       int result1=Integer.parseInt(n1);
	       int result2=Integer.parseInt(n2);
	       int sum=result1+result2;
	    //int sum=(int)n1+n2;
	      if(s1==sum)
	      {
	    	  System.out.println("entered number is kasper number");
	      }
	      else
	      {
	    	  System.out.println("entered number is not kasper number");
	      }
	}

}
