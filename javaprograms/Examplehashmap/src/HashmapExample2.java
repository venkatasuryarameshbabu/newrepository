import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashmapExample2 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no employees:");
	int s1=s.nextInt();
	HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
  for(int i=0;i<s1;i++)
  {
	  h.put(s.nextInt(),s.nextInt());
  }
Set x=h.entrySet();
Iterator i=x.iterator();
int max=0;
int sum=0;
while(i.hasNext())
{
	Map.Entry me=(Entry) i.next();
	if((int)me.getValue()>max)

        {
		max=(int) me.getValue();
		}
}
System.out.println("max is:"+max);
Set x1=h.entrySet();
Iterator i1=x1.iterator();
while(i1.hasNext()) {
	Map.Entry m=(Entry) i1.next();
	if((int)m.getValue()<max)
	{
		sum=sum+(int)m.getValue();
	}
}
System.out.println("sum is :"+sum);
}
}
