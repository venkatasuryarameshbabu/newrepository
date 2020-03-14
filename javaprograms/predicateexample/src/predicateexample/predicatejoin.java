package predicateexample;
import java.util.function.Predicate;
public class predicatejoin {

	public static void main(String[] args) {
		int[] x= {0,10,20,30,40,50};
		Predicate<Integer> p1 = i->(i>=20);
		Predicate<Integer> p2=i->(i%2==0);
		/*System.out.println(p1.and(p2).test(22));
		//System.out.println(p1.and(p2).test(21));
		//System.out.println(p1.or(p2).test(22));*/
		System.out.println("the number greater than 20 are:");
		m1(p1,x);
		
		 

	}
	public static void m1(Predicate<Integer>p,int[]x)
	{
		for(int x1:x)
			if(p.test(x1))
				System.out.println(x1);
	}


}
