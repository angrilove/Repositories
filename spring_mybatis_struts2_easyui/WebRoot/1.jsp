<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class=".odd" id="idnn" style="width:300px;height:200px;" title="年后测试">
	<div style="padding:10px;">
		<a href="javascript:;" class="easyui-linkbutton" onclick="clickme();">点击测试</a>
	</div>
</div>
<script type="text/javascript">
	function clickme() {
		console.log( $('.odd') );
	}
</script>
