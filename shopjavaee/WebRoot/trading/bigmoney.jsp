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
        <Strong>查询你比输入金额大的交易记录</Strong>
   <form action="${pageContext.request.contextPath}/trading/findbigmoney.action" method="post">
   <input type="text" name="money"/>
   <input type="submit" value="查询"/>
   </form>
    <h2>		
		<a href="http://localhost:8080/shopjavaee/trading/operate.jsp">回到前面操作</a>
	</h2>
  </body>
</html>
