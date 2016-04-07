<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'operate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body background="../resources/background.jpeg">
  
     <hr>
      <Strong>查询所有员工信息</Strong>
       <form action="${pageContext.request.contextPath}/emp/findall.action">
       <input type="submit" value="查询"/>
        </form>
        <br><br><br>
    
    <hr>
    <Strong>查询byname</Strong>
   <form action="${pageContext.request.contextPath}/emp/findbyname.action" method="post">
   <input type="text" name="name"/>
   <input type="submit" value="查询"/>
   </form>
   <br><br><br>
   
   
   <hr>
    <Strong>删除用户</Strong>
   <form action="${pageContext.request.contextPath}/emp/delete.action" method="post">
   <input type="text" name="id"/>
   <input type="submit" value="删除"/>
   </form>
   <br><br><br>
   
   <hr>
   <strong>注册(增加员工)</strong>
   <a href="http://localhost:8080/shopjavaee/hr/register.jsp">添加员工</a>
   <h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
   
  </body>
</html>
