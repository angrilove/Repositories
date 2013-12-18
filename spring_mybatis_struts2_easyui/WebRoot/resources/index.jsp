<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
  	
    <link href="<%=basePath%>resources/themes/default/easyui.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>resources/themes/icon.css" rel="stylesheet" type="text/css" />
    
    <script type="text/javascript" src="<%=basePath%>resources/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/jquery.easyui.min.js"></script>
    <!-- script type="text/javascript">
        $(document).ready(function() {
           /* $("#loginWindow").dialog({
                title: '登陆窗口',
                width: 290,
                height: 300,
                modal: true
            }); */
            $("#username").focus();
            //登录
            $("#btnLogin").click(function() {
                var username = document.getElementById("username").value;
                var password = document.getElementById("password").value;
                if(username==''){
                	$.messager.alert("提示","请输入账号！","error");
                	$("#username").focus();
                	return;
                }
                if(password==''){
                	$.messager.alert("提示","请输入密码！","error");
                	$("#password").focus();
                	return;
                }
                loginSys(username, password);
            });

            $("#aboutSys").click(function() {
            	$.messager.defaults={ok:"确定",cancel:"取消"};   
                $.messager.confirm('提示', '确认退出登陆吗？', function(out){
                	if(out==true){
                		$("#loginWindow").window("close");
                    	window.close();
                    }
                });
            });
        });

        //登陆操作方法
        function loginSys(username, password) {
           $.ajax({
               type: "POST",
               dataType: "json",
               url: "edemo/menu/user_userLogin",
               data: { 'user.name': username, 'user.password': password },
               success: function(json) {
                   if (json.user.retCode < 0) {
                	   $.messager.alert('错误', json.user.retInfo, 'error');
                   }
                   else {
                	   window.location.href = "edemo/menu/menu_main"; 
                   }
               },
               error: function() {
                   $.messager.alert('错误', '获取账号信息失败...请联系管理员!', 'error');
               }
           });
        }
    </script-->

</head>
<body>
    <!-- div id="loginWindow" class="easyui-dialog" style="margin-top: 0px;" data-options="width:290,height:300,modal:true,title:'登录窗口'">
        <table>
            <tr>
                <td>
                   	 账号：
                </td>
                <td>
                    <input id="username" class="easyui-validatebox" required="true" validtype="length[1,10]" style="width: 150px;" />
                </td>
            </tr>
            <tr>
                <td>
                   	 密码：
                </td>
                <td>
                    <input type="password" id="password" style="width: 150px;" class="easyui-validatebox" required="true" validtype="length[3,10]" />
                </td>
            </tr>
        </table>
        
        <div class="toolbar" style="text-align: center; margin-top: 20px;">
        	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" id="btnLogin" style="padding-left: 2em;">登陆</a>
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-no'" id="aboutSys">退出</a> 
        </div>
    </div-->
    
    <div class="easyui-dialog" data-options="width:200,height:100,title:'你的'">阿斯顿发生</div>
</body>
</html>
