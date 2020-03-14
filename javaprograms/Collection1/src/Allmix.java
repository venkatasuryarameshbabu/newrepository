import java.util.Collection;
import java.util.*;
public class Allmix {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		   ar.add("hello");
		   ar.add("all");
		   ar.add("are");
		   ar.add("you");
		   ar.add("understanding");
		   ar.add("the");
		   ar.add("concepts");
		   System.out.println(ar);
		   /* Iterator i=ar.iterator();
		   while(i.hasNext())
		   {
			   System.out.println(i.next());
		   }*/
			   Set<String> s=new TreeSet<String>();
			      s.add("oh");
			      s.add("yah");
			      s.add("fine");
			      s.add("it's");
			      s.add("ok");
			    System.out.println(s);  
        PriorityQueue<String> pq=new PriorityQueue<String>();
             pq.add("ok");
             pq.add("then");
             pq.add("what");
             pq.add("else");
             System.out.println(pq);
        Map<Integer,Collection>  m=new HashMap<Integer,Collection>();   
	          m.put(1001,ar);
	          m.put(1002,s);
	          m.put(1003,pq);
	System.out.println(m);
	Set s1=m.entrySet();
	Iterator i=s1.iterator();
	while(i.hasNext()) {
		Map.Entry me=(Map.Entry)i.next();
		Collection c=(Collection)me.getValue();
		System.out.println(me.getKey());
		System.out.println(c);
	}
	}
	

}
