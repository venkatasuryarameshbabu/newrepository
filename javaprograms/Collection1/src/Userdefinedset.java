import java.util.*;
class persons implements Comparable<persons>
{
	int id;
	String name;
    public persons(int id,String name)
    {
    	this.id=id;
    	this.name=name;
    }
	@Override
	public String toString() {
		return "persons [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(persons o) {
		// TODO Auto-generated method stub
		if(name.compareTo(o.name)<0)
			return -1;//ascending order
		else if(name.compareTo(o.name)>0)
			return 1; //descending order
		else
			return 0;
	}
    
}

public class Userdefinedset {

	public static void main(String[] args) {

persons p=new persons(101,"surya");
persons p1=new persons(102,"hari");
persons p2=new persons(103,"shivam");
System.out.println(p2);
Set s=new HashSet();
s.add(p);
s.add(p1);
s.add(p2);
System.out.println(s);
Set t=new TreeSet();
t.add(p);
t.add(p1);
t.add(p2);
System.out.println(t);
	}

}
