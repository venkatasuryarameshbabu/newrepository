package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testsample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("testbean.xml");
	Person hello=(Person)context.getBean("hai");
   hello.showdata();
   System.out.println(hello.getName());
   
	}

}
