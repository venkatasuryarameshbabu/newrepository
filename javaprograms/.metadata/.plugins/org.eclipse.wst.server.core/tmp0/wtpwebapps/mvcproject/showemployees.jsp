<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,mvcproject.Employee"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee Information:
<table border="1" width="100%" >
<tr>
	<th> EmpId </th>
	<th> Name </th>
	<th> Designation </th>
	<th> Department </th>
	<th> EmailId </th>
</tr>
<%
List<Employee> list=(List<Employee>)request.getAttribute("list");
%>
<c:set var="list1" value="${list}" > </c:set>
<c:forEach items="${list1}" var="u" >
<tr>
	<td> ${u.getId()} </td> 
	<td> ${u.getEname()} </td> 
	<td> ${u.getDep()} </td> 
	<td> ${u.getDeg()} </td> 
	<td> ${u.getEmail()} </td> 
</tr>
</c:forEach>
</table>

</body>
</html>