import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList colors=new ArrayList();
		    colors.add("Red");
		    colors.add("green");
		    colors.add("blue");
		    colors.add("yellow");
		    colors.add("violet");
		    colors.add("darkblue");
		System.out.println(colors);
		ArrayList ar=new ArrayList();
            ar.add("lightpink");
            ar.add("pink");
            ar.add("brown");
            colors.add(ar);
            System.out.println(ar);
           	
 Iterator ir=colors.iterator();
 while(ir.hasNext()) {
	System.out.println(ir.next());
}
	}
}