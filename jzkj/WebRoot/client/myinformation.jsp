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

<title>个人信息列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<%-- <link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljmain.css"> --%>
<link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljresume.css">
<script language="javascript" type="text/javascript"
	src="<%=BasePath%>My97DatePicker/WdatePicker.js"></script>
</head>

<body style="background-color: #F3F3F3;">

	<div class="resumeTop"><%@include file="personalmenubar.jsp"%></div>
	<div class="contentBody">
		<div class="cententForm">
			<form action="">
				<table>
					<tr style="border-bottom: 1px solid #DDDDDD;margin-left:100px;">
						<td style="text-align: left;">用户信息列表:</td>
						<td></td>
					</tr>
					<tr class="contentTR">
						<td>用户名:</td>
						<td><input class="resumeText" type="text" placeholder="会飞的企鹅"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>积分:</td>
						<td><input class="resumeText" type="text" placeholder="127分"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>会员级别:</td>
						<td><input class="resumeText" type="text" placeholder="T2"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>账户余额:</td>
						<td><input class="resumeText" type="text" placeholder="100元"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>注册时间:</td>
						<td><input class="resumeText" type="text"
							placeholder="2014-10-01" name="partResumeName" /></td>
					</tr>
					<tr>
						<td>面试次数:</td>
						<td><input class="resumeText" type="text" placeholder="11次"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>兼职次数:</td>
						<td><input class="resumeText" type="text" placeholder="12次"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>手机:</td>
						<td><input class="resumeText" type="text"
							placeholder="13645454955" name="partResumeName" /></td>
					</tr>
					<tr>
						<td>邮箱:</td>
						<td><input class="resumeText" type="text"
							placeholder="157632559@qq.com" name="partResumeName" /></td>
					</tr>
					<tr id="resumeMyIntroForm">
					</tr>
				</table>
				<!-- <div style="height:50px;width:920px;text-align: center;">
					<input id="comBtn" type="submit" value="OK" class="resumeBtn" />
				</div> -->
			</form>
		</div>
	</div>

	<%@include file="bottom.jsp"%>
</body>
</html>
