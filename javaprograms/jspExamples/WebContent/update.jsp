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
<%@ page import="java.lang.*" %>
<%
try
{
String cno=request.getParameter("cnumber");
String bno=request.getParameter("bnumber");
//String id=request.getParameter("id");
String amnt=request.getParameter("amount");
//out.println("hai");
//Integer amnt=Integer.parseInt(request.getParameter("amount"));

//out.println("amnt");
Class.forName("com.mysql.jdbc.Driver");
//out.println("connection established");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
String q="update loan_details set customer_number=?,branch_id=?,loan_amount=? where customer_number=?";
PreparedStatement ps=con.prepareStatement(q);
ps.setString(1,cno);
ps.setString(2,bno);
ps.setString(3,amnt);
ps.setString(4,cno);
int count=ps.executeUpdate();
if(count==1)
{
	out.println("update");
}
else
{
	out.println("not updated");
}
}
catch (NumberFormatException nfe) {
    nfe.printStackTrace();
}
catch(Exception e)
{
	System.out.println(e);
}

%>

</body>
</html>