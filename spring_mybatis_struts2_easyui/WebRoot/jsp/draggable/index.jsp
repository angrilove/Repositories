<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div id="proxyDraggable" class="easyui-draggable" style="width:200px;height:150px;background:#FAFAFA;border:1px solid #CCC;"></div>
	<div class="easyui-draggable" style="width:200px;height:200px;background-color:red;"
		data-options="
			handle:'#title',
			proxy:'clone',
			revert:true,
			cursor:'crosshair',
			deltaX:-20,
			deltaY:-20,
			disabled:false,
			edge:-30,
			axis:'h',
			onBeforeDrag: function(e) {
				console.log(e);
			},
			onStartDrag: function(e) {
				console.log(e);
			},
			onDrag: function(e) {
				console.log(e);
			},
			onStopDrag: function(e) {
				console.log(e);
			}
		">
		<div id="title" style="background-color:#CCC;">Drag me</div>
	</div>
</div>
<script type="text/javascript">
$('#proxyDraggable').draggable({
	proxy: function(source) {
		var pxy = $('<div style="border:1px solid #FF2;width:200px;height:150px;"></div>');
		pxy.html($(source).html()).appendTo('body');
		console.log($('#proxyDraggable').draggable('proxy'));
		console.log(source, pxy);
		return pxy;
	}
});

console.log($('#proxyDraggable').draggable('options'));
console.log($('#proxyDraggable').draggable('proxy'));
console.log($('#proxyDraggable').draggable('enable'));
// console.log($('#proxyDraggable').draggable('disable'));
</script>
