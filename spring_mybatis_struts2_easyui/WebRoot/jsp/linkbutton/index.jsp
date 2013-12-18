<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent" style="padding:10px;">
	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="
			iconCls: 'icon-search'
		" onclick="clickme();">easyui</a>
	<a href="#" class="easyui-linkbutton"
		data-options="
			id			: 'add',
			disabled	: false,
			plain		: false,
			text		: 'Add',
			iconCls		: 'icon-add',
			iconAlign	: 'right'
		"></a>
	<script type="text/javascript">
		function clickme() {
			console.log($('#add').linkbutton('options').text);
		}
	</script>
</div>
