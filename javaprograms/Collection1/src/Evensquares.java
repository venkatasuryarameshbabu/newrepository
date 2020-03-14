import java.util.Scanner;
public class Evensquares {
		public static void main(String[] args) {
				
				Scanner s=new Scanner(System.in);
				System.out.println("enter the number to add the sum of squares digits:");
				int n=s.nextInt();
				int rem,sum=0;
				while(n>0)
				{
					rem=n%10;
			        if(rem%2==0)
			        	sum=sum+rem*rem;
			           n=n/10;
				}
				System.out.println("sum of squares of the even digitd is:"+sum);

			}

		}
