<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>演示</title>
	<link id="themes" rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/themes/icon.css">
	<style type="text/css">
	#leftside a, a:visited {
		text-decoration: none;
	}
	.pageContent {
		padding: 10px;
	}
	.divider {
		margin: 6px 0;
		border-top: 1px dashed #183155;
		text-indent: -10000px;
	}
	.validatebox dl, dt, dd {
		margin: 0;
		padding: 0;
	}
	.validatebox dt, dd {
		padding: 2px;
		list-style: none;
		display: inline-block;
	}
	.validatebox dt {
		font: 13px;
		color: #183152;
		width: 240px;
	}
	.validatebox dd {
		width: 480px;
	}
	</style>

	<script type="text/javascript" src="<%=basePath %>resources/jquery-1.8.0.min.js"></script>
	<!-- script type="text/javascript" src="<%=basePath %>resources/easyloader.js"></script -->
	<script type="text/javascript" src="<%=basePath %>resources/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/common.js"></script>
	<script type="text/javascript">
	function openDialog() {
		var dlg = $('<div id="dlg" />').appendTo(document);
		dlg.dialog({
			title: '等待提示',
			width: 200,
			height: 72,
			cache: false,
			content: '<img src="./resources/themes/default/images/loading.gif" alt="正在加载，请稍后。。。" /> 正在加载，请稍后。。。',
			modal: true,
			resizable: true
		});
	}
	
	function themes(themename) {
		$('#themes').attr('href', './resources/themes/' + themename + '/easyui.css');
		// easyloader.theme = themename;
	}
	
	// easyloader.base = "resources/";
	
	</script>
</head>
<body>
	<div id="layout" class="easyui-layout" data-options="fit:true">
		<div id="header" data-options="region:'north'" style="height:60px;">
			<div style="float:right;">
				<a href="javascript:themes('default');" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"></a>
				<a href="javascript:themes('black');" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"></a>
				<a href="javascript:themes('gray');" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"></a>
				<a href="javascript:themes('metro');" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"></a>
				<a href="javascript:themes('bootstrap');" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'"></a>
			</div>
		</div>
		
		<div id="leftside" data-options="region:'west',split:true" title="菜单导航" style="width:250px;">
			<div id="leftaccordionmnue" class="easyui-accordion" data-options="fit:true" style="height:510px;">
				<div title="界面组件" data-options="iconCls:'icon-ok'" style="overflow:auto;">
					<ul class="easyui-tree" data-options="animate:true,lines:true">
						<li data-options="state:'closed'">
							<span>主框架面板</span>
							<ul>
								<li><a href="http://www.baidu.com/" target="navTab" external="true"><span>我的主页</span></a></li>
								<li><a href="http://www.baidu.com/" target="navTab" external="true"><span>外部页面</span></a></li>
								<li><a href="jsp/page1.jsp" target="navTab"><span>页面替换</span></a></li>
								<li><a href="jsp/timeout.jsp" target="dialog" modal="true"><span>会话超时</span></a></li>
								<li><a href="jsp/demo.jsp" target="navTab"><span>演示页面</span></a></li>
								<li><a href="jsp/pagefragment.jsp" target="navTab"><span>加载页面片段</span></a></li>
							</ul>
						</li>
						<li data-options="state:'closed'">
							<span>常用组件</span>
							<ul>
								<li><a href="http://www.baidu.com/" target="navTab" external="true"><span>滑动（折叠）面板</span></a></li>
								<li><a href="#" target="navTab" rel="true" external="true"><span>选项卡面板</span></a></li>
								<li><a href="#" target="navTab" rel="true" external="true"><span>弹出窗口</span></a></li>
								<li><a href="#" target="navTab" rel="true" external="true"><span>提示窗口</span></a></li>
								<li><a href="#" target="navTab" rel="true"><span>表格</span></a></li>
								<li><a href="#" target="navTab" rel="true"><span>树形菜单</span></a></li>
								<li><a href="#" target="navTab" rel="true"><span>编辑器</span></a></li>
								<li><a href="./" target="navTab" rel="true"><span>日期控件</span></a></li>
								
								<!-- 罗列出所有可用控件 -->
								<li><a href="#" target="navTab"><span>Application</span></a></li>
								<li data-options="state:'closed'">
									<span>Base</span>
									<ul>
										<li><a href="jsp/parser/index.jsp" target="navTab"><span>Parser</span></a></li>
										<li><a href="jsp/easyuiloader/index.jsp" target="navTab"><span>Easyloader</span></a></li>
										<li><a href="jsp/draggable/index.jsp" target="navTab"><span>Draggable</span></a></li>
										<li><a href="jsp/droppable/index.jsp" target="navTab"><span>Droppable</span></a></li>
										<li><a href="jsp/resizable/index.jsp" target="navTab"><span>Resizable</span></a></li>
										<li><a href="./jsp/pagination/index.jsp" target="navTab"><span>Pagination</span></a></li>
										<li><a href="jsp/searchbox/index.jsp" target="navTab"><span>SearchBox</span></a></li>
										<li><a href="jsp/progressbar/index.jsp" target="navTab"><span>ProgressBar</span></a></li>
									</ul>
								</li>
								<li data-options="state:'closed'">
									<span>Layout</span>
									<ul>
										<li><a href="jsp/panel/index.jsp" target="navTab"><span>Panel</span></a></li>
										<li><a href="jsp/accordion/index.jsp" target="navTab"><span>Accordion</span></a></li>
										<li><a href="jsp/tabs/index.jsp" target="navTab"><span>Tabs</span></a></li>
										<li><a href="jsp/layout/index.jsp" target="navTab"><span>Layout</span></a></li>
									</ul>
								</li>
								<li data-options="state:'closed'">
									<span>Menu And Button</span>
									<ul>
										<li><a href="jsp/linkbutton/index.jsp" target="navTab"><span>LinkButton</span></a></li>
										<li><a href="jsp/menu/index.jsp" target="navTab"><span>Menu</span></a></li>
										<li><a href="jsp/menubutton/index.jsp" target="navTab"><span>MenuButton</span></a></li>
										<li><a href="jsp/splitbutton/index.jsp" target="navTab"><span>SplitButton</span></a></li>
									</ul>
								</li>
								<li data-options="state:'closed'">
									<span>Form</span>
									<ul>
										<li><a href="jsp/form/index.jsp" target="navTab"><span>Form</span></a></li>
										<li><a href="jsp/validatebox/index.jsp" target="navTab"><span>ValidateBox</span></a></li>
										<li><a href="jsp/combo/index.jsp" target="navTab"><span>Combo</span></a></li>
										<li><a href="./jsp/combobox/index.jsp" target="navTab"><span>ComboBox</span></a></li>
										<li><a href="jsp/combogrid/index.jsp" target="navTab"><span>ComboGrid</span></a></li>
										<li><a href="jsp/combotree/index.jsp" target="navTab"><span>ComboTree</span></a></li>
										<li><a href="jsp/numberbox/index.jsp" target="navTab"><span>NumberBox</span></a></li>
										<li><a href="jsp/numberspinner/index.jsp" target="navTab"><span>NumberSpinner</span></a></li>
										<li><a href="jsp/calendar/index.jsp" target="navTab"><span>Calendar</span></a></li>
										<li><a href="jsp/datebox/index.jsp" target="navTab"><span>DateBox</span></a></li>
										<li><a href="jsp/datatimebox/index.jsp" target="navTab"><span>DateTimeBox</span></a></li>
										<li><a href="jsp/timespinner/index.jsp" target="navTab"><span>TimeSpinner</span></a></li>
										<li><a href="jsp/slider/index.jsp" target="navTab"><span>Slider</span></a></li>
									</ul>
								</li>
								<li data-options="state:'closed'">
									<span>Window</span>
									<ul>
										<li><a href="jsp/window/index.jsp" target="navTab"><span>Window</span></a></li>
										<li><a href="jsp/dialog/index.jsp" target="navTab"><span>Dialog</span></a></li>
										<li><a href="jsp/messager/index.jsp" target="navTab"><span>Messager</span></a></li>
									</ul>
								</li>
								<li data-options="state:'closed'">
									<span>DataGrid And Tree</span>
									<ul>
										<li><a href="./jsp/datagrid/index.jsp" target="navTab"><span>DataGrid</span></a></li>
										<li><a href="./jsp/propertygrid/index.jsp" target="navTab"><span>PropertyGrid</span></a></li>
										<li><a href="jsp/tree/index.jsp" target="navTab"><span>Tree</span></a></li>
										<li><a href="jsp/treegrid/index.jsp" target="navTab"><span>TreeGrid</span></a></li>
									</ul>
								</li>
								<li data-options="state:'closed'">
									<span>Other</span>
									<ul>
										<li><a href="jsp/tooltip/index.jsp" target="navTab"><span>Tooltip(preview)</span></a></li>
									</ul>
								</li>
							</ul>
						</li>
						<li data-options="state:'closed'">
							<span>表单组件</span>
							<ul>
								<li><a href="#"><span>表单验证</span></a></li>
								<li><a href="#"><span>按钮</span></a></li>
								<li><a href="#"><span>文本框/文本域</span></a></li>
								<li><a href="#"><span>下拉菜单</span></a></li>
								<li><a href="#"><span>多选框/单选框</span></a></li>
								<li><a href="#"><span>iframeCallback表单提交</span></a></li>
								<li><a href="#"><span>uploadify多文件上传</span></a></li>
							</ul>
						</li>
						
						<li>
							<span>组合应用</span>
							<ul>
								<li><a href="jsp/datagrid/index.jsp" target="navTab"><span>可编辑表格</span></a></li>
							</ul>
						</li>
						
						<li><a href="resources/dwz.frag.xml" target="_blank"><span>dwz.frag.xml</span></a></li>
					</ul>
				</div>
				<div title="典型页面" data-options="iconCls:'icon-ok'" style="">
					<ul class="easyui-tree" data-options="animate:true">
						<li><a href="1.jsp" target="navTab" external="false"><span>测试1</span></a></li>
						<li><a href="2.jsp" target="navTab" external="false"><span>测试2</span></a></li>
						<li><a href="representativePage/callParentWindowFunction.jsp" target="navTab" external="true"><span>irame调用父窗口方法演示</span></a></li>
						<li><a href="representativePage/callIframeFunction.jsp" target="navTab" external="false"><span>先打开上一个tab,测试调用子窗口方法</span></a></li>
					</ul>
				</div>
				<div title="流程演示" data-options="iconCls:'icon-help'">
					
				</div>
			</div>
		</div>
		
		<div id="container" data-options="region:'center'">
			<div id="navTab" class="easyui-tabs" data-options="fit:true">
				<div title="我的主页">
					<div style="padding:10px;">
						<p style="font-size:14px">jQuery EasyUI framework帮助你建站。</p>
						<ul>
							<li>easyui是一个基于jQuery的插件集合。</li>
						</ul>
					</div>  
				</div>
				
			</div>
		</div>
		
		<div id="footer" data-options="region:'south'" style="height:50px;">
			<div style="text-align:center;">
				<span style="font-size:1.2em;">版权所有 &copy; 2013, ANSHEN, INTA.</span>
			</div>
		</div>
	</div>

</body>
</html>
