<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page isELIgnored="false"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>
<body background="../resources/background.jpeg">>

	<c:forEach var="product" items="${productbyname}">
    商品id:     ${product.productId} 
   商品Name:   ${product.productName}
    商品条形码首字母:  ${product.productCode}
   商品现在数量:     ${product.productNumber}
  商品进价:        ${product.pdPurchasePrice}
  商品卖出价:        ${product.pdSalePrice} <br>
	</c:forEach>
	<h2>
		<a href="http://localhost:8080/shopjavaee/product/adminoperate.jsp	">回到操作商品界面</a>
	</h2>
	<h2>
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
</body>
</html>
