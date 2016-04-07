<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  
  <body background="../resources/background.jpeg">
  <c:forEach var="Tradingtable" items="${alltrading}">
		<tr>
			<td>${Tradingtable.businessRunWater}</td>
		    <td>${Tradingtable.dealDate}</td>
		    <td>${Tradingtable.money}</td>
		    <br>
		</tr>
	</c:forEach>
	
	 <h2>		
		<a href="http://localhost:8080/shopjavaee/trading/operate.jsp">回到前面操作</a>
	</h2>
   
  </body>
</html>
