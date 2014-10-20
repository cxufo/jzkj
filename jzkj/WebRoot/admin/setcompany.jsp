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
				  <div class="cx-company-search" style="width:700px;height:100px;margin-left:200px;margin-top:30px;float:left;">
					<form action="#" method="post">				        
				           <input type="text" name="keyword" style="height:30px;width:600px;" value="输入企业名查询"/>
				           <input type="submit" value="查询" style="height:30px;width:70px;"/>
				        </form>
				 </div>
				</div>
				<div class="main_bd">	
				
				<div class="main_bd">
					<div class="cx-set-userinfo" style="margin-left:300px;width:600px;">
					     <table>
					         <form action="#" method="post">
					           <tr>
					              <td>企业名：</td><td><input type="text"  name="cname" readOnly="true" style="width:300px;height:30px;"></td>
					           </tr>
					           <tr>
					              <td>联系人：</td><td><input type="text"  name="contactmen" readOnly="true" style="width:300px;height:30px;"></td>
					           </tr>
					           <tr>
					              <td>手机：</td><td><input type="text" name="phone" readOnly="true" style="width:300px;height:30px;"/></td>
					           </tr>
					            <tr>
					              <td>邮箱：</td><td><input type="text" name="email" readOnly="true" style="width:300px;height:30px;"/></td>
					           </tr>
					           <tr>
					              <td>积分：</td><td><input type="text" name="email"  style="width:300px;height:30px;"/></td>
					           </tr>
					           <tr>
					              <td>账户余额：</td><td><input type="text" name="email"  style="width:300px;height:30px;"/></td>
					           </tr>
					           <tr>
					              <td>职位数：</td><td><input type="text" name="email"  style="width:300px;height:30px;"/></td>
					           </tr>
					           <tr>
					              <td>剩余职位数：</td><td><input type="text" name="email"  style="width:300px;height:30px;"/></td>
					           </tr>					           	            
					           <tr>
					              <td>会员：</td><td style="width:50px;"><input type="radio" name="isMenber" value="true"/>是<input type="radio" name="isMenber" value="否"/>否</td>
					           </tr>
					            <tr>
					              <td>认证：</td><td style="width:50px;"><input type="radio" name="attestation" value="true"/>已认证<input type="radio" name="attestation" value="否"/>未认证</td>
					           </tr>
					           <tr>
					               <td></td><td><input type="submit" value="提交" style="height:30px;width:300px;"/></td>
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
