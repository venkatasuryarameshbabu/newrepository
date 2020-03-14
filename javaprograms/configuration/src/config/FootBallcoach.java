package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootBallcoach {
private  Fortune f;
@Autowired
public FootBallcoach(Fortune f1) {
	f=f1;
}
public void method()
{
	System.out.println("hai i m from class footballcoach");
	System.out.println(f.getfortune());
}

}
