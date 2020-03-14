package exh;
import java.util.Scanner;
public class array {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	       	       System.out.println("enter the array size");
	       	    int x=s.nextInt();
	       	    int[] a=new int[x];
	       	    System.out.println("enter the array elements");
	       	   for( int i=0;i<x;i++)
	       	   {
	       		   a[i]=s.nextInt();
	   
	       	   }
	       	    
	       System.out.println("enter the index of the element to acess");
	       int y=s.nextInt();
	       try
	       {
	    	 	    		   
	    			   System.out.println("element at"+i+ "is-"+a[y]);
	       }
	       catch(ArrayIndexOutOfBoundsException e)
	       {
	    	System.out.println(e);
	       }
	}
	

}
