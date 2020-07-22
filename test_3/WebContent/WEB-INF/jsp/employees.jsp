<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" >
		<tr>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>住址</th>
			
		</tr>
		<c:forEach items="${employees }" var="employee" varStatus="status" >
			<tr>
				<td>${employee.name }</td>
				<td>${employee.age }</td>
				<td>${employee.sex }</td>
				<td>${employee.address }</td>
				
				
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>