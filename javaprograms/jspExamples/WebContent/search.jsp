<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<% 
try
{
String x=request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
//out.println("connection established");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
String q="select * from loan_details where customer_number=?";
PreparedStatement pst=con.prepareStatement(q);
pst.setString(1,x);
ResultSet stq=pst.executeQuery();
if(stq.next())
//out.println(stq.getString(1)+" "+stq.getString(2)+" "+stq.getString(3));
{
%>
<form action="update.jsp"/>
<b>CustomerNumber:</b><input type="textarea" name="cnumber" readonly value="<%=stq.getString(1)%>" /></br>
<b>Branchid:</b><input type="textarea" name="bnumber" value="<%=stq.getString(2)%>"/></br>
<b>Loanamount:</b><input type="textarea" name="amount" value="<%=stq.getString(3)%>"/></br>
<input type="submit" value="update new values"/>
<%
}
else
{
	out.println("no valid user");
}
}
catch(Exception e)
{
	
}
%>


</body>
</html>