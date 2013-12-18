<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<a href="#" id="sb" class="easyui-splitbutton"
		data-options="menu:'#sbMenu',iconCls:'icon-ok'" onclick="javascript:alert('ok')">Ok</a>  
	<div id="sbMenu" style="width:100px;" class="easyui-menu">
		<div data-options="iconCls:'icon-ok'">Okay</div>
		<div data-options="iconCls:'icon-cancel'">Cancel</div>
	</div>
</div>
