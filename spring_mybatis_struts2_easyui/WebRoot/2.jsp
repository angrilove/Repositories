<%@ page pageEncoding="UTF-8"%>
<div class=".odd" style="width:300px;height:200px;" title="现在测是看卡">
	<div style="padding:10px;">
		<a href="javascript:;" class="easyui-linkbutton" onclick="clickme();">点击测试</a>
	</div>
</div>
<script type="text/javascript">
	function clickme() {
		console.log( $('.odd') );
	}
</script>