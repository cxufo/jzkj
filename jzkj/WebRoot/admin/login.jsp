<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
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

<title>login</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/zljmain.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/zljlogin.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/cxzhao.css">
</head>

<body>
	<!--在这里引入头部  -->
	<%@include file="../client/top.jsp"%>

	<div class="jz-body">
	    <center>
		<div class="jz-loginjia">
			<div class="jz-loginkuang">
				<div class="jz-login-login">管理员登录</div>
				<form action="client/partresumepublish.jsp">
					<div class="jz-login-name">
						<div class="login-span">用户名：</div>
						<input id="" class="login_name" type="text" value=""
							name="loginName" />
					</div>
					<div class="jz-login-psw">
						<div class="login-span">密&nbsp&nbsp码:</div>
						<input id="" class="login_name" type="password" name="loginPsw" />
					</div>					
						<div class="cx-login-choise">

							<input id="login-btn" class="cx-login-btn" name="loginbtn"
								value="登录" type="submit" />

							<script type="text/javascript">
								
							</script>
						</div>
					</div>
			</form>
		</div>
		</center>
	</div>
	</div>
	</div>
	<!--在这里引入头部  -->
	<%@include file="../client/bottom.jsp"%>
</body>
</html>
