<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
	
	
  </head>
  
  <body>
    <!-- This is my JSP page. <br> -->
    
	<!--在这里引入头部  -->
	<%@include file="client/top.jsp"%>
		
	<!--在这里引入头部  -->
	<%@include file="client/title.jsp"%>
	
	
	<!-- 首页主体 -->
	<div class = "c-div-body">
	
		<!-- 招聘选项 -->
		<div class = "c-div-optionsList">
			<div class = "c-div-oneList">
				<div class = "c-div-listTitle">
				</div>
				<div class = "c-div-listDetail">
				</div>
			</div>
		</div>
		
		<!-- 我要报名 -->
		<div class = "c-div-apply">
		</div>
		
	</div>
	
	
	<!--在这里引入头部  -->
	<%@include file="client/bottom.jsp"%>
	
  </body>
</html>
