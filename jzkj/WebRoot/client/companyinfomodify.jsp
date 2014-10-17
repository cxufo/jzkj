<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改公司信息</title>
    
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
	    		<form action="">
	    			<table class = "c-table-jobForm">
	    				<tr>
	    					<th>企业用户名:</th>
	    					<td><input type = "text" name = "companyName" value = "阿里巴巴" /></td>
	    				</tr>
	    				<tr>
	    					<th>认证:</th>
	    					<td>未认证</td>
	    				</tr>
	    				<tr>
	    					<th>积分:</th>
	    					<td>180</td>
	    				</tr>
	    				<tr>
	    					<th>会员级别:</th>
	    					<td>一星</td>
	    				</tr>
	    				<tr>
	    					<th>注册时间:</th>
	    					<td>2014-12-18</td>
	    				</tr>
	    				<tr>
	    					<th>账户余额:</th>
	    					<td>1970元</td>
	    				</tr>
	    				<tr>
	    					<th>发布职位数:</th>
	    					<td>14</td>
	    				</tr>
	    				<tr>
	    					<th>剩余职位数:</th>
	    					<td>6</td>
	    				</tr>
	    				<tr>
	    					<th>联系电话:</th>
	    					<td><input type = "text" name = "companyPhone" /></td>
	    				</tr>
	    				<tr>
	    					<th>企业邮箱:</th>
	    					<td><input type = "text" name = "companyMail" /></td>
	    				</tr>
	    				<tr>
	    					<th>企业执照:</th>
	    					<td>
	    						<img alt="" src="<%=basePath %>image/company.jpg" style = "height: 460px;width:460px;">
	    					</td>
	    				</tr>
	    				
						<tr>
							<td colspan = "2" style = "text-align: center;"><input id="publishBtn" type="submit" value="确定" /></td>
						</tr>
	    			</table>
	    		</form>
	    	</div>
	    	
    	</div>    	
    </div>
    
    
    
    
	<%@include file="bottom.jsp"%>
	
  </body>
</html>