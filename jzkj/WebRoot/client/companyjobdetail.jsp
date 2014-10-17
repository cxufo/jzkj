<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>工作详情</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/partjobpublish.css">
	<script language="javascript" type="text/javascript" src="<%=basePath %>My97DatePicker/WdatePicker.js"></script>
	

  </head>
  
  <body>
  
    <%@include file="companymenu.jsp"%>
    
    <div class = "c-div-body">
    	<div class = "c-div-bodyContent">
	    		    	
	    	<div class = "c-div-jobForm">
    			<table class = "c-table-jobForm">
    				<tr>
    					<th>全职职位标题:</th>
    					<td>全职工作</td>
    				</tr>
    				<tr>
    					<th>职位类别:</th>
    					<td>翻译/编辑</td>
    				</tr>
    				<tr>
    					<th>招聘人数:</th>
    					<td>5人</td>
    				</tr>
    				<tr>
    					<th>可预约人数:</th>
    					<td>15人</td>
    				</tr>
    				<tr>
    					<th>学历:</th>
    					<td>本科</td>
    				</tr>
    				<tr>
    					<th>工作经验:</th>
    					<td>不限</td>
    				</tr>
    				<tr>
    					<th>性别要求:</th>
    					<td>不限</td>
    				</tr>
    				<tr>
    					<th>年龄范围:</th>
    					<td>20岁以上</td>
    				</tr>
    				<tr>
    					<th>工作地点:</th>
    					<td>贵州省贵阳市南明区</td>
    				</tr>
    				<tr>
    					<th>工资:</th>
    					<td>面议</td>
    				</tr>
    				<tr>
    					<th>面试时间:</th>
    					<td>工作日  9:00-16:00</td>
    				</tr>
    				<tr>
    					<th>面试地点:</th>
    					<td>贵州省贵阳市南明区沙冲路口</td>
    				</tr>
    				<tr>
    					<th>职位标签:</th>
    					<td>全职</td>
    				</tr>
    				<tr>
    					<th>职位描述:</th>
    					<td>全职  经常加班   吃苦耐劳</td>
    				</tr>
    				<tr>
    					<th>工作内容:</th>
    					<td>编辑</td>
    				</tr>
    				<tr>
    					<th>发布日期:</th>
    					<td>2014-10-17</td>
    				</tr>
	    				
						<tr>
							<td colspan = "2" style = "text-align: center;">
								<input id="publishBtn" type="button" value="返回" onclick="javascript:history.back();" />
							</td>
						</tr>
    			</table>
	    	</div>
	    	
    	</div>    	
    </div>
    
    
    
    
	<%@include file="bottom.jsp"%>
	
  </body>
</html>