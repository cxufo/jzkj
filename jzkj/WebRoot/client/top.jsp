<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%request.setCharacterEncoding("UTF-8"); %>
<%
	String topPath = request.getContextPath();
	String topBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ topPath + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=topBasePath%>">

<title>topbar</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=topBasePath%>css/zljmain.css">
</head>

<body>
	<div class="jz-topbar">
		<div class="jz-topbar-content">
			<div class="jz-topbar-left">
				<span><a href="javascript:;">手机客服端</a></span>
				<span><a href="javascript:;">关于我们</a></span>
			</div>
			<div class="jz-topbar-right">
				<span><a href="client/login.jsp">登录</a></span>
				<span><a href="client/personalregister.jsp">注册</a></span>
				<span><a href="userCenter">用户中心</a></span>
			</div>
		</div>
	</div>

</body>
</html>
