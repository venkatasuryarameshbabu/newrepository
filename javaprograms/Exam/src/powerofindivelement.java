import java.util.Scanner;
public class powerofindivelement extends Reverseofanumber {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		Integer n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{a[i]=s.nextInt();
		}
	double sum=0;
		   for(int i=0;i<n;i++)
		   {
			  sum=sum+Math.pow(a[i], i);
			   
		   }
		System.out.println("powers of every digit in the given number is:"+(int)sum);   
	}
}
