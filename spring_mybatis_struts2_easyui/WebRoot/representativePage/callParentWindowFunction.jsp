<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>iframe调用父类方法演示</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/demo.css">
	<script type="text/javascript" src="<%=basePath %>resources/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	function openDialog() {
		var dlg = $('<div id="dlg" />').appendTo(document);
		dlg.dialog({
			title: '等待提示',
			width: 200,
			height: 72,
			cache: false,
			content: '<img src="../resources/themes/default/images/loading.gif" alt="正在加载，请稍后。。。" /> 正在加载，请稍后。。。',
			modal: true,
			resizable: true
		});
	}
	</script>
</head>
<body>

	<div class="easyui-panel" data-options="fit:true" style="padding:10px;">
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="" onclick="parent.openDialog()">调用父类方法</a>
	</div>
	
</body>
</html>
