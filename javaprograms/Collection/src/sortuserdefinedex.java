import java.util.*;
class Student implements Comparable<Student>{
	String htno;
	String name;
	Student(String hno,String name){
		this.htno=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return 1;
		else return 0;
	}
	
}
public class sortuserdefinedex {

}
