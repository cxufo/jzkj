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
	<script language="javascript" type="text/javascript" src="<%=basePath %>My97DatePicker/WdatePicker.js"></script>
	

  </head>
  
  <body>
  
    <%@include file="companymenubar.jsp"%>
    
    <div class = "c-div-body">    
    	<div class = "c-div-bodyContent">
	    	
	    	<div class = "c-div-jobForm">
	    		<form action="">
	    			<table class = "c-table-jobForm">
	    				<tr>
	    					<th>兼职职位标题:</th>
	    					<td><input type = "text" name = "jobTitle" /></td>
	    				</tr>
	    				<tr>
	    					<th>兼职类别:</th>
	    					<td><input type = "text" name = "jobType" /></td>
	    				</tr>
	    				<tr>
	    					<th>招聘人数:</th>
	    					<td><input type = "text" name = "recruitNum" /></td>
	    				</tr>
	    				<tr>
	    					<th>可预约人数:</th>
	    					<td><input type = "text" name = "reserveNum" /></td>
	    				</tr>
	    				<tr>
	    					<th>学历:</th>
	    					<td>
		    					<select name="degree">
									<option value="senior">高中</option>
									<option value="saab">中专</option>
									<option value="saab">大专</option>
									<option value="fiat" selected="selected">本科</option>
									<option value="audi">硕士</option>
									<option value="audi">研究生</option>
									<option value="audi">博士</option>
								</select>
	    					</td>
	    				</tr>
	    				<tr>
	    					<th>工作经验:</th>
	    					<td><input type = "text" name = "workExperience" /></td>
	    				</tr>
	    				<tr>
	    					<th>性别要求:</th>
	    					<td>
		    					<input type = "text" name = "gender" />
	    					</td>
	    				</tr>
	    				<tr>
	    					<th>年龄范围:</th>
	    					<td><input type = "text" name = "ageRange" /></td>
	    				</tr>
	    				<tr>
	    					<th>工作地点:</th>
	    					<td><input type = "text" name = "workplace" /></td>
	    				</tr>
	    				<tr>
	    					<th>工作时间:</th>
	    					<td><input type = "text" name = "worktime" /></td>
	    				</tr>
	    				<tr>
	    					<th>工资:</th>
	    					<td><input type = "text" name = "salary" /></td>
	    				</tr>
	    				<tr>
	    					<th>职位标签:</th>
	    					<td><input type = "text" name = "jobLable" /></td>
	    				</tr>
	    				<tr>
	    					<th>面试时间:</th>
	    					<td><input type = "text" name = "interviewTime" /></td>
	    				</tr>
	    				<tr>
	    					<th>面试地点:</th>
	    					<td><input type = "text" name = "interviewPlace" /></td>
	    				</tr>
	    				<tr>
	    				<tr>
	    					<th>职位描述:</th>
	    					<td><textarea name = "jobDescribe"></textarea></td>
	    				</tr>
	    					<th>具体要求:</th>
	    					<td><textarea name = "moreRequire"></textarea></td>
	    				</tr>
	    				<tr>
	    					<th>发布日期:</th>
	    					<td><input type="text" name="publishTime" onclick="WdatePicker()" /></td>
	    				</tr>
	    			</table>
	    		</form>
	    	</div>
	    	
    	</div>    	
    </div>
    
    
    
    
	<%@include file="bottom.jsp"%>
	
  </body>
</html>
