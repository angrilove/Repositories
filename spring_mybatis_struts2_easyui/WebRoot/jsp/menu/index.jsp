<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div id="mm" class="easyui-menu" style="width:120px;"
		data-options="
			onClick: function(item) {
				console.log(item);
			}
		">
		<div data-options="text:'NewItem'">New1</div>
		<div>
			<span>Open</span>
			<div style="width:150px;">
				<div><b>Word</b></div>
				<div>Excel</div>
				<div>PowerPoint</div>
			</div>
		</div>
		<div data-options="iconCls:'icon-save',href:'http://www.baidu.com/'">Save</div>
		<div class="menu-sep"></div>
		<div>Exit</div>
	</div>
	<script type="text/javascript">
		$('#mm').menu({
			onClick: function(item) {
				console.log(item);
			}
		});
		$(document).bind('contextmenu', function(e) {
			e.preventDefault();
			$('#mm').menu('show', {
				left: e.pageX,
				top: e.pageY
			});
		});
	</script>
</div>
