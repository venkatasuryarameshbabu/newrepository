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
     String name=request.getParameter("uname");
     int age=Integer.parseInt(request.getParameter("age"));
     
     if(age>62)
     {
    out.println("my name is"+name+" "+"and age is"+age+" "+"price of movie ticket is $7.00");
     }
     else if(age<10)
     {
    out.println("my name is"+name+" "+"and age is"+age+" "+"price of movie ticket is $5.00");
     }
     else
     {
    out.println("my name is"+name+" "+" and age is"+age+" "+"price of movie ticket is $9.50");
     }
     
   %>
</body>
</html>