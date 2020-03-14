package predicateexample;

import java.util.function.Function;

public class numberofvowelsbyFunction {

	public static void main(String[] args) {
		Function<String,Integer> f=s->
		{
			int count=0;
			for(int i=0;i<s.length();i++)
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					count++;
				}
	      return count;	
		};
		System.out.println("the number of vowels in the string is:"+f.apply("surya is from Guntur"));
		Function<String,Integer>f1=a->
		{  
			int count=0;
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)==' ')
					count++;
			}
		  return a.length()-count;
		 
		};
		
System.out.println("the number of vowels in the string is:"+f1.apply("surya is from Guntur"));
	}

}
