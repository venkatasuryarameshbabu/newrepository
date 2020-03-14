package example;

import java.util.function.Function;
import java.util.function.Predicate;


public class Predict {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Predicate<Integer>p1=i->(!(i%2==0));
		//System.out.println("the numbers which are odd");
	
	System.out.println(p1.test(5));
	int a;
	int b;
	Function<Integer,Double> area=r->3.14*r*r;
	System.out.println(area.apply(2));
	}

}
