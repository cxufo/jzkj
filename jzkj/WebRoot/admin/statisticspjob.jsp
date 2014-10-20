<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>职位统计</title>

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
			<div class="cx-left-menu"><%@ include
					file="Admin_LeftMenuBar.jsp"%></div>
			<div class="cx-right">
				<div class="main_hd">
					<div class="cx-cuser-search" style="width:700px;height:100px;margin-left:200px;margin-top:30px;float:left;">
					<form action="#" method="post">	
					       <table>
					       <td><select style="width:150px;height:30px">
					             <option>离面试日期1天</option>
					             <option>离面试日期2天</option>
					             <option>离面试日期3天</option>
					             <option>离面试日期4天</option>
					             <option>离面试日期5天</option>
					             <option>5天以上</option>
					           </select></td>
					       <td>
					       <select style="width:150px;height:30px">
					             <option>离工作日期1天</option>
					             <option>离工作日期2天</option>
					             <option>离工作日期3天</option>
					             <option>离工作日期4天</option>
					             <option>离工作日期5天</option>
					             <option>5天以上</option>
					           </select>
					       </td>
	
					       <td>
					       <select style="width:150px;height:30px">
					             <option>已满</option>
					             <option>待聘</option>
					           </select>
					       </td>
					       <td><input type="submit" value="查询" style="height:30px;width:70px;"/></td></table>			        
			          
				        </form>
				 </div>
				</div>
				<div class="main_bd">

					<div class="main_bd">
						<div id="js_msgSender" class="msg_sender"
							style="background-color: #FFFFFF;height:100%">
							<div class="msg_tab">
								<div class="tab_panel">
									<div style="border: 1px solid #E7E7EB;">
										<table id="js_msg_table" class="msg_table"
											style="text-align:center">
											<tr style="background-color:#E7E7EB ">
												<th style="width:7%;">编号
												</td>
												<th style="width:;">兼职标题
												</td>
												<th style="width:10%;">兼职类别
												<th style="width:14%;">工作地点
												</td>
												<th style="width:14%;">工作时间
												</td>
												<th style="width:7%;">状态
												</td>
												<th style="width:7%;">薪酬
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
												<td>gffdsgfds</td>
												<td><a href="admin/pjobdetail.jsp" name="editor">详情</a></td>
												</td>
											</tr>
											<tr class="tr1">
												<td>1</td>
												<td>gfdsgfds</td>
												<td>gffdsgfds</td>
												<td>gfdsgfds</td>
												<td>gffdsgfds</td>
												<td>gffdsgfds</td>
												<td>gffdsgfds</td>
												<td><a href="#" name="editor">详情</a></td>
												</td>
											</tr>
											<tr class="tr1">
												<td>1</td>
												<td>gfdsgfds</td>
												<td>gffdsgfds</td>
												<td>gfdsgfds</td>
												<td>gffdsgfds</td>
												<td>gffdsgfds</td>
												<td>gffdsgfds</td>
												<td><a href="#" name="editor">详情</a></td>
												</td>
											</tr>
											<tr class="tr1">
												<td>1</td>
												<td>gfdsgfds</td>
												<td>gffdsgfds</td>
												<td>gfdsgfds</td>
												<td>gffdsgfds</td>
												<td>gffdsgfds</td>
												<td>gffdsgfds</td>
												<td><a href="#" name="editor">详情</a></td>
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
