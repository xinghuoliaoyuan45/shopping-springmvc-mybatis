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
     <hr>
    <Strong>添加条形码</Strong>
   <form action="${pageContext.request.contextPath}/Scancode/add.action" method="post">
   productCode首字母<input type="text" name="productCode"/><br>
   scancode条形码<input type="text" name="scanCode"/><br>
   <input type="submit" value="添加"/>
   </form>
   <br><br><br>  <hr>
    <Strong>删除条形码</Strong>
   <form action="${pageContext.request.contextPath}/Scancode/delete.action" method="post">
   <input type="text" name="scancode"/>
   <input type="submit" value="删除"/>
   </form>
   <br><br><br>
    <h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
  </body>
</html>
