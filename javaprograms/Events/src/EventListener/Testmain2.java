package EventListener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CstartEventHandler obj=(CstartEventHandler)con.getBean("helloworld");
		con.start();
	      HelloWorld obj1=(HelloWorld)con.getBean("hello1");
	                obj1.mes();
	}

}
