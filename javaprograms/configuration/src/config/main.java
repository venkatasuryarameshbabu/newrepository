package config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext.xml");
              FootBallcoach fbc=con.getBean(FootBallcoach.class);
              fbc.method();
	}
}
