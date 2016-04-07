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
  <Strong>这是admin管理员对商品的增删改</Strong>
  <Strong>对商品的增删改必定伴随着货物的增删改</Strong>
  <Strong>请管理员务必谨慎操作(别忘了增加或者删除商品条形码)</Strong>
  
     <hr>
      <Strong>添加商品</Strong>
      <a href="http://localhost:8080/shopjavaee/product/addproduct.jsp">添加商品</a>
       <br><br><br>
        
        
      
   <hr>
    <Strong>删除商品</Strong>
   <form action="${pageContext.request.contextPath}/product/deleteproduct.action" method="post">
   <input type="text" name="id"/>
   <input type="submit" value="删除"/>
   </form>
   <br><br><br>
   
   
      
   <hr>
    <Strong>更新商品价格</Strong>
   <form action="${pageContext.request.contextPath}/product/updatesale.action" method="post">
		<table border="2" align="center">
			<tr>
				<th>商品id</th>
				<td><input type="text" name="productId"></td>
			</tr>			
		
			<tr>
				<th>productSalePrice   Int</th>
				<td><input type="text" name="pdSalePrice"></td>
			</tr>
			<tr>
				<th>productPurchasePrice   Int</th>
				<td><input type="text" name="pdPurchasePrice"></td>
		
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="更新"/>
				</td>
			</tr>
			
		</table>
		<h4 align="center">##更新商品相应的商品</h4>
		<h4 align="center">##更新就把最新的商品价格信息输入进来</h4>
	</form>		

   <br><br><br>
         
   <hr>
    <Strong>更新商品数量</Strong>
   <form action="${pageContext.request.contextPath}/product/updatenumber.action" method="post">
		<table border="2" align="center">
			<tr>
				<th>商品id</th>
				<td><input type="text" name="productId"></td>
			</tr>			
		
			<tr>
				<th>productnumber   Int</th>
				<td><input type="text" name="productNumber"></td>
			</tr>
		     <tr>
				<td colspan="2" align="center">
					<input type="submit" value="更新"/>
				</td>
			</tr>
			
		</table>
		<h4 align="center">##更新商品相应的商品</h4>
		<h4 align="center">##更新就把最新的商品number信息输入进来</h4>
	</form>	
	<h2>		
		<a href="http://localhost:8080/shopjavaee/product/adminoperate.jsp	">回到操作商品界面</a>
	</h2>
	
   <h2>		
		<a href="http://localhost:8080/shopjavaee/login/master/alloperation.html">回到管理员界面</a>
	</h2>
  </body>
</html>
