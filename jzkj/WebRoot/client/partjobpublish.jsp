<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>发布兼职工作</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/partjobpublish.css">
	

  </head>
  
  <body>
  
    <%@include file="companymenubar.jsp"%>
    
    <div class = "c-div-body">    
    	<div class = "c-div-bodyContent">
	    	
	    	<div class = "c-div-jobForm">
	    		<form action="">
	    			<table class = "c-table-jobForm">
	    				<tr>
	    					<th>兼职职位标题</th>
	    					<td>阿里巴巴</td>
	    				</tr>
	    				<tr>
	    					<th>兼职类别</th>
	    					<td>it</td>
	    				</tr>
	    				<tr>
	    					<th>招聘人数</th>
	    					<td>3</td>
	    				</tr>
	    				<tr>
	    					<th>可预约人数</th>
	    					<td>6</td>
	    				</tr>
	    				<tr>
	    					<th>学历</th>
	    					<td>本科</td>
	    				</tr>
	    				<tr>
	    					<th>工作经验</th>
	    					<td>无要求</td>
	    				</tr>
	    				<tr>
	    					<th>性别</th>
	    					<td>无要求</td>
	    				</tr>
	    				<tr>
	    					<th>年龄范围</th>
	    					<td>28以下</td>
	    				</tr>
	    				<tr>
	    					<th>工作地点</th>
	    					<td>贵州</td>
	    				</tr>
	    				<tr>
	    					<th>工作时间</th>
	    					<td>周一至周五</td>
	    				</tr>
	    				<tr>
	    					<th>工资</th>
	    					<td>面议</td>
	    				</tr>
	    				<tr>
	    					<th>职位标签</th>
	    					<td>技术</td>
	    				</tr>
	    				<tr>
	    					<th>职位描述</th>
	    					<td>技术人员</td>
	    				</tr>
	    				<tr>
	    					<th>面试时间</th>
	    					<td>工作日</td>
	    				</tr>
	    				<tr>
	    					<th>面试地点</th>
	    					<td>贵州</td>
	    				</tr>
	    				<tr>
	    					<th>具体要求</th>
	    					<td>面谈</td>
	    				</tr>
	    				<tr>
	    					<th>发布日期</th>
	    					<td>今天2014-10-14</td>
	    				</tr>
	    			</table>
	    		</form>
	    	</div>
	    	
    	</div>    	
    </div>
    
    
    
    
	<%@include file="bottom.jsp"%>
	
  </body>
</html>
