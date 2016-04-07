<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


<body background="../resources/background.jpeg">
	<script type="text/javascript">
	function reloadCode(){
	var time=new Date().getTime();
	document.getElementById("imagecode").src="<%=path%>/login/Coding.action?data="+time;
	}
	</script>
	<center>
	<h1><p>超市系统管理系统</p></h1>
	<h3><p>Springmvc_Spring_mybatis_mysql</p></h3>
	<h4><p>丑陋的外表，强大的引擎</p></h4>

	<form action="<%=path%>/login/entry.action" method="post">
		 用户名： <input type="text" name="name"/> </br>
		 密码   <input type="text" name="password"/></br>
		 验证码：<input type="text" name="code" /> </br>
        <img alt="验证码" id="imagecode" src="<%=path%>/login/Coding.action" />
        <a href="javascript:reloadCode();">看不清楚</a><br/> 
		<input type="submit" value="登录"/>
	</form>
	</center>

	

</body>
</html>
