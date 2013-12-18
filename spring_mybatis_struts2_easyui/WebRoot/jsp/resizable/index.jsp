<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div class="easyui-resizable" style="width:100px;height:100px;border:1px solid red;background-color:#CCC;"
		data-options="
			maxWidth:800,
			maxHeight:600,
			edge:2,
			onStartResize: function(e) {
				console.log('start resize');
			},
			onResize: function(e) {
				console.log('resize');
			},
			onStopResize: function(e) {
				console.log('stop resize');
			}
		">
	</div>
</div>
