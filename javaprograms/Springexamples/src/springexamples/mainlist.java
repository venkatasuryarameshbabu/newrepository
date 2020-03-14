package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("qbxml.xml");
	 Questionbank qs=(Questionbank)context.getBean("bean");
	       qs.showanswers();
	}

}
