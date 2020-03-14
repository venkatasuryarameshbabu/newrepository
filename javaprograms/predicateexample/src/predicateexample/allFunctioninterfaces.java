package predicateexample;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
class Students
{
	String name;
	int marks;
	Students(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}
public class allFunctioninterfaces {

	public static void main(String[] args) {
		Students s1=new Students("praveen",80);
		Students s2=new Students("kumar",60);
		Students s3=new Students("anil",50);
		Students s4=new Students("satyam",79);
		Students s5=new Students("kishore",90);
		ArrayList<Students> l=new ArrayList();
    l.add(s1);
    l.add(s2);
    l.add(s3);
    l.add(s4);
    l.add(s5);
    Predicate<Students>p= s->s.marks>=60;
    Function<Students,String> f=s->{
       int marks=s.marks;
       if(marks>=80) {
    	   return "A[Distinction]";
       }
       else if(marks>=60) {
    	   return "B[first Class]";
       }
       else if(marks>=40) {
    	   return "C[second class]";
       }
       else {
    	   return "failed";
       }
       };
       Consumer<Students>c=s-> 
       {
    	   System.out.println("studentname:"+s.name);
    	   System.out.println("Student marks:"+s.marks);
    	   System.out.println("Students grade:"+f.apply(s));
       };
	for(Students x:l)
	  {
		if(p.test(x))
			c.accept(x);
	  }
     }
    }
		