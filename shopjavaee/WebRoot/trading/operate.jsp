<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body background="../resources/background.jpeg">
  <h2>
		<h>查询较大的交易金额</h>
		<a href="http://localhost:8080/shopjavaee/trading/bigmoney.jsp">查询流水交易记录</a>
	</h2>
	<h2>
		<h>所有的交易记录</h>
		<a href="http://localhost:8080/shopjavaee//trading/findall.action">查询流水交易记录</a>
	</h2>
    
  </body>
</html>
