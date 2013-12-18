<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Tomcat 6 Web 服务管理</title>
<style type="text/css">
*, html, body {
	font-family:"Microsoft YaHei", "Arial";
	font-size: 12px;
}
img { border:none;}
a { color:#000; text-decoration:none;}
a:hover { text-decoration:underline;}
</style>
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jQuery/jquery-1.7.2.js"></script>
</head>
<body>
	<a href="dwz-ria/index.html">转到DWZ-ria</a>
	<a href="pages/MyJsp.jsp">转到DWZ-ria</a>
</body>
</html>
