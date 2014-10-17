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
  
    <%@include file="companymenu.jsp"%>
    
    <div class = "c-div-body">
    	<div class = "c-div-bodyContent">
	    	
			 <div class="centent-title">
				<div class="centent-title-left"
					style="background-image: url(<%=basePath%>image/reg-title.png);">发布工作</div>
				<div class="centent-title-right">兼职工作</div>
			</div>
	    	
	    	<div class = "c-div-jobForm">
	    		<form action="">
	    			<table class = "c-table-jobForm">
	    				<tr>
	    					<th>兼职职位标题:</th>
	    					<td><input type = "text" name = "jobTitle" /></td>
	    				</tr>
	    				<tr>
	    					<th>职位类别:</th>
	    					<td>
		    					<select name="jobType">
									<option value="studentpartjob" selected="selected">学生兼职</option>
									<option value="lj">老师/家教</option>
									<option value="cd">促销/导购</option>
									<option value="cj">传单/举牌</option>
									<option value="sx">市调/宣传</option>
									<option value="ml">模特/礼仪</option>
									<option value="bz">表演/主持</option>
									<option value="fb">翻译/编辑</option>
									<option value="wk">文员/客服</option>
									<option value="xy">销售/业务</option>
									<option value="ms">美工/设计</option>
									<option value="kc">会计/出纳</option>
									<option value="iy">IT类店员/营业员</option>
									<option value="jg">技工/工人</option>
									<option value="fz">服务生/钟点工</option>
									<option value="other">其他</option>
								</select>
	    					</td>
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
									<option value="seniorHigh">高中</option>
									<option value="specialty">大专</option>
									<option value="undergraduate" selected="selected">本科</option>
									<option value="master">硕士研究生</option>
									<option value="doctor">博士</option>
								<option value="unlimited">不限</option>
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
		    					<select name="gender">
									<option value="male">男</option>
									<option value="female">女</option>
									<option value="unlimited" selected="selected">不限</option>
								</select>
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
	    					<th>职位描述:</th>
	    					<td><textarea name = "jobDescribe"></textarea></td>
	    				</tr>
	    				<tr>
	    					<th>具体要求:</th>
	    					<td><textarea name = "moreRequire"></textarea></td>
	    				</tr>
	    				<tr>
	    					<th>发布日期:</th>
	    					<td><input type="text" name="publishTime" onclick="WdatePicker()" /></td>
	    				</tr>
	    				
						<tr>
							<td colspan = "2" style = "text-align: center;"><input id="publishBtn" type="submit" value="发布" /></td>
						</tr>
	    			</table>
	    		</form>
	    	</div>
	    	
    	</div>    	
    </div>
    
    
    
    
	<%@include file="bottom.jsp"%>
	
  </body>
</html>
