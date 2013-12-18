<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div style="padding:5px;border:1px solid #CCC;width:200px;">
		<a href="javascript:void(0)" id="mb" class="easyui-menubutton"
			data-options="
				menu		: '#menu',
				iconCls		: 'icon-edit',
				plain		: true,
				duration	: 1000
			">Edit</a>
		<a href="#" class="easyui-menubutton"
			data-options="
				menu		: '#helpMenu',
				iconCls		: 'icon-help',
				duration	: 100
			">About</a>
		<div id="helpMenu">
			<div data-options="iconCls: 'icon-ok'">项目主页</div>
			<div>获取帮助</div>
			<div>关于</div>
		</div>
	</div>
	<div id="menu" style="width:150px;">
		<div data-options="iconCls:'icon-undo'">Undo</div>
		<div data-options="iconCls:'icon-redo'">Redo</div>
		<div class="menu-sep"></div>
		<div>Cut</div>
		<div>Copy</div>
		<div>Paste</div>
		<div class="menu-sep"></div>
		<div data-options="iconCls:'icon-remove'">Delete</div>
		<div>Select All</div>
		<div>
			<span>Files</span>
			<div>
				<div>Create New</div>
				<div>Open</div>
				<div>Recent</div>
			</div>
		</div>
	</div>
</div>
