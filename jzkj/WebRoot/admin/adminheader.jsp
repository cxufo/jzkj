<%-- <%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java"  import="java.util.*"  contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String topMenuBarpath = request.getContextPath();
	String topBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ topMenuBarpath + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=topBasePath%>">
<title>TopBar</title>
<link rel="stylesheet" type="text/css"
	href="<%=topBasePath%>css/adminpublic.css">
</head>

<body>
	<div id="header" class="head">
		<div class="head_box" style="">
			<div class="inner wrp">
			    <div class="title" style="float:left;height:50px;margin-top:10px;text-align:left;">
			          <h1>兼职空间后台管理系统</h1>
			    </div>
				<div class="account-info" style="float:right;width:230px;height:50px;margin-top:25px;">
					<div class="cx-nickname-1" >
						<a class="cx-nickname-2" style="float:left;width:170px;height:100%;" href="<%=topBasePath%>/">当前管理员:赵晨曦</a>
					</div>
					<div class="cx-leave-1">
						<a id="logout" class="cx-leave-2" style="float:left;width:50px;height:100%;" href="<%=topBasePath%>admin/login.jsp">退出</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
