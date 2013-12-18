<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div style="border:1px dashed #183152;margin:3px 0;padding:5px;">
		<a href="jsp/combobox/combobox.jsp" class="easyui-linkbutton" target="navTab">另一个样式</a>
	</div>
	<input type="text" id="combox" name="combox" class="easyui-combobox"
		data-options="
			valueField: 'label',
			textField: 'value',
			editable: true,
			mode: 'locale',
			filter: function(q, row) {
				var opts = $(this).combobox('options');
				console.log(q, row, opts);
				return row[opts.textField].toLowerCase().indexOf(q.toLowerCase()) == 0;
				return true;
			},
			data: [{
				label: 'java',
				value: 'Java'
			}, {
				label: 'CSharp',
				value: 'C#',
				selected: true
			}, {
				label: 'perl',
				value: 'Perl'
			}, {
				label: 'python',
				value: 'Python'
			}]
		"/>
	<div class="divider"></div>
	<select class="easyui-combobox" name="dept" data-options="width:200">
		<option value="javascript">Javascript</option>
		<option value="java">Java</option>
		<option value="C">C</option>
		<option value="C++">C++</option>
	</select>
	<div class="divider"></div>
	<h2>联动效果</h2>
	<select class="easyui-combobox" name="province" data-options="
		valueField	: 'id',
		textField	: 'text',
		width		: 200,
		url			: 'jsp/combobox/province.json',
		onSelect	: function(rec) {
			var url = 'jsp/combobox/city_' + rec.id + '.json';
			$('#w_combobox_city').combobox('reload', url);
		}
		">
	</select>
	<select class="easyui-combobox" name="city" id="w_combobox_city" data-options="
		valueField	: 'id',
		textField	: 'text',
		width		: 200,
		onSelect	: function(rec) {
			var url = 'jsp/combobox/area_' + rec.id + '.json';
			$('#w_combobox_area').combobox('reload', url);
		},
		onLoadSuccess: function() {
			try {
				var url = 'jsp/combobox/area_' + $('#w_combobox_city').combobox('getValue') + '.json';
				// 延迟加载
				setTimeout(function() {$('#w_combobox_area').combobox('reload', url);}, 500);
			} catch (e) {
				console.log(e);
			}
		}
		">
		<option value="all">所有城市</option>
	</select>
	<select class="easyui-combobox" name="area" id="w_combobox_area"
		data-options="width:200,valueField:'id',textField:'text'">
	</select>
</div>
<script type="text/javascript">

</script>
