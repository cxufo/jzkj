<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>工作记录-发布的工作</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/zljresume.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/zljmywork.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/zljcommon.css">
		
<style type="text/css">
.c-ul-applyList ui li font {
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
}
</style>

  </head>
  
<body style="background-color: #F3F3F3;">

	<div class="resumeTop"><%@include file="companymenu.jsp"%></div>
	<div class="contentBody">
		<%-- <div class="centent-title">
			<div class="centent-title-left"
				style="background-image: url(<%=BasePath%>image/reg-title.png);">我的工作</div>
			<div class="centent-title-right">获得的工作</div>
		</div> --%>
		<div class="cententForm" style="width:100%;" name="b2">
			<div id="js_msgSender" class="msg_sender"
				style="background-color: #FFFFFF;">
				<div class="msg_tab">
					<div class="tab_panel">
						<div style="border: 0px solid #E7E7EB;">
							<table id="js_msg_table" class="msg_table"
								style="width:100%;border-collapse:collapse;" border="0"
								bordercolor="#a0c6e5">
								<!-- <div
									style="line-height:40px;height:40px;font-size: 25px;width:200px;text-align: left;padding-left:10px;">获得的工作:</div>
								 -->
								<tr style="background-color:#93D2F5 ">
									<th style="width:8%;">编号</th>
									<th style="width:30%;">标题</th>
									<th style="width:15%;">职位类别</th>
									<th style="width:12%;">薪酬</th>
									<th style="width:35%;">工作地点</th>
									<th style="width:15%;">报名时间</th>
									<th style="width:15%;">操作</th>
								</tr>
								<%
									for (int i = 0; i < 10; i++) {
								%>
								<tr>
									<td><%=i + 1%></td>
									<td>到花溪贵大派发传单</td>
									<td>家教工/老师工</td>
									<td>3000-6000</td>
									<td>贵阳市南明区最空间B栋15楼贵阳市南明区最空间B栋15楼</td>
									<td>2014-10-10</td>
									<td><a href="<%=basePath%>client/companyjobdetail.jsp" name="editor">详情</a>/
										<a href="<%=basePath%>client/companypublished.jsp" name="deleter">取消</a></td>
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
					<a href="javascript:;">上一页</a>
					<a href="javascript:;">1</a>
					<!-- <label style="height:42px;width:90px;background-color:#949494 ;border:1px siolid   #D4D4D4;line-height:42px;font-size:18px;text-align:center;margin: 0 10px 0 20px; value=" 0"></label>
					<input
						style="height:42px;width:90px;background-color:#949494 ;border:1px siolid   #D4D4D4;line-height:42px;font-size:18px;text-align:center;margin: 0 10px 0 20px; value=" 0"/>
					 --><a href="javascript:;">下一页</a>
				</div>

			</div>
		</div>


		<!--  -->


	</div>

	<%@include file="bottom.jsp"%>
</body>
</html>