<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>全职工作修改页 </title>
    
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
					style="background-image: url(<%=basePath%>image/reg-title.png);">修改工作</div>
				<div class="centent-title-right">全职工作修改页</div>
			</div>
	    	
	    	<div class = "c-div-jobForm">
	    		<form action="">
	    			<table class = "c-table-jobForm">
	    				<tr>
	    					<th>全职职位标题:</th>
	    					<td><input type = "text" name = "jobTitle" /></td>
	    				</tr>
	    				<tr>
	    					<th>职位类别:</th>
	    					<td>
		    					<select name="jobType">
									<option value="lj" selected="selected">老师/家教</option>
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
	    					<td>
		    					<select name="workExperience">
									<option value="" selected="selected">选择工作经验</option>
									<option value="unlimited">不限</option>
									<option value="no">无经验</option>
									<option value="oneyear">一年以下</option>
									<option value="1to3">1-3年</option>
									<option value="3to5">3-5年</option>
									<option value="5to10">5-10年</option>
									<option value="tenyear">10年以上</option>
								</select>
	    					</td>
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
	    					<th>工资:</th>
	    					<td><input type = "text" name = "salary" /></td>
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
	    					<th>职位标签:</th>
	    					<td><input type = "text" name = "jobLable" /></td>
	    				</tr>
	    				<tr>
	    					<th>职位描述:</th>
	    					<td><textarea name = "jobDescribe"></textarea></td>
	    				</tr>
	    				<tr>
	    					<th>工作内容:</th>
	    					<td><textarea name = "moreRequire"></textarea></td>
	    				</tr>
	    				<tr>
	    					<th>发布日期:</th>
	    					<td><input type="text" name="publishTime" onclick="WdatePicker()" /></td>
	    				</tr>
	    				
						<tr>
							<td colspan = "2" style = "text-align: center;"><input id="publishBtn" type="submit" value="修改" /></td>
						</tr>
	    			</table>
	    		</form>
	    	</div>
	    	
    	</div>    	
    </div>
    
    
    
    
	<%@include file="bottom.jsp"%>
	
  </body>
</html>