package predicateexample;

import java.util.function.Predicate;

class User{
	String user;
	 String password;
public User(String uid,String pwd) {
super();
this.uid=uid;
this.pwd=pwd;
}
}

public class userdefinedpredicateex {

	public static void main(String[] args) {
		User u1=new User("admin","1234");
		User u2=new User("surya","ramesh")
	Predicate<User> tuser=u->u.uid.equals("admin")&&u.pwd.equals("1234");
	if(tuser.test(u2))
		System.out.println(" valid user....");
	else
		System.out.println("invalid user....");
	}

}
