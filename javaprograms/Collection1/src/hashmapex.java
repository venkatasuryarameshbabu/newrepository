import java.util.*;

import com.sun.swing.internal.plaf.metal.resources.metal;
class Cgroup 
{
	String dep1;
	String dep2;
	String dep3;
	Cgroup(String dep1,String dep2,String dep3){
		super();
		this.dep1=dep1;
		this.dep2=dep2;
		this.dep3=dep3;
	}
	@Override
	public String toString() {
		return "Cgroup [dep1=" + dep1 + ", dep2=" + dep2 + ", dep3=" + dep3 + "]";
	}
	
	}
public class hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Cgroup> m=new HashMap<String,Cgroup>();
   m.put("U9", new Cgroup("cse","it","eee"));
   m.put("6U", new Cgroup("cse","it","eee"));
   m.put("A0", new Cgroup("cse","it","eee"));
   m.put("5U", new Cgroup("cse","it","eee"));
Set s=m.entrySet();
Iterator it1=s.iterator();
while(it1.hasNext())
{
	Map.Entry me=(Map.Entry)it1.next();
	Cgroup g=(Cgroup)me.getValue();
	if(g.dep1.equals("cse")||g.dep2.equals("cse")||g.dep3.equals("cse"))
	{
		System.out.println(me.getKey());
	}
}
	}
}

