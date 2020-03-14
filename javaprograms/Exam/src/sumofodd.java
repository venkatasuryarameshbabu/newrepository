import java.util.Scanner;
public class sumofodd {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int i=sc.nextInt();
	int rem,sum=0;
	while(i>0)
	{
		rem=i%10;
	    if((rem%2)!=0)
        sum=sum+rem;
        i=i/10;
	}
	System.out.println("sum of oddvalues is:"+sum);
}
	
}
