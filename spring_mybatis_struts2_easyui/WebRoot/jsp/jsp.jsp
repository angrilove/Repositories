<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html;charset=utf8">
	<title>PANEL</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/icon.css">
	
	<script type="text/javascript" src="<%=basePath %>resources/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/locale/easyui-lang-zh_CN.js"></script>	

</head>
<body>
	<div></div>
</body>
</html>
