<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	String Path = request.getContextPath();
	String BasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ Path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=BasePath%>">

<title>我的工作-报名的工作</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljresume.css">
<link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljmywork.css">
<script language="javascript" type="text/javascript"
	src="<%=BasePath%>My97DatePicker/WdatePicker.js"></script>
</head>

<body style="background-color: #F3F3F3;">
	<!-- 引用头部 -->
	<div class="resumeTop"><%@include file="personalmenubar.jsp"%></div>
	<div class="contentBody">
		<div class="cententForm" style="width:100%;" name="a1">
			<div id="js_msgSender" class="msg_sender"
				style="background-color: #FFFFFF;">
				<div class="msg_tab">
					<div class="tab_panel">
						<div style="border: 0px solid #E7E7EB;">
							<table id="js_msg_table" class="msg_table"
								style="width:100%;border-collapse:collapse;" border="0"
								bordercolor="#a0c6e5">
								<tr
									style="margin-left:100px;background-color: #F3F3F3;font-size: 20px;border-bottom: 1px solid #000000;">
									<td style="text-align: left;">报名的工作:</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr style="background-color:#93D2F5 ">
									<th style="width:10%;">编号</th>
									<th style="width:30%;">标题</th>
									<th style="width:15%;">薪酬</th>
									<th style="width:30%;">报名时间</th>
									<th style="width:15%;">操作</th>
								</tr>
								<%
									for (int i = 0; i < 5; i++) {
								%>
								<tr>
									<td><%=1 + i%></td>
									<td>到花溪贵大派发传单</td>
									<td>3000-6000</td>
									<td>2014-10-14</td>
									<td><a href="#a1" name="editor">详情</a>/<a href="#b2"
										name="deleter">取消</a></td>
								</tr>
								<%
									}
								%>
								<%
									for (int i = 0; i < 5; i++) {
								%>
								<tr>
									<td><%=i + 6%></td>
									<td>-</td>
									<td>-</td>
									<td>-</td>
									<td>-<!-- <a href="#a1" name="editor">详情</a>/<a href="#b2"
										name="deleter">取消</a> --></td>
								</tr>
								<%
									}
								%>
							</table>
							<script>
								var oTab = document
										.getElementById('js_msg_table');
								var oDe = document.getElementsByName('input');
								var oTr = document.getElementsByTagName('tr');
								var oAE = document.getElementsByName('editor');
								var oAD = document.getElementsByName('deleter');
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
									/*点击标签删除当前行*/
									oAD[i].onclick = function() {
										if (confirm("确认要删除吗！")) {
											/* this.parentNode.parentNode.style = "background-color:red;"; */
											oTab.tBodies[0]
													.removeChild(this.parentNode.parentNode);
										}
									}
								}
							</script>
						</div>
					</div>
				</div>

				<div class="c-div-paging">
					<a href="javascript:;">上一页</a> <a href="javascript:;">1</a> <a
						href="javascript:;">下一页</a>
				</div>
			</div>
		</div>

	</div>

	<%@include file="bottom.jsp"%>
</body>
</html>
