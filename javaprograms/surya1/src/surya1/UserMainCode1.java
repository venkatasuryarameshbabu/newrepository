package surya1;

public class UserMainCode1 {
	public static void main(String args[])
	{
		int num=6;
		 boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				{
				flag=true;
				break;
				}
		}
		if(!flag)
		{
			System.out.println(+num+ "it is prime number");
		
		}
		else
		{
			System.out.println(+num+ "it is not a prime number");
		}
	}
}
