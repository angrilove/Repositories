<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div id="accordion" class="easyui-accordion"
	data-options="
		width:200,
		height:300,
		fit:false,
		animate:false,
		border:false,
		onSelect: function(title) {
			alert( title );
		},
		onAdd: function(title) {
			alert('添加：' + title);
		},
		onBeforeRemove: function(title) {
			alert( 'onBeforeRemove' );
		},
		onRemove: function(title) {
			alert('onRemove');
		}
		">
	<div data-options="
		title:'New Title',
		tools:'#sub-accordion-tools'
		">
		<p>New Content</p>
	</div>
	
	<div id="sub-accordion-tools">
		<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'" onclick="addTab();"></a>
		<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-remove'" onclick="removeTab();"></a>
		<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'" onclick="addTab();"></a>
	</div>
	<script type="text/javascript">
	var index = 0;
	function addTab() {
		$('#accordion').accordion('add', {
			
		});
	}
	</script>
</div>
