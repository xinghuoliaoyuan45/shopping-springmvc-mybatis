<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

  <body background="../resources/background.jpeg">
  <center>
    <c:forEach  var="productsall"  items="${productall}">
   商品id:     ${productsall.productId} 
   商品Name:   ${productsall.productName}
    商品条形码首字母:  ${productsall.productCode}
   商品现在数量:     ${productsall.productNumber}
  商品进价:        ${productsall.pdPurchasePrice}
  商品卖出价:        ${productsall.pdSalePrice} <br>
    </c:forEach>
    <h2>
		<a href="http://localhost:8080/shopjavaee/product/adminoperate.jsp	">回到操作商品界面</a>
	</h2>
    <h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
	</center>
  </body>
</html>
