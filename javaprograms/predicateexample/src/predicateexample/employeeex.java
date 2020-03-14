package predicateexample;
import java.util.function.Predicate;
import java.util.ArrayList;
 public class Employee
{
	String name;
	String city;
	String Designation;
	Integer salary;
	Employee(String name,String city,String Designation,Integer salary)
	{
		this.name=name;
		this.city=city;
		this.Designation=Designation;
		this.salary=salary;
	}
	
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		if(name.equals(e.name)&&city.equals(e.city)&&Designation.equals(e.Designation)&&salary.equals(e.salary))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", Designation=" + Designation + ", salary=" + salary
				+ "]";
	}

}

public class employeeex {

	public static void main(String[] args) {
		Employee e1=new Employee("surya","guntur","pat",28166);
		Employee e2=new Employee("sunil","guntur","manager",29166);
		Employee e3=new Employee("malli","hyderabad","manager",30166);
		Employee e4=new Employee("surya","guntur","pat",28166);
		Employee e5=new Employee("surya","guntur","pat",28166);
		Employee e6=new Employee("surya","guntur","pat",28166);
		Employee e7=new Employee("surya","guntur","pat",28166);
		Employee e8=new Employee("surya","guntur","pat",28166);
	Predicate<Employee> p1=emp->emp.Designation.equals("manager");
	Predicate<Employee> p2=emp->emp.city.equals("banglore");
	Predicate<Employee> p3=emp->emp.salary<2000;
	
	}

}
