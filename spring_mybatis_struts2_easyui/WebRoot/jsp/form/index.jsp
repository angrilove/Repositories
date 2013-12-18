<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<style>
.unit {
	padding: 2px;
	margin: 5px;
}
.unit label {
	width: 120px;
	display: inline-block;
}
</style>
<div class="pageContent">
	<form id="myform" method="post">
		<div class="unit">
			<label for="name">Name:</label>
			<input class="easyui-validatebox" type="text" name="name" data-options="required:true" />
		</div>
		<div  class="unit">
			<label for="email">Email:</label>
			<input class="easyui-validatebox" type="text" name="email" data-options="validType:'email'" />
		</div>
		<div style="margin:10px 5px;">
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="submit();">提交表单</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="$('#myform').submit();">Submit方式提交</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'" onclick="$('#myform').form('reset');">重置</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="addData()">填充数据</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-refresh'" onclick="$('#myform').form('clear');">清除数据</a>
			
		</div>
	</form>
</div>
<script type="text/javascript">
$('#myform').form({
	url: 'jsp/form/form.json',
	onSubmit: function(param) {
		console.log('马上要提交请求了', param);
	},
	success: function( data ) {
		console.log('返回数据啦', data);
	},
	onBeforeLoad: function( param ) {
		console.log('onBeforeLoad', param);
		return true; // false cancel submit form
	},
	onLoadSuccess: function( data ) {
		console.log('初始化form表单', data);
	},
	onLoadError: function(/* none */) {
		console.log('初始化form表单失败');
	}
});
function submit() {
	$('#myform').form('submit', {
		url: 'jsp/form/form.json',
		onSubmit: function(param) {
			console.log(param);
			var isValid = $(this).form('validate');
			if (!isValid) {
				$.messager.progress('close'); // 验证表单失败，取消进度条
			}
			return isValid; // 返回false阻止表单提交
		},
		success: function(data) {
			// data = eval('(' + data + ')'); /// html data.
			console.log(data);
		}
	});
}
function addData() {
	$('#myform').form('load', 'jsp/form/data.json');
	/*$('#myform').form('load', {
		name: 'Anshen',
		email: 'Anshen.master@an.com'
	}); */
}

</script>
