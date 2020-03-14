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
String name=request.getParameter("submit");
String password=request.getParameter("submit");
String age=request.getParameter("age");
out.println("Welcome"+name);
session.setAttribute("sname",name);
session.setAttribute("spassword",password);
session.setAttribute("sage",age);
%>
<a href="output.jsp">Check output page here</a>
</body>
</html>