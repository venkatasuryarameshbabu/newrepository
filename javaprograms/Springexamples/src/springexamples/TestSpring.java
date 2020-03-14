package springexamples;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	ClassPathResource cps=new ClassPathResource("bean.xml");
		XmlBeanFactory factory=new XmlBeanFactory(cps);
		Employee h1=(Employee)factory.getBean("h");
	System.out.println(h1.getId());
	h1.message();

	}

}
