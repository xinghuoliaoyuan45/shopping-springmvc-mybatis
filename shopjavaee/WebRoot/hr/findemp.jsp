<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>



</head>

<body background="../resources/background.jpeg">
	<c:forEach var="emp" items="${findbyname}">
		<tr>
			<td>${emp.empId}</td>
		    <td>${emp.empName}</td>
		    <td>${emp.empSex}</td>
		    <td>${emp.empOld}</td>
		    <td>${emp.empPrice}</td>
		</tr>
	</c:forEach>
	<h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
	<h2>		
		<a href="http://localhost:8080/shopjavaee/hr/operate.jsp">回到人事管理</a>
	</h2>
</body>
</html>
