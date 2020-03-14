import java.util.function.*;
import java.util.ArrayList;
import java.util.*;
class Testemp {
	String name;
	double salary;
	public Testemp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
public class Test
{
	public static void main(String[] args)
	{
		ArrayList<Testemp> l=new ArrayList<Testemp>();
		l.add(new Testemp("durga",1000));
		l.add(new Testemp("sunny",2000));
		l.add(new Testemp("bunny",3000));
		l.add(new Testemp("chinny",4000));
		BiConsumer<Testemp,Double>c=(e,d)->e.salary=e.salary+d;
		for(Testemp e:l)
		{
			c.accept(e,500.0);
		}
	for(Testemp e:l)
	{
		System.out.println("employeename:"+e.name+"salary="+e.salary);
	}
	}
	
}