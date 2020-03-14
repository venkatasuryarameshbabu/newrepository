package predicateexample;

import java.util.function.Predicate;

public class predicateex {

	public static void main(String[] args) {
		Predicate<Integer> p= i->{
			boolean flag=true;
			    for(int x=2;x<i;x++)
			    {
			    	if(i%2==0)
			    		flag=false;
			    	   break;
			    }
			    	return flag;
			    	
		};
		System.out.println(p.test(13));
		Predicate<String> s1=s->(s.charAt(0)=='k');
				System.out.println(s1.test("kamal"));

	}

}
