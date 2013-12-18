<%@ page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="easyui-layout" data-options="fit:true">
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;">north</div>  
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;">south</div>  
    <div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;">east</div>  
    <div data-options="region:'west',title:'West',split:true" style="width:100px;">west</div>  
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">center</div>  
</div>
