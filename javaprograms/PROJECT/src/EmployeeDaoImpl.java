 



 

import java.sql.JDBCType;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.List;

 

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

 

 

public class EmployeeDaoImpl

{

     private JdbcTemplate jdbcTemplate;

     

     public void setJdbcTemplate(JDBCType jdbcTemplate)

     {

         this.jdbcTemplate = jdbcTemplate;

     }

   

     public List<Employee> getEmployee() {

          String sql="select * from emp";

          List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>(){

 

              public Employee mapRow(ResultSet rs, int rowNum) throws SQLException

              {

        

                   Employee e=new Employee();

                   e.setEmpid(rs.getString("empid"));

                   e.setEname(rs.getString("ename"));

                   e.setDept(rs.getString("dept"));

                   e.setDesg(rs.getString("desg"));

                   e.setEmail(rs.getString("email"));

                   return e;

                 

              }

          });

          return list;

     }

     }

 