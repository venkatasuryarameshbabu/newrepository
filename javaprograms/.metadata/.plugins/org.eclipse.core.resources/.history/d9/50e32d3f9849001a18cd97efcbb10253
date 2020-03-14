package example;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String city;
	int age;
	Student(String name,String city,int age){
		this.name=name;
		this.city=city;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public int compareTo(Student stu) {
		if(name.compareTo(stu.name)<0) {
			return 1;
		}
		else if(name.compareTo(stu.name)>0) {
			return -1;
		}
		else
			return 0;
	}
	
}