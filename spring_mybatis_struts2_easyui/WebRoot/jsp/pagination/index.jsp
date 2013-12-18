<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div id="page1" class="easyui-pagination" style="background:#EFEFEF;border:1px solid #CCC;"
		data-options="
			fit:true,
			total:2000,
			pageSize:10
		">
	</div>
	<div class="divider" style="border-top: 1px dotted #CCC;width:auto;margin: 10px 0;"></div>
	<div id="page2" style="background:#EFEFEF;border:1px solid #CCC;"></div>
	
	<div id="content" class="easyui-panel" style="height:50px;" data-options="href:'http://www.baidu.com/?s=1'"></div>
	<div id="page3" class="easyui-pagination" style="background:#EFEFEF;border:1px solid #CCC;"
		data-options="
			total: 2000,
			pageSize: 20,
			onSelectPage: function(pageNumber, pageSize) {
				console.log(pageNumber, pageSize);
				$(this).pagination('loading');
				alert('onSelectPage');
				$(this).pagination('loaded');
				$('#content').panel('refresh', 'http://www.baidu.com/?s='+pageNumber);
			},
			pageList: [
				10, 20, 30, 40, 50, 100
			],
			loading: false,
			buttons: [{
				iconCls: 'icon-add',
				handler: function() {
					console.log('add');
				}
			},'-', {
				iconCls: 'icon-save',
				handler: function() {
					console.log('save');
				}
			}],
			displayMsg: '显示{from}到{to}条，共{total}条记录',
			onBeforeRefresh: function(pageNumber, pageSize) {
				console.log('onBeforeRefresh', pageNumber, pageSize);
			},
			onRefresh: function(pageNumber, pageSize) {
				console.log('onRefresh', pageNumber, pageSize);
			},
			onChangePageSize: function(pageSize) {
				console.log('onChangePageSize', pageSize);
			}
		">
	</div>
</div>

<script type="text/javascript">
$('#page2').pagination({
	total:20000,
	pageSize: 50
});
</script>
