package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employeedao {
private JdbcTemplate jdbctemplate;

public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}
/*public int saveEmployee(Employee e)
{
	String query="insert into employee values('"+e.getId()+"','"+e.getDeg()+"','"+e.getDep()+"','"+e.getEmail()+"','"+e.getName()+"')";
	return jdbctemplate.update(query);
}*/
public int saveEmployee(Employee e)
{
	String q="select * from employee";
	//String q="update employee set deg='"+e.getDeg()+"',dep='"+e.getDep()+"'email='"+e.getEmail()+"',name='"+e.getName()+"' where id='"+e.getId()+"'";
	return jdbctemplate.update(q);
	
}
}
