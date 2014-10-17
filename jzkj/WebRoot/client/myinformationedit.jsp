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

<title>个人信息编辑</title>

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
		<%-- <div class="centent-title">
			<div class="centent-title-left"
				style="background-image: url(<%=BasePath%>image/reg-title.png);">个人中心</div>
			<div class="centent-title-right">个人信息编辑</div>
		</div> --%>
		<div class="cententForm">
			<form action="" id="form1">
				<table>
					<tr style="border-bottom: 1px solid #DDDDDD;margin-left:100px;">
						<td style="text-align: left;">用户信息修改:</td>
						<td></td>
					</tr>
					<tr class="contentTR">
						<td>用户名:</td>
						<td><input class="resumeText" type="text" placeholder="会飞的企鹅"
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
				</table>
				<div class="zlj-myInfor-sub-div">
					<input id="comBtn" type="submit" value="修改" class="resumeBtn" />
				</div>
			</form>
			<form id="form2" action="">
				<table>
					<tr style="border-bottom: 1px solid #DDDDDD;margin-left:100px;">
						<td style="text-align: left;">用户信息修改:</td>
						<td></td>
					</tr>
					<tr class="contentTR">
						<td>原密码:</td>
						<td><input class="resumeText" type="text"
							name="partResumeName" /></td>
					</tr>
					<tr class="contentTR">
						<td>新密码:</td>
						<td><input class="resumeText" type="text"
							name="partResumeName" /></td>
					</tr>
					<tr class="contentTR">
						<td>重复新密码:</td>
						<td><input class="resumeText" type="text"
							name="partResumeName" /></td>
					</tr>
				</table>
				<div class="zlj-myInfor-sub-div">
					<input id="comBtn" type="submit" value="修改" class="resumeBtn" />
				</div>
			</form>
		</div>
	</div>

	<%@include file="bottom.jsp"%>
</body>
</html>
