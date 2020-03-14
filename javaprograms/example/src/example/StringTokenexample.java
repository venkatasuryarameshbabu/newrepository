/*package example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenexample {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer str=new StringTokenizer(s," ");
		String s1=str.nextToken();
		while(str!=null)
		{
			char ch=s1.charAt(s1.length()-1);
			System.out.println(ch+"$");

		}
	}

}*/
package example;

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String n = sc.nextLine();
		
	
		StringTokenizer st = new StringTokenizer(n, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreTokens()) {
		String str1 = st.nextToken();
		String str2 = str1.substring(str1.length() - 1);
		sb.append(str2).append("$");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		}
		 
		}


