<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent validatebox">
	<dl>
		<dt>Email:</dt>
		<dd>
			<input id="vb" class="easyui-validatebox" data-options="required:true,validType:'email'"></input>
		</dd>
	</dl>
	<dl>
		<dt>延迟验证（delay 200）：</dt>
		<dd>
			<input id="vb2" class="easyui-validatebox" data-options="required:true,validType:'email',delay:500,missingMessage:'不能为空'"></input>
		</dd>
	</dl>
	<dl>
		<dt>密码：</dt>
		<dd>
			<input id="pwd" name="pwd" type="password" class="easyui-validatebox" data-options="required:true" />
		</dd>
	</dl>
	<dl>
		<dt>重复密码（自定义验证）：</dt>
		<dd>
			<input id="rpwd" name="rpwd" type="password" class="easyui-validatebox" required="required" validType="equals['#pwd']" />
		</dd>
	</dl>
	<dl>
		<dt>URL：</dt>
		<dd>
			<input type="text" class="easyui-validatebox" validType="url" />
		</dd>
	</dl>
	<dl>
		<dt>Length：</dt>
		<dd>
			<input type="text" class="easyui-validatebox" validType="length[6,10]" />
		</dd>
	</dl>
	<dl>
		<dt>多种验证：</dt>
		<dd>
			<input type="text" class="easyui-validatebox" data-options="validType:['email', 'length[10, 20]']" />
		</dd>
	</dl>
	<dl>
		<dt>自定义验证（minLength）：</dt>
		<dd>
			<input type="text" class="easyui-validatebox" validType="minLength[6]" />
			<input type="text" class="easyui-validatebox" data-options="validType:'minLength[6]'" />
		</dd>
	</dl>
	<dl>
		<dt>在服务器端验证：</dt>
		<dd>
			<input type="text" class="easyui-validatebox" validType="remote['jsp/validatebox/v.data', 'paramName1', 'p2']" />
		</dd>
	</dl>
</div>
<script type="text/javascript">
$.extend($.fn.validatebox.defaults.rules, {
	equals: {
		validator: function(value, param) {
			console.log(value, param);
			return value == $(param[0]).val();
		},
		message: '密码不一致'
	}
});
$.extend($.fn.validatebox.defaults.rules, {
	minLength: {
		validator: function(value, param) {
			console.log(value, param);
			return value.length >= param[0];
		},
		message: '长度至少为{0}'
	}
});
</script>
