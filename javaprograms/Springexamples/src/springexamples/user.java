package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class user {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("userdefinedbean.xml");
    context.getBean("sarsarle");
}
}
