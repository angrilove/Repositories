<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div style="margin:10px 0;">
		<a href="#" class="easyui-linkbutton" onclick="addRegion();">Add West Region</a>
	</div>
	<div id="layout1" class="easyui-layout" style="width:600px;height:400px;" data-options="fit:false">
		<div data-options="region:'north',title:'North Title',split:true" style="height:100px;"
			data-options="
				tools: [{
					iconCls: 'icon-add',
					handler: function() {
						alert('add');
					}
				},'-',{
					iconCls: 'icon-remove',
					handler: function() {
						alert('remove');
					}
				}]
			"></div>
		<div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
		<div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;"></div>
		<div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"></div>
	</div>
	<script type="text/javascript">
		var index = 0;
		function addRegion() {
			console.log($('#layout'));
			$('#layout1').layout('add', {
				region: 'west',
				width: 180,
				split: true,
				title: 'New West Region' + (++index),
				tools: [{
					iconCls: 'icon-add',
					handler: function() {
						alert('add');
					}
				},{
					iconCls: 'icon-remove',
					handler: function() {
						alert('remove');
					}
				}]
			})
		}
	</script>
</div>
