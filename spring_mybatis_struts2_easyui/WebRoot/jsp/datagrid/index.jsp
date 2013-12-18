<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="dg" class="easyui-datagrid" title="编辑DataGrid" style="height:auto;"
		data-options="
			frozenColumns:[[{field:'checkbox',title:'选择',checkbox:true},{field:'customerid', title:'客户编号'}]],
			fitColumns:true,
			singleSelect:true,
			idField:'customerid',
			fit:true,
			rownumbers:true,
			checkOnSelect:true,
			selectOnCheck:true,
			pagination:true,
			pagePosition:'both',
			pageSize:50,
			sortName:'customerid',
			sortOrder:'asc',
			remoteSort:false
			">
	<thead>
		<tr>
			<th data-options="
				field:'customername',
				width:100
				">客户名称</th>
			<th data-options="
				field:'customertype',
				width:200,
				editor:{
					type: 'combobox',
					data: [{
							typeid: 'tid1',
							typename: '联邦营业部'
						}, {
							typeid: 'tid2',
							typename: '网络事业部'
						}, {
							typeid: 'tid3',
							typename: '营销策划部'
						}, {
							typeid: 'tid4',
							typename: '基础制造部'
						}
					]
				}
				">客户类型</th>
			<th data-options="
				field:'idno',
				width:200,
				sortable:true,
				sorter: function(field1, field2) {
					// console.log( field1, field2);
					if (field1 > field2) {
						return -1;
					} else {
						return 1;
					}
				}
				">证件号码</th>
			<th data-options="
				field:'creditrating',
				width:100,
				styler: function(value, row, index) {
					if (row.creditrating === '一级') {
						return 'background-color:#ffee00;color:red;';
					}
				}
				">信用等级</th>
			<th data-options="
				field:'industry',
				width:200
				">所属行业</th>
			<th data-options="
				field:'filingdate',
				width:100,
				formatter: function(value, row, index) {
					// console.log(value, row, index);
					return new Date();
				}
				">建档日期</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>1</td>
			<td>一级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>2</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>3</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>4</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>5</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>6</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>1</td>
			<td>一级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>2</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>3</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>4</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>5</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>6</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>1</td>
			<td>一级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>2</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>3</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>4</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>5</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>6</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>1</td>
			<td>一级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>2</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>3</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>4</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>5</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
		<tr>
			<td></td>
			<td>N20130314A001</td>
			<td>天津市华建装饰工程有限公司</td>
			<td>联社营业部</td>
			<td>6</td>
			<td>五级</td>
			<td>政府机构</td>
			<td>2013-03-14</td>
		</tr>
	</tbody>
</table>

<script type="text/javascript">
$('#dg').datagrid({
	rowStyler: function(index, row) {
		// console.log( row );
		if (index % 2 == 0) {
			return 'background-color:#6293BB;color:#fff;';
		}
	},
	loadFilter: function(data) {
		return data;
	}
});
</script>
