<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<a class="easyui-linkbutton">打开窗口</a>

<div class="easyui-window" title="dialog" data-options="resizable:true,width:600,height:400,modal:true">
	<div>
		content
	</div>
</div>
