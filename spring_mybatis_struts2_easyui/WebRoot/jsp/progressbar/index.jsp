<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div style="margin:10px 0;">
		<a href="#" class="easyui-linkbutton" onclick="start()">Start</a>
	</div>
	<div id="p" class="easyui-progressbar" style="width:400px;" data-options="text:'提示信息'"></div>
	<script>
		function start() {
			var value = $('#p').progressbar('getValue');
			if (value < 100){
				value += Math.floor(Math.random() * 10);
				$('#p').progressbar('setValue', value);
				setTimeout(arguments.callee, 200);
			}
		};
		$('#p').progressbar({
			onChange: function(newValue, oldValue) {
				console.log(newValue, oldValue);
			}
		});
	</script>
</div>
