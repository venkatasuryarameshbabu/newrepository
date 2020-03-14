import java.util.Scanner;
import java.util.StringTokenizer;

public class Vowelscount {
public static void main(String[] args)
{
	int i = 0;
	System.out.println("enter the string to count:");
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	StringTokenizer tokenizer = new StringTokenizer(s1);
	for(int j=0;j<((CharSequence) tokenizer).length();j++)
	{
		char ch=((CharSequence) tokenizer).charAt(j);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':i=1;
		System.out.println(ch);
		}
	
	}
	if(i==0)
	{
		System.out.println("there are no vowels in your string");
	}
	}
}
