<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>

<body>
	<!--在这里引入头部  -->
	<%@include file="top.jsp"%>
	<div class="jz-body">
		<div class="jz-loginjia">
			<div class="jz-loginkuang">
				<div class="jz-login-login">登 录</div>
				<form action="Login" method="post">
							<div class="jz-login-name">
								<div class="login-span">用户名：</div>
								<input id="" class="login_name" type="text"
									value="<c:out value="${requestScope.username}"/>" name="loginName" />
							</div>
							<div class="jz-login-psw">
								<div class="login-span">密&nbsp;码 :</div>
								<input id="" class="login_name" type="password" name="loginPsw" value="<c:out value="${requestScope.password}"/>"/>
							</div>
							<div class="jz-login-choise">
								<div class="login-choise">
									<div class="choise-readio">					    
										<input type="radio" name="usertype" checked="checked" value="person" />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp个人用户
									</div>
									<div class="choise-readio">
										<input type="radio" name="usertype" value="company" />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp企业用户
									</div>
									<div class="choise-readio">
										<input type="checkbox" checked="checked" name="remberPassword" value="yes" />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp记住密码
									</div>
								</div>
                               <c:choose>
                                <c:when test="${requestScope.level!=null}"> 
								<div class="login-choise">
									<input id="login-btn" class="login-btn" name="loginbtn"
										value="已登录" type="submit">
									<script type="text/javascript">								
									</script>
								</div>
								</c:when>
								<c:when test="${requestScope.level==null}">
								<div class="login-choise">
									<input id="login-btn" class="login-btn" name="loginbtn"
										value="登录" type="submit">								
								</div>
								</c:when>
								</c:choose>
								<c:if test="${requestScope.sucess == 'failed'}">
								<script type="text/javascript">
									   alert("登录失败！请重新登录"); 								
							   </script>
							   </c:if>
			</div>
			</form>
		</div>
	</div>
	</div>
	</div>
	<!--在这里引入头部  -->
	<%@include file="bottom.jsp"%>
</body>
</html>
