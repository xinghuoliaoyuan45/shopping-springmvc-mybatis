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
 <center>
   <%
    Date date =new Date();
    String dateStr=date.toLocaleString();
    out.write(dateStr);
     %>
     <br>
      <form action="${pageContext.request.contextPath}/trading/Scan.action" method="POST">
     <input type="text/html" style="height:100px; width:500px; font-size:60px" name="Scan"  /><br><br><br><br>       
     <input type="submit" style="height:60px; width:100px" value="条形码提交" name="submit">
     <br><br><br>     
     </form>
    <form action="${pageContext.request.contextPath}/trading/settleaccounts.action" method="POST">
    <input type="submit"style="height:60px; width:100px" value="结算" name="submit">  
    </form>
    </center>
  </body>
</html>
