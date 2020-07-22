<%@ page language="java" contentType="text/html; charset=utf-8"
   pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<script>
function send(){
var phone= document.getElementById("phone");
var number= phone.value;
window.location.href="<%=path%>/sendme.action?phone="+number;
}
</script>
<form action="${pageContext.request.contextPath}/sendme.action" method="post">
手机号:<input type="text" name="phone" id ="phone" ><br>
${flag }${flag1 }
验证码:<input type="text" name="code"><br>
<input type="submit" value="发送验证码">

</form>
<form action="${pageContext.request.contextPath}/comparecode.action" method="post">
手机号:<input type="text" name="phone" id ="phone" ><br>

验证码:<input type="text" name="code"><br>
<input type="submit" value="注册">
${result}
</form>
</body>
</html>
