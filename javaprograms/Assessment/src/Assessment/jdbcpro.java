package Assessment;

import java.util.*;
import java.sql.*;

public class jdbcpro {

public static void main(String[] args) throws ClassNotFoundException,SQLException
{
// TODO Auto-generated method stub
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection
("jdbc:mysql://localhost:3306/surya","root","root");
String query="insert into employee values(?,?,?,?,?,?)";
PreparedStatement pst=connection.prepareStatement(query);
Scanner sc=new Scanner(System.in);

System.out.println("Enter name");
String name=sc.next();
System.out.println("Enter id");
int id=sc.nextInt();
System.out.println("Enter dep");
String dep=sc.next();
System.out.println("Enter deg");
String deg=sc.next();
System.out.println("Enter company");
String company=sc.next();
System.out.println("Enter emailid");
String emailid=sc.next();

pst.setString(1,name);
pst.setInt(2,id);
pst.setString(3,dep);
pst.setString(4,deg);
pst.setString(5,company);
pst.setString(6,emailid);

int i=pst.executeUpdate();
System.out.println((i+ "Record Inserted sucessfully                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ..."));
}

}