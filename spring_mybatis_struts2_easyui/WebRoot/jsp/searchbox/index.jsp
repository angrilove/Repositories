<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<input class="easyui-searchbox" data-options="prompt:'Please Input Value',width:300,height:22,searcher:doSearch"></input>
	
	<input class="easyui-searchbox" data-options="prompt:'Please Input Value',menu:'#mm',searcher:doSearch2" style="width:300px"></input>
	<div id="mm" style="width:120px">
		<div data-options="name:'all',iconCls:'icon-ok'">All News</div>
		<div data-options="name:'sports'">Sports News</div>
	</div>
</div>
<script type="text/javascript">
	function doSearch(value){
		alert('You input: ' + value);
	}
	function doSearch2(value,name) {
		alert('You input: ' + value+'('+name+')');
	}
</script>
