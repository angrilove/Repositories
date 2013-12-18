<%@ page pageEncoding="UTF-8"%>
<style>
.unit {
	border: 1px solid #188166;
	display: inline-block;
	width: 300px;
	height: 300px;
	overflow:auto;
}
</style>
<div class="pageContent">
	<div class="unit">
		<ul id="tt" class="easyui-tree">
			<li>
				<span>Folder</span>
				<ul>
					<li>
						<span>Sub Folder 1</span>
						<ul>
							<li><span><a href="#">File 11</a></span></li>
							<li><span>File 12</span></li>
							<li><span>File 13</span></li>
						</ul>
					</li>
					<li><span>File 2</span></li>
					<li><span>File 3</span></li>
				</ul>
			</li>
			<li><span>File21</span></li>  
		</ul>
	</div>
	<div class="unit">
		<ul class="easyui-tree" id="remote_tree" data-options="url:'jsp/tree/tree_data.json'"></ul>
	</div>
</div>
<script type="text/javascript">
setTimeout(function() {
	// $('#remote_tree').tree({url: 'jsp/tree/sub_books.json'});
}, 5000);
</script>
