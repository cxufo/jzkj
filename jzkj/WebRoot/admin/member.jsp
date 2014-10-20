<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
					<h1>注册用户</h1>
					<p>查询注册的但非会员的用户的信息</p>
				</div>
				<div class="main_bd">
				
				<div class="main_bd">
				    <div class="cx-user-search" style="width:800px;height:50px;margin-top:30px;margin-left:50px;">
				        <form action="#" method="post">
				        
				           <select style="height:30px;width:100px;">
				              <option>用户名</option>
				              <option>兼职次数</option>
				              <option>面试次数</option>
				           </select>
				           <input type="text" name="keyword" style="height:30px;width:500px;"/>
				           <input type="submit" value="查询" style="height:30px;width:70px;"/>
				        </form>
				    </div>
					<div id="js_msgSender" class="msg_sender"
						style="background-color: #FFFFFF;height:100%">
						<div class="msg_tab">
							<div class="tab_panel">
								<div style="border: 1px solid #E7E7EB;">
									<table id="js_msg_table" class="msg_table" style="text-align:center">
										<tr style="background-color:#E7E7EB ">
											<th style="width:10%;">编号
											</td>
											<th style="width:14%;">用户名
											</td>
											<th style="width:14%;">手机
											</td>
											<th style="width:14%;">邮箱
											</td>
											<th style="width:6%;">是否会员
											</td>
											<th style="width:6%;">账户余额
											</td>
											<th style="width:6%;">积分
											</td>
											<th style="width:6%;">面试次数
											</td>
											<th style="width:6%;">兼职次数
											</td>
											<th style="width:10%;">注册时间
											</td>
											<th style="width:14%;">操作
											</td>
										</tr>										
										<tr class="tr1">
											<td>1</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td><a href="#"
												name="editor">设置</a></td>
											</td>
										</tr>
										<tr class="tr1">
											<td>1</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td><a href="#"
												name="editor">设置</a></td>
											</td>
										</tr>
										<tr class="tr1">
											<td>1</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td><a href="#"
												name="editor">设置</a></td>
											</td>
										</tr>
										<tr class="tr1">
											<td>1</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td>gfdsgfds</td>
											<td>gffdsgfds</td>
											<td><a href="#"
												name="editor">设置</a></td>
											</td>
										</tr>
									</table>
									<script>
										var oTab = document
												.getElementById('js_msg_table');
										var oDe = document
												.getElementsByName('input');
										var oTr = document
												.getElementsByTagName('tr');
										var oAE = document
												.getElementsByName('editor');
										var oAD = document
												.getElementsByName('deleter');
										for (var i = 1; i < oTr.length; i++) {
											/*鼠标点击表格时背景变色*/
											oTr[i].onclick = function() {
												for (var i = 1; i < oTr.length; i++) {
													oTr[i].style = "background-color:#ffffff";
												}
												this.style = "background-color:#F4F5F9";
											}
										}
										for (var i = 0; i < oAD.length; i++) {
											oAD[i].onclick = function() {
												if (confirm("确认要删除吗！")) {
													/* this.parentNode.parentNode.style = "background-color:red;"; */
													oTab.tBodies[0]
															.removeChild(this.parentNode.parentNode);
															alert("成功删除！");
												}
											}
										}
									</script>
								</div>


							</div>
						</div>
					</div>
				</div>
						
				</div>
			</div>
		</div>
	</div>
  
  <%@ include file="adminfooter.jsp"%>
  </body>
</html>
