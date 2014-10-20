<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>会员设置</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
  <%@ include file="adminheader.jsp"%>
  
  <div id="body" class="body">
		<div id="js_container" class="container_box">
			<!--在这里引入LeftMenuBar左部菜单栏  -->			
			<div class="cx-left-menu"><%@ include file="Admin_LeftMenuBar.jsp"%></div>
			<div class="cx-right">
				<div class="main_hd">
					<h1>职位类别管理</h1>
				</div>
				<div class="main_bd">	
				
				<div class="main_bd">
					<div class="cx-set-userinfo" style="margin-left:300px;width:900px;">
					     <table>
					         <form action="#" method="post">					           
					           <tr>
					              <td>职位类别：</td><td><input type="text" name="email" style="width:200px;height:30px;"/></td>
					              <td>兼职全职：</td><td style="width:50px;"><td><input type="radio" name="job" value="兼职"/>兼职</td><td><input type="radio" name="job" value="全职"/>全职</td>
					               <td><input type="submit" value="提交" style="height:30px;width:200px;"/></td>
					           </tr>
					          </form>
					     </table>
					</div>
						
				</div>
			</div>
		</div>
	</div>
  
  <%@ include file="adminfooter.jsp"%>
  </body>
</html>
