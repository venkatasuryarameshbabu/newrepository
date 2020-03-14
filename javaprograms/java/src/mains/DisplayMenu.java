package mains;

import java.sql.SQLException;
import java.util.Scanner;

import dao.UserDao;
import dto.Accounts;
import dto.User;

public class DisplayMenu {
	public static int existingUser() throws SQLException {
		UserDao userdao = new UserDao("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Customer Application");
		System.out.println("Enter User name");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		User user = new User(uname,pwd);
		int status = userdao.checkUser(user);
		userdao.disconnect();
		return status;
		if(status==1)
			
			System.out.println("Valid User...");
		else
			System.out.println("Invalid user...");
		
		userdao.disconnect();
		
	}
	public static void newUser() throws SQLException {
		UserDao userdao = new UserDao("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have to register first...");
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		User user = new User(uname,pwd);
		System.out.println("Enter AccountNumber");
		String acctNumber = sc.next();
		System.out.println("Enter AccountType");
		String acctType = sc.next();
		System.out.println("Enter Customer Name");
		String custName = sc.next();
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		Accounts accounts = new Accounts(acctNumber,acctType,custName,balance);
		UserDao.createCustomer(accounts, user);
		
	}
	public void showMenuOptions() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("***************Bank Application ************");
		System.out.println("1.New User...");
		System.out.println("2.Existing User...");
		System.out.println("Enter your choice...");
		int choice= sc.nextInt();
		switch(choice) {
		case 1: newUser();break;
		case 2: existingUser();break;
		default: System.out.println("Wrong Choice...");
		}
		
	}

}
