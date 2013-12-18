<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent" style="padding:10px;height:100%;position:relative;">
	<div id="panel" class="easyui-panel" style="position:relative;"
		data-options="
			title:'面板',
			width:500,
			height:200,
			iconCls:'icon-edit',
			closable:true,
			minimizable:true,
			maximizable:true,
			collapsible:true,
			doSize: true,
			tools:'#panelTools',
			onMove: function(l, t) {
				console.log( $('#panel').panel('panel') );
			},
			style:{
				'background-color': 'red'
			}
		">
		<div>内容</div>
	</div>
	<div id="panelTools">
		<a href="#" class="icon-add" onclick="javascript:move();"></a>
		<a href="#" class="icon-edit" onclick="move();"></a>
	</div>
</div>

<script type="text/javascript">
function move() {
	$('#panel').panel('move', {
		left: 100,
		top: 500
	});
}
</script>
