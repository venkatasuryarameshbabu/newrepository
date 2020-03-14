import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Passwordverification pv=new Passwordverification();
		
		System.out.println("enter the password to check:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		pv.verify(s1);
	
		
	}

}
