package BeanPost;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
  public static void main(String[] args) {
     AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

     HelloWorld a = (HelloWorld) context.getBean("helloWorld");
     a.getMessage();
     context.registerShutdownHook();
  }
}
