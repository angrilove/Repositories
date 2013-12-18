<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>loading</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
  	
    <link href="<%=basePath%>resources/themes/default/easyui.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>resources/themes/icon.css" rel="stylesheet" type="text/css" />
    
    <script type="text/javascript" src="<%=basePath%>resources/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/jquery.easyui.min.js"></script>

  </head>
  
  <body>
    <div class="easyui-panel" data-options="fit:true">
  	  <div class="easyui-panel" style="position:absolute;left:200px;top:100px;z-index:100;" data-options="width:200,height:50"></div>
  	</div>
  	<div class="window-mask" style="width:100%;height:100%;"></div>
  </body>
</html>
