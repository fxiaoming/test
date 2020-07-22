<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/delete.action" method="post">
	<input id="name"  name="name" placeholder="用户名" value="" type="text" />
	
	<div><button id="" type="submit" onclick="doSubmit()">删&nbsp;&nbsp;&nbsp;除</button>
	</div>
	
</form>
</body>
</html>