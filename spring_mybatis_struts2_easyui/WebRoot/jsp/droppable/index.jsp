<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div class="easyui-droppable" style="width:100px;height:100px;background-color:red;"
		data-options="
			accept:'#d1,#d3',
			onDragEnter: function(e, source) {
				console.log('dragenter');
			},
			onDragOver: function(e, src) {
				console.log('dragover');
			},
			onDragLeave: function(e, src) {
				console.log('dragleave');
			},
			onDrop: function(e, src) {
				console.log('drop');
			}
		">
	</div>
	<div id="d1" class="easyui-draggable" style="width:300px;height:100px;"
		data-options="
			handle: '#proxyHandle'
		">
		<div id="proxyHandle" style="height:30px;background-color:#138313;"></div>
	</div>
</div>
