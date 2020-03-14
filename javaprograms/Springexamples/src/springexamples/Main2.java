package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("setbean.xml");
		 Questionbank2 qs=(Questionbank2)context.getBean("ok");
		       qs.showanswers();
	}

}
