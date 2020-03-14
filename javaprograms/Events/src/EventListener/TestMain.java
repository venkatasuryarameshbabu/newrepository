package EventListener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args)
{
	ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
	//CstartEventHandler obj=(CstartEventHandler)con.getBean("helloworld");
           con.start();
           con.stop();
}
}
