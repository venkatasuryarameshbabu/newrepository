package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		int sum=0;
		System.out.println("Enter ur values");
		for(int i=0;i<n;i++) {
			h.put(sc.nextInt(), sc.nextInt());
		}
		
		Set entries=h.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			int k=(int) m.getKey();
			
			int value=0;
			if(k%2!=0) {
				count++;
				value=(Integer) m.getValue();
				sum=sum+value;
			}
	}
		int avg=sum/count;
		System.out.println(avg);

	}

}
