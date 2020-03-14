<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*,java.sql.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <c:set var="string" value="jstl programming"/>
<c:if test="${fn:contains(string,'programming')}">
    <p>Found</p>
 </c:if> -->
 <sql:setDataSource  var="db" driver="com.mysql.jdbc.Driver"
 url="jdbc:mysql://localhost/cts" user="root" password="root"/>   
 <sql:query dataSource="${db}" var="rs">
 SELECT * FROM students;
 </sql:query>
 <table border="2" width="100%">
 
     <tr>
           <th>hallticketno</th>
           <th>name</th>
           <th>cllg</th>
     </tr>
 <c:forEach var="table" items="${rs.rows}">
 <tr>
 <td><c:out value="${table.hallticketno}"></c:out></td>
 <td><c:out value="${table.name}"></c:out></td>
 <td><c:out value="${table.cllg}"></c:out></td>
 </tr>
 </c:forEach>
 </table>
 <sql:update dataSource="${db}" var="count">
 insert into students values("123","shivam","ideal");
 </sql:update>
</body>
</html>