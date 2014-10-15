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

<title>修改兼职简历</title>

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
	src="<%=BasePath%>My97DatePicker/WdatePicker.js"></script>
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
						<td><input class="resumeText" type="text" 
							name="partResumeName" /></td>
					</tr>
					<tr>
						<td>性别:</td>
						<td><input class="resumeRadio" type="radio" value="man"
							checked name="partResumeSex" /><span>男</span><input
							class="resumeRadio" type="radio" value="women"
							name="partResumeSex" /><span>女</span></td>
					</tr>
					<tr>
						<td>出生日期:</td>
						<td><input class="resumeText" type="text" name="partResume"
							id="creattimeid" value="" onclick="WdatePicker()" /></td>
					</tr>
					<tr>
						<td>学历:</td>
						<td><select name="resumeEducation">
						<option value="undergraduate" selected="selected">本科</option>
								<option value="heightSchool">高中</option>
								<option value="specialty">专科</option>
								<option value="master">硕士</option>
								<option value="doctor">博士</option>
								<option value="unlimited">不限</option>
						</select></td>
					</tr>
					<tr>
						<td>所在地:</td>
						<td><input class="resumeText" type="text"
							placeholder="贵州省贵阳市南明区沙冲南路" name="partResumeName" /></td>
					</tr>
					<tr>
						<td>职位类别:</td>
						<td><select name="resumePosition">
						<option value="lj" selected="selected">老师/家教</option>
								<option value="cd">促销/导购</option>
								<option value="cj">传单/举牌</option>
								<option value="sx">市调/宣传</option>
								<option value="ml">模特/礼仪</option>
								<option value="bz">表演/主持</option>
								<option value="fb">翻译/编辑</option>
								<option value="wk">文员/客服</option>
								<option value="xy">销售/业务</option>
								<option value="ms">美工/设计</option>
								<option value="kc">会计/出纳</option>
								<option value="iy">IT类店员/营业员</option>
								<option value="jg">技工/工人</option>
								<option value="fz">服务生/钟点工</option>
								<option value="other">其他</option>
						</select></td>
					</tr>
					<tr>
						<td>期望薪水:</td>
						<td><select name="resumeExpectSalary">
								<option value="10to50">10-50</option>
								<option value="50to70" selected="selected">50-70</option>
								<option value="80to100">80-100</option>
								<option value="100to200" >100-200</option>
								<option value="200to500">200-500</option>
								<option value="500to1000">500-1000</option>
								<option value="1000to">1000以上</option>
						</select></td>
					</tr>
					<tr>
						<td>期望工作地点:</td>
						<td>贵阳市-<select name="resumeExpectPlaceOfwork">
								<option value="volvo">花溪区</option>
								<option value="saab">南明区</option>
								<option value="saab">云岩区</option>
								<option value="fiat">白云区</option>
								<option value="audi">小河区</option>
								<option value="audi">乌当区</option>
								<option value="volvo">观山湖区</option>
								<option value="audi" selected="selected">白云区</option>
								<option value="saab">息烽县</option>
								<option value="saab">修文县</option>
								<option value="fiat">开阳县</option>
								<option value="audi">清镇市</option>
						</select> <!-- <input class="resumeText" type="text"
							placeholder="贵州省贵阳市南明区沙冲南路" name="partResumeName" /> --></td>
					</tr>
					<tr>
						<td>期望工作时间:</td>
						<td><select name="resumeExpectWorkingTime">
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
								name="resumeSelfIntroduction" id="resumeSelfIntroduction" cols="45" rows="8"
								class="resumeTextarea"></textarea></td>
					</tr>
					<tr id="resumeMyIntroForm">
						<td id="resumeMyIntro"></td>
						<td><input id="comBtn" type="submit" value="修改"
							class="resumeBtn" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

	<%@include file="bottom.jsp"%>
</body>
</html>
