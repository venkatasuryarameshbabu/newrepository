
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class vectorCollectionex {
	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add("java");
		ar.add("seleneum");
		ar.add("dotnet");
		System.out.println(ar);
		ListIterator itr=ar.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}

}
