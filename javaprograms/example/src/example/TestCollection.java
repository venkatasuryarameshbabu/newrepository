package example;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student("surya","Kurnool",22));
		ar.add(new Student("ramesh","guntur",21));
		ar.add(new Student("babu","vizag",23));
		Collections.sort(ar);
		/*for(Student s:ar) {
			System.out.println(s);
		}*/
		ar.forEach(System.out::println);

	}

}
