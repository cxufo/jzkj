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

<title>发布兼职简历</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%-- <link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljmain.css"> --%>
<link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljresume.css">
<script language="javascript" type="text/javascript"
	src="My97DatePicker/WdatePicker.js"></script>
</head>

<body style="background-color: #F3F3F3;">

	<div class="resumeTop"><%@include file="personalmenubar.jsp"%></div>
	<div class="contentBody">
		<%-- <div class="centent-title">
			<div class="centent-title-left"
				style="background-image: url(<%=BasePath%>image/reg-title.png);">发布简历</div>
			<div class="centent-title-right">兼职简历</div>
		</div>  --%>
		<div class="cententForm">
			<form action="">
				<table>
					<tr class="contentTR">
						<td>姓名:</td>
						<td><input class="resumeText" type="text" placeholder="赵承熙"
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>性别:</td>
						<td><input class="resumeRadio" type="radio" value="man"
							name="sex" /><span>男</span><input class="resumeRadio"
							type="radio" value="women" name="sex" /><span>女</span></td>
					</tr>
					<tr>
						<td>出生日期:</td>
						<td><input class="resumeText" type="text" name="creattime"
							id="creattimeid" value="" onclick="WdatePicker()" /></td>
					</tr>
					<tr>
						<td>学历:</td>
						<td><select name="cars">
								<option value="volvo">高中</option>
								<option value="saab">中专</option>
								<option value="saab">大专</option>
								<option value="fiat" selected="selected">本科</option>
								<option value="audi">硕士</option>
								<option value="audi">研究生</option>
								<option value="audi">博士</option>
						</select></td>
					</tr>
					<tr>
						<td>所在地:</td>
						<td><input class="resumeText" type="text"
							placeholder="贵州省贵阳市南明区沙冲南路" name="partResumeName" /></td>
					</tr>
					<tr>
						<td>期望日薪:</td>
						<td><select name="cars">
								<option value="volvo">40</option>
								<option value="saab">50</option>
								<option value="saab">60</option>
								<option value="fiat" selected="selected">80</option>
								<option value="audi">100</option>
								<option value="audi">200</option>
								<option value="audi">500以上</option>
						</select></td>
					</tr>
					<tr>
						<td>期望工作地点:</td>
						<td><input class="resumeText" type="text"
							placeholder="贵州省贵阳市南明区沙冲南路" name="partResumeName" /></td>
					</tr>
					<tr>
						<td>期望工作时间:</td>
						<td><select name="cars">
								<option value="volvo">星期一</option>
								<option value="saab">星期二</option>
								<option value="saab">星期三</option>
								<option value="fiat">星期四</option>
								<option value="audi">星期五</option>
								<option value="audi">星期六</option>
								<option value="audi" selected="selected">星期日</option>
						</select></td>
					</tr>
					<tr id="resumeMyIntroForm">
						<td id="resumeMyIntro">自我简绍:</td>
						<td><textarea style="width: 352px; height: 87px;"
								name="blog_sign_name" id="blog_sign_name" cols="45" rows="3"
								class="resumeTextarea"></textarea></td>
					</tr>
					<tr id="resumeMyIntroForm">
						<td id="resumeMyIntro"></td>
						<td><input id="comBtn" type="submit" value="注册"
							class="resumeBtn" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	sss XXX

	<%@include file="bottom.jsp"%>
</body>
</html>
