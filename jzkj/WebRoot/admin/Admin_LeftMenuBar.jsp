<%-- <%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String leftMenuBarpath = request.getContextPath();
	String leftBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ leftMenuBarpath + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=leftBasePath%>">
<title>菜单</title>
<link rel="stylesheet" type="text/css"
	href="<%=leftBasePath%>css/adminpublic.css">
</head>
<body>
	<div class="col_side">
		<div class="menu_box" id="menuBar">
			<dl class="menu no_extra ">
				<dt class="menu_title">
					<span class="menu_title_icon"><img
						src="<%=leftBasePath%>image/gongnengIcon.png"/></span>会员管理
				</dt>
				<dd class="menu_item ">
					<a href="<%=leftBasePath%>admin/user.jsp">注册用户</a>
				</dd>
				<dd class="menu_item ">
					<a href="<%=leftBasePath%>admin/member.jsp">平台会员</a>
				</dd>
				<dd class="menu_item selected">
					<a href="<%=leftBasePath%>admin/setuser.jsp">会员设置</a>
				</dd>
				</dd>
			</dl>
			<dl class="menu ">
				<dt class="menu_title">
					<span class="menu_title_icon"><img
						src="<%=leftBasePath%>image/gongnengIcon.png" /></span> 企业管理
				</dt>
				<dd class="menu_item selected">
					<a href="<%=leftBasePath%>admin/cuser.jsp">注册企业</a>
				</dd>
				<dd class="menu_item ">
					<a href="<%=leftBasePath%>admin/cmember.jsp">企业会员</a>
				</dd>
				<dd class="menu_item ">
					<a href="<%=leftBasePath%>admin/setcompany.jsp">企业设置</a>
				</dd>				
			</dl>
			<dl class="menu ">
				<dt class="menu_title">
					<span class="menu_title_icon"><img
						src="<%=leftBasePath%>image/gongnengIcon.png"/></span>职位管理
				</dt>
				<dd class="menu_item">
					<a href="<%=leftBasePath%>admin/addpjob.jsp">发布兼职</a>
				</dd>	
				<dd class="menu_item">
					<a href="<%=leftBasePath%>admin/statisticspjob.jsp">职位统计</a>
				</dd>
				<dd class="menu_item">
					<a href="<%=leftBasePath%>admin/QueryNew.jsp">职位推荐</a>
				</dd>
				<dd class="menu_item selected">
					<a href="<%=leftBasePath%>admin/querypjob.jsp">兼职查询</a>
				</dd>
				<dd class="menu_item ">
					<a href="<%=leftBasePath%>admin/addpjobtype.jsp">职位类别</a>
				</dd>			
			</dl>
			<dl class="menu ">
				<dt class="menu_title">
					<span class="menu_title_icon"><img
						src="<%=leftBasePath%>image/gongnengIcon.png" /></span>简历管理
				</dt>
				<dd class="menu_item selected">
					<a href="<%=leftBasePath%>admin/#">兼职简历</a>
				</dd>
				<dd class="menu_item selected">
					<a href="<%=leftBasePath%>admin/#">全职简历</a>
				</dd>				
			</dl>
			<dl class="menu">
				<dt class="menu_title">
					<span class="menu_title_icon"><img
						src="<%=leftBasePath%>image/gongnengIcon.png" /></span>企业执照
				</dt>
				<dd class="menu_item selected">
					<a href="<%=leftBasePath%>/#">执照查询</a>
				</dd>
		</div>
	</div>

</body>

</html>
