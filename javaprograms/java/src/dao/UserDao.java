package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Accounts;
import dto.User;

public class UserDao {
	

	 	private static String jdbcURL;
	    private static String jdbcUsername;
	    private static String jdbcPassword;
	    private static Connection jdbcConnection;
	     
	    public UserDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
	        this.jdbcURL = jdbcURL;
	        this.jdbcUsername = jdbcUsername;
	        this.jdbcPassword = jdbcPassword;
	    }
	     
	    public static void connect() throws SQLException {
	        if (jdbcConnection == null || jdbcConnection.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException e) {
	                throw new SQLException(e);
	            }
	            jdbcConnection = DriverManager.getConnection(
	                                        jdbcURL, jdbcUsername, jdbcPassword);
	        }
	    }
	     
	    public void disconnect() throws SQLException {
	        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
	            jdbcConnection.close();
	        }
	    }
	    public static void createCustomer(Accounts account,User user) throws SQLException {
	    	connect();
	    	String sql1 = "insert into users values(?,?)";
	    	String sql2 = "insert into Accounts values (?,?,?,?)";
	    	PreparedStatement pst1 = jdbcConnection.prepareStatement(sql1);
	    	PreparedStatement pst2 = jdbcConnection.prepareStatement(sql2);
	    	pst1.setString(1, user.getUname());
	    	pst1.setString(2, user.getPasswd());
	    	pst1.executeUpdate();
	    	pst2.setString(1, account.getAccountNumber());
	    	pst2.setString(2, account.getAccountType());
	    	pst2.setString(3, account.getCustomername());
	    	pst2.setFloat(4, account.getBalnace());
	    	pst2.executeUpdate();
	    	
	    	
	    }
	     
	    public int checkUser(User user) throws SQLException {
	          String sql = "SELECT * FROM users";
	          int flag=0;
	         connect();
	         Statement statement = jdbcConnection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql);
	         while(resultSet.next()){
	        	 String temp1 = resultSet.getString("uname");
	        	 String temp2 = resultSet.getString("passwd");
	        	 if(temp1.equals(user.getUname() ) &&
	        			 temp2.equals(user.getPasswd())){
	        		 flag=1;
	        		 break;
	        	 }
	        	 
	         }
	         
	         resultSet.close();
	         statement.close();
	              	 	
	    	return flag;
	    	
	    }
	}
