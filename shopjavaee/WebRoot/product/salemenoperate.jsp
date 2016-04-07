<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body background="../resources/background.jpeg">
	<h3>
		<strong>收银员只能查询商品</strong>
	</h3>

	<hr>
	<Strong>查询所有商品</Strong>
	<form
		action="${pageContext.request.contextPath}/product/listallproduct.action"
		method="post">
		<input type="submit" value="查询" />
	</form>
	<br>
	<br>
	<br>

	<hr>
	<Strong>查询商品byname</Strong>
	<form
		action="${pageContext.request.contextPath}/product/productbyname.action"
		method="post">
		<input type="text" name="name" /> <input type="submit" value="查询" />
	</form>
	<br>
	<br>
	<br>

	<hr>
	<Strong>查询商品byid</Strong>
	<form
		action="${pageContext.request.contextPath}/product/productbyid.action"
		method="post">
		<input type="text" name="id" /> <input type="submit" value="查询" />
	</form>
	<br>
	<br>
	<br>
	<h2>
		<a href="http://localhost:8080/shopjavaee/product/adminoperate.jsp	">回到操作商品界面</a>
	</h2>
	<h2>
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>





</body>
</html>
