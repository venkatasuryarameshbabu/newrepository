
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            <%
            try
            { 
            String name=request.getParameter("name");
			String department=request.getParameter("dept");
			String designation=request.getParameter("desg");
			String company=(String)request.getAttribute("company");
			String mobilenumber=(String)request.getAttribute("mobilenumber");
			String email=(String)request.getAttribute("email");
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body>");
			pw.println("<h3>I am from servlet1</h3>");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			PreparedStatement pst=con.prepareStatement("insert into empdetails values(?,?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, department);
			pst.setString(3, designation);
			pst.setString(4, company);
			pst.setString(5, mobilenumber);
			pst.setString(6, email);
			int i=pst.executeUpdate();
			if(i==1) {
			response.sendRedirect("http://localhost:8081/jspexamples/sucess.html");
			}
			else {
				pw.println("unsucessful");
			
			}
            }
            catch(Exception e)
            {
            	
            }
			%>
</body>
</html>