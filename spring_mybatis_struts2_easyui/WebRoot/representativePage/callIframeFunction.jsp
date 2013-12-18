<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="easyui-panel" data-options="fit:true" style="padding:10px;">
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="" onclick="callIframe();">调用子iframe方法</a>
</div>
<script type="text/javascript">
function callIframe() {
	var iframe = $('iframe')[0];
	iframe.contentWindow.openDialog();
}
</script>
