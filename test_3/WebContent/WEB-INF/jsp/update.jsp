<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update.action" method="post">
	<input id="name"  name="name" placeholder="用户名" value="" type="text" />
	<input id="age" name="age" placeholder="密码" value="" type="text" />
	<input id="sex" name="sex" placeholder="性别" value="" type="text" />
	<input id="address" name="address" placeholder="地址" value="" type="text" />
	<div><button id="" type="submit" onclick="doSubmit()">修&nbsp;&nbsp;&nbsp;改</button>
	</div>
	
</form>
</body>
</html>