package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("inheritedbean.xml");
		 Employee1 qs=(Employee1)context.getBean("derivedclassbean");
		       System.out.println(qs);
	}

}
