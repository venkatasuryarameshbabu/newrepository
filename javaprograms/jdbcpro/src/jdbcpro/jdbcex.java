package jdbcpro;
import java.sql.*;
public class jdbcex {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());;
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
Statement statement=connection.createStatement();
		String query="select * from account_master";
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		rs.close();
		statement.close();
		connection.close();
		
		
	}

}
