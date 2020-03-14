import java.util.function.BiFunction;
class Student
{
	String htno;
	String name;
   public Student(String htno,String name)
   {
	   this.htno=htno;
	   this.name=name;
   }
@Override
public String toString() {
	return "Student [htno=" + htno + ", name=" + name + "]";
}
   
}
public class BiFunctionEx {

	public static void main(String[] args) {
		BiFunction<String,String,Student> bi=(htno,name)->new Student(htno,name);
	Student a=bi.apply("1001", "surya");
	System.out.println(a.name+a.htno);
	}
	

}
