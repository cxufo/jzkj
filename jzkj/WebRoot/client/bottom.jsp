<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%request.setCharacterEncoding("UTF-8"); %>
<%
	String bottomPath = request.getContextPath();
	String bottomBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ bottomPath + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=bottomBasePath%>">

<title>bottombar</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=bottomBasePath%>css/zljmain.css">
</head>

<body>
	<div class="jz-bottombar">
		<div class="jz-bottombar-1">
			<span><a href ="#">关于我们</a></span> <span><a href ="#">友情链接</a></span> <span><a href ="#">意见建议</a></span> <span>黔ICP备1547896145号-2</span>
			<span><a href ="#">贵州一特电子商务公司</a></span>
		</div>
		<div class="jz-bottombar-2">
			<span>电话：0851-3876233</span> <span>邮箱:601362638@qq.com</span>
		</div>
		<div class="jz-bottombar-3">
			Copyright © 2014-2020 et jzwy.com Inc.  All Rights Reserved.
		</div>
	</div>

</body>
</html>
