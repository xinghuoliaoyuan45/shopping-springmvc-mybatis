<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
 <head>
  <title>test</title>
  <script>
  <!--
   function checkFills(){
    var s1 = document.getElementById("sub1").value;
    var s2 = document.getElementById("sub2").value;
    if(s1==null||s1.length==0) return;
    if(s2==null||s2.length==0) return;
    if(isNaN(s1)||isNaN(s2)){
     alert("输入的字符非数字！");
     return ;
    }
    document.getElementById("result").value = parseInt(s1)-parseInt(s2);
   }
  //-->
  </script>
 </head>
 <body background="../resources/background.jpeg">
 <center>
 <br><br><br><br><br>
 

   <h2>  实收</h2>
  <input type="text" name="sub1" id="sub1" onblur="checkFills()" maxsize="5"/><br>
    <h2> 购买的 商品总价格 </h2> 
  <input type="text" name="sub2" id="sub2" onblur="checkFills()" value=<%=request.getAttribute("money") %> maxsize="5"/><br>
   <h2>应找 </h2>   
  <input type=text" name="result" id="result" />
  
   <h2>		
		<a href="http://localhost:8080/shopjavaee/trading/scancode.jsp">继续售货</a>
	</h2>

 </center>
 </body>
</html>
