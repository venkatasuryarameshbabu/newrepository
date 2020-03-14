package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mvcproject.Employee;
public class Employeedao {
	public static Connection con=null;
	List<Employee> list=new ArrayList<Employee>();
public static Connection getConnection() throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surya1","root","root");

return con;
}
public void insertEmplopyee(Employee emp)
{
	
}
public List<Employee>showEmployees(){

try {
	Connection con=getConnection();
	Statement ps=con.createStatement();
		ResultSet rs=ps.executeQuery("select * from employee");
	while(rs.next())
	{
		Employee u=new Employee();
		u.setId(rs.getString(1));
		u.setEname(rs.getString(2));
		u.setDep(rs.getString(3));
		u.setDeg(rs.getString(4));
		u.setEmail(rs.getString(5));
		list.add(u);
	}
}catch(Exception e) {System.out.println(e);}
return list;
}
}
	
	
	
	
	
	
	