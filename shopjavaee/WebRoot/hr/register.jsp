<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>员工注册</title>
  </head>
  <body background="../resources/background.jpeg">
	<form action="${pageContext.request.contextPath}/emp/register.action" method="POST">
		<table border="2" align="center">
			<tr>
				<th>编号</th>
				<td><input type="text" name="empId"></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="empName"></td>
			</tr>
			<tr>
				<th>薪水</th>
				<td><input type="text" name="empPrice"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册"/>
				</td>
			</tr>
			
		</table>
	</form>	
	<h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
	<h2>		
		<a href="http://localhost:8080/shopjavaee/hr/operate.jsp">回到人事管理</a>
	</h2>	
  </body>
</html>
