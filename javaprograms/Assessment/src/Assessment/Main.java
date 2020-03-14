
package Assessment;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an Integer");
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> a1 = new ArrayList<Integer>();
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    System.out.println("Enter elements in ArrayList1");
	    for (int i = 0; i < n; i++)
	      a1.add(Integer.parseInt(sc.nextLine()));
	    System.out.println("Enter elements in ArrayList2");
	    for (int i = 0; i < n; i++)
	      a2.add(Integer.parseInt(sc.nextLine()));
	    char c = sc.nextLine().charAt(0);
	    System.out.println(Usercode.performSetOperations(a1,a2,c));
	}
}