import java.util.*;
public class Setexample {
public static void main(String[] args)
{
	Set s=new HashSet();
	s.add("India");
	s.add("China");
	s.add("japan");
	s.add("haryana");
	s.add("India");
	s.add(null);
	System.out.println(s);
	Set u=new TreeSet();
	u.add("India");
	u.add("China");
	u.add("japan");
	u.add("haryana");
	u.add("India");
	//u.add(null);
	System.out.println(u);
	
}
}
