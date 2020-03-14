package jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainjdbc {
public static void main(String[] args)
{
	ApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext.xml");
   Employeedao dao=(Employeedao)con.getBean("edao");
   Employee emp=new Employee();
      //emp.setId("1001");
     
   /*System.out.println("enter the values:");
   Scanner sc=new Scanner(System.in);
   	  String Deg=sc.next();
   	String Dep=sc.next();
   	String Email=sc.next();
   	String Name=sc.next();
   	String Id=sc.next();
   	  
   	  
   	  
   	 
	emp.setDeg(Deg);
      emp.setDep(Dep);
      emp.setEmail(Email);
      emp.setName(Name);
      emp.setId(Id);*/
      int status=dao.saveEmployee(emp);
      System.out.println(status);
      System.out.println("records sucessfully displayed into your employee table check once");
}
}
