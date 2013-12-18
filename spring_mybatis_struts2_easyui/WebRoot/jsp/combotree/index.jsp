<%@ page pageEncoding="UTF-8"%>
<div class="pageContent">
	<input id="combotree" class="easyui-combotree" data-options="url:'jsp/combotree/tree_data1.json',required:true" style="width:200px;">
</div>
<script>
setTimeout(function() {
	console.log( $('#combotree').combotree('tree') );
}, 500);
</script>
