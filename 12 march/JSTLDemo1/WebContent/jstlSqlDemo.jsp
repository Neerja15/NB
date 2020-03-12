<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
user="root"
password="ROOT"
url="jdbc:mysql://localhost:3306/ctspune"
driver="com.mysql.jdbc.Driver"
/>
<%-- <sql:update>
insert into student values(4,'Harshita',22,'Indore',452001)
</sql:update>
 --%>
<%-- <sql:update>
update student set age=21 where name='Yash'
</sql:update>
 --%>
 
 <sql:query var="rs" sql="select * from student">
 </sql:query>
 
<table style="border:1px solid black;">
 <c:forEach var="row" items="${rs.rows}">



<tr>
<td style="border:1px solid black;"> <c:out value="${row.id}"/></td>
 <td  style="border:1px solid black;"><c:out value="${row.name}"/></td>
<td  style="border:1px solid black;"> <c:out value="${row.age}"/></td>
<td  style="border:1px solid black;"> <c:out value="${row.address}"/></td>
<td  style="border:1px solid black;"> <c:out value="${row.pincode}"/></td>
</tr>


 </c:forEach>
</table>
</body>
</html>