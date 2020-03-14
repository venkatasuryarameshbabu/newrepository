
package Assessment;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayListexample {

public static void main(String[] args) {
Student x1=new Student(81,"surya");
Student x2=new Student(65,"syam");
Student x3=new Student(55,"babu");
Student x4=new Student(50,"venkata");
Student x5=new Student(40,"ramesh");
ArrayList<Student>l=new ArrayList<Student>();
l.add(x1);
l.add(x2);
l.add(x3);
l.add(x4);
l.add(x5);
Predicate<Student> pre=(s)->s.marks>=50;
Function<Student,String>f=(s)->
{
if(s.marks>=80)
{
return "Distinction";
}
else if(s.marks>=60&&s.marks<=79)
return "first Classs";
else if(s.marks>=50&&s.marks<=60)
return "second Classs";
else
   return "fail";
};
Consumer<Student>c=(s)->
{
System.out.print(s.name+" ");
System.out.print(s.marks+" ");
System.out.println(f.apply(s));

};
for(Student s : l)
{
if(pre.test(s))
{
c.accept(s);
}
}




}

}
