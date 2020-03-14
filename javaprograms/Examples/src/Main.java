import java.util.Scanner;

class UsermainCode
{
	 public String getString(String s)
	{
		/* StringBuilder sb = new StringBuilder();
		 sb.append(s);*/
		if(s.charAt(0)=='j'&&s.charAt(1)=='b')
		{
			return s;
		}
		else if(s.charAt(0)=='j')
		{
			 
		//String w=(sb.deleteCharAt(1)).toString();
			String w=s.substring(0,1);
			System.out.println(w);
			String w1=s.substring(2,s.length());
			
			System.out.println(w1);
			 String w2=w.concat(w1);
		    return w2;
			   
		}
		else if(s.charAt(1)=='b')
		{
			String z=s.substring(1,s.length());
                     return z;		
		}
		else {
			String w4=s.substring(2,s.length());
			return w4;
		}
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the string:");
Scanner n=new Scanner(System.in);
String s=n.nextLine();

UsermainCode umc=new UsermainCode();
System.out.println(umc.getString(s));

	}

}
