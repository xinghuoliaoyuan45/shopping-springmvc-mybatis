<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>员工注册</title>
  </head>
  <body background="../resources/background.jpeg">
	<form action="${pageContext.request.contextPath}/product/addproduct.action" method="POST">
	
		<table border="2" align="center">
			<tr>
				<th>商品id</th>
				<td><input type="text" name="productId"></td>
			</tr>
			<tr>
				<th>productName</th>
				<td><input type="text" name="productName"></td>
			</tr>
			<tr>
				<th>productCode 首字母</th>
				<td><input type="text" name="productCode"></td>
			</tr>
			<tr>
				<th>productClass</th>
				<td><input type="text" name="productClass"></td>
			</tr>
			<tr>
				<th>productSalePrice   Int</th>
				<td><input type="text" name="pdSalePrice"></td>
			</tr>
			<tr>
				<th>productPurchasePrice   Int</th>
				<td><input type="text" name="pdPurchasePrice"></td>
			</tr>
				<tr>
				<th>productNumber   Int</th>
				<td><input type="text" name="productNumber"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="添加"/>
				</td>
			</tr>
			
		</table>
		<h4 align="center">##添加相应的商品</h4>
	</form>	
	<h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>	
  </body>
</html>
