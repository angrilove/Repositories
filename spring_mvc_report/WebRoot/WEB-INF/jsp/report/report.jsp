<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript">
$(document).ready(function() {
	$('#importButton').click(function() {
		var $file = $('#file').change(function() {
			if (!$(this).val()) {
				alertMsg.error('请选择文件！');
				return false;
			}
			$(this).parents('form:first').submit();
			// alertMsg.info('导入文件成功！');
		}).trigger('click');
		return false;
	});
	
	// 使表格可编辑
	$('#list tbody td').each(function() {
		$(this).click(function() {
			var $this = $(this);
			var dataType = $this.attr('dataType');
			$this.css({'margin': '0', 'padding': '0'});
			if (dataType) {
				var $span = $this.find('span');
				var $input = dataType === 'combox' ? $this.find('select') : $this.find('input');
				
				if ($span.length == 0) {
					var html = $this.text().replace(/\s+/g, '');
					$span = $('<span>' + html + '</span>');
					if (dataType === 'combox') {
						var data = '<select name="' + $this.attr('name') + '">';
						$.ajax({
							url:$this.attr('url'), 
							type: 'POST',
							cache: false,
							dataType: 'json',
							async: false,
							success: function(json) {
								for (var key in json) {
									if (html === json[key]) {
										data += '<option value="' + key + '" selected>' + json[key] + '</option>';
									} else {
										data += '<option value="' + key + '">' + json[key] + '</option>';
									}
								}
							},
							error: function() {
								alertMsg.error('网络连接不通，请检查网络！');
							}
						});
						data += '</select>';
						$input = $(data).change(function(e) {
							var p = $(this).parent();
							$span.text( $(this).find('option:selected').text() ).css('display', 'block');
							$span.parent().find('select').css("display",'none');
						}).click(function(e){
							e.stopPropagation();
						});
					} else if (dataType === 'date') {
						var data = '<input type="text" class="date textInput readonly valid" name="' + $this.attr('name') + '" value="' + $span.text() + '" format="yyyy/MM/dd HH:mm:ss" dateFmt="yyyy/MM/dd HH:mm:ss" readonly />';
						$input = $(data);
						if ($.fn.datepicker){
							var opts = {};
							if ($input.attr("dateFmt")) opts.pattern = $this.attr("dateFmt");
							if ($input.attr("minDate")) opts.minDate = $this.attr("minDate");
							if ($input.attr("maxDate")) opts.maxDate = $this.attr("maxDate");
							if ($input.attr("mmStep")) opts.mmStep = $this.attr("mmStep");
							if ($input.attr("ssStep")) opts.ssStep = $this.attr("ssStep");
							$input.datepicker(opts);
						}
						var hide = function() {
							$input.css('display', 'none');
							$span.css('display', 'block');
						}
						$input.change(hide);
						// 处理onchange事件的bug
						if (/msie/.test(navigator.userAgent.toLowerCase())) {
							$input.get(0).onpropertychange = hide;
						} else {
							$input.get(0).oninput = hide;
						}
					} else {
						var data = '<input type="text" name="' + $this.attr('name') + '" value="' + $span.text() + '" />';
						$input = $(data).keyup(function(e) {
							if (e.keyCode === 13) {
								$span.text( $(this).val() ).css('display', 'block');
								$(this).css('display', 'none');
							}
						}).blur(function() {
							$span.text( $(this).val() ).css('display', 'block');
							$(this).css('display', 'none');
						});
					}
	
					var width = $this.width() - 2;
					var height = $this.height() - 2;
					width = width > 120 ? 120 : width;
					height = height > 21 ?  21 : height;
					$input.css({'border': 'none', 'margin': 'none', 
						'padding': 'none', 'width': width + 'px', 
						'height': height + 'px', 'display': 'none'});
					$span.css({'display': 'block'});
					
					$this.empty().append($span).append($input);
				} // 结束编辑控件的添加
				
				$span.css('display', 'none');
				$input.css('display', 'block');
				if ($input.is('input')) {
					$input.select();
				}
				
			} // 结束表格控件处理
		});
	});
});

function addRow() {
	var $tr = $('#list tbody tr:first');
	$tr.removeClass('selected');
	var $newTr = $tr.clone(true);
	$("#list tbody tr").live("click", function() {
		$("#list tbody tr.selected").removeClass('selected');
		$(this).addClass('selected');
	});
	$tr.before($newTr);
	$('#list tbody tr').each(function(i, data) {
		var $this = $(this);
		$this.find('td:first').html(i + 1);
		$this.removeClass('trbg');
		if (i % 2 === 1) {
			$this.addClass('trbg');
		}
	});
}
</script>
<form id=importForm method="post" action="<%=basePath %>report/importReport.json" enctype="multipart/form-data" onsubmit="return iframeCallback(this);">
	<input type="file" id="file" name="file" style="display: none;" />
</form>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" id="importButton" href="javascript:void(0);"><span>导入</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="/spring_mvc_report/upload/report.xls" target="dwzExport" targetType="navTab" title="实要导出这些记录吗？"><span>导出EXCEL</span></a></li>
			<li><a class="icon" href="javascript:$.printBox('w_list_print')"><span>打印</span></a></li>
			<li><a class="icon" href="javascript:addRow();"><span>添加行</span></a></li>
		</ul>
	</div>

	<div id="w_list_print">
	<table id="list" class="list edit" width="98%" targetType="navTab" asc="asc" desc="desc" layoutH="30">
		<thead>
			<tr>
				<th>&nbsp;</th>
				<th colspan="2">客户信息</th>
				<th colspan="2">基本信息</th>
				<th colspan="3">资料信息</th>
			</tr>
			<tr>
				<th width="20">编号</th>
				<th width="80" orderField="name" class="asc">客户号</th>
				<th width="100" orderField="num" class="desc">客户名称</th>
				<th width="100">客户划分</th>
				<th width="100">证件号码</th>
				<th width="100">信用等级</th>
				<th width="100">企业性质</th>
				<th width="100">建档日期</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${reportList }" var="rl" varStatus="s">
			<tr target="sid_user" rel="1">
				<td width="20">${s.index + 1 }</td>
				<td width="80">${rl.userId }</td>
				<td width="100" name="reportList[${s.index }].userName" dataType="text">${rl.userName }</td>
				<td width="100" name="reportList[${s.index }].partment" dataType="combox" url="<%=basePath %>json/partment.json">${rl.partment }</td>
				<td width="100" name="reportList[${s.index }].text" dataType="text">${rl.card }</td>
				<td width="100" name="reportList[${s.index }].level" dataType="combox" url="<%=basePath %>json/level.json">${rl.level }</td>
				<td width="100">${rl.company }</td>
				<td width="100" name="reportList[${s.index }].createDate" dataType="date"><fmt:formatDate value="${rl.createDate }" pattern="yyyy/MM/dd hh:mm:ss" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	<!-- div class="panelBar" >
		<div class="pages">
			<span>显示</span>
			<select name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条，共23条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="2"></div>

	</div -->

</div>
