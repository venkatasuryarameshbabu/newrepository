package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import data.student;

public class studentDaoImpl implements Istudentdao {
          JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
          
          
          @Override
	public void create(student student) {
		// TODO Auto-generated method stub
	String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
		 int result=jdbcTemplate.update(query);
		 System.out.println(result+ "records inserted sucessfully.........");
	}

	@Override
	public student getstudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*public List<student> liststudents() {
		
		// TODO Auto-generated method stub
				
				return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<student>>()
						{
					public List<student> extractData(ResultSet rs) throws SQLException,DataAccessException{
						List<student>list=new ArrayList<student>();
						while(rs.next()) {
							student e=new student();
							e.setId(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setAge(rs.getInt(3));
							list.add(e);
							
						}
						return list;					}
						}
	}
});
				}*/

				


	@Override
	public void delete(Integer id)
	{
		int id1=id;	// TODO Auto-generated method stub
String del="delete from student where id="+id1;
int result=jdbcTemplate.update(del);
System.out.println(result+ "records deleted sucessfully.........");
	}

	@Override
	public void update(student student) {
		// TODO Auto-generated method stub
 String update="update table student set id='"+student.getId()+"' where name='"+student.getName()+"'";
 int result=jdbcTemplate.update(update);
 System.out.println(result+ "record updated sucessfully.........");
	}


public boolean saveStudentByPst(final student e)
{
	String query="insert into student value(?,?,?)";
	return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
		public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException{
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getAge());
			return ps.execute();
		}
	
});
}


@Override
public List<student> liststudents() {
	// TODO Auto-generated method stub
	return null;
}
}