<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String menuPath = request.getContextPath();
String menuBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+menuPath+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=menuBasePath%>">
    
    <title>My JSP 'companymenu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="<%=menuBasePath%>css/zljmain.css">
	<link rel="stylesheet" type="text/css" href="<%=menuBasePath%>css/companymenu.css">
	
</head>

<body>
	<div class="jz-menubar" id="jz-menubar">
		<div class="menubar-left">
			<div class="leftname">兼职空间</div>
			<div class="leftwww">www.etjzwy.com</div>
		</div>
		
		<div class="menubar-right">
			<ul class="rightmenu">
				<li style="background-color: #AE09FA">
					<a id="userA" href="<%=menuBasePath%>client/companyinfo.jsp">
						<img alt="" src="image/hellomy.png">
						<p>赵承熙赵承熙赵承熙</p>
					</a>
					<div id="userL" class="down-menu-item">
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/companyinfomodify.jsp">修改公司信息</a>
						</div>
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>index.jsp">修改密码</a>
						</div>
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>index.jsp">退出登录</a>
						</div>
					</div>
				</li>
				<li style="background-color: #FAAE09">
					<a id="workA" href="<%=menuBasePath%>client/companyalljob.jsp">
						<img alt="" src="image/mywork.png">
						<p>工作记录</p>
					</a>
					<div id="workL" class="down-menu-item">
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/companyalljob.jsp">所有工作</a>
						</div>
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/companypublished.jsp">发布的工作</a>
						</div>
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/companyovertime.jsp">过期的工作</a>
						</div>
					</div>
				</li>
				<li style="background-color: #93D2F5">
					<a id="editA" href="<%=menuBasePath%>client/partjobmodify.jsp">
						<img alt="" src="image/editjianli.png">
						<p>修改工作</p>
					</a>
					<div id="editL" class="down-menu-item">
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/partjobmodify.jsp">兼职工作</a>
						</div>
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/fulljobmodify.jsp">全职工作</a>
						</div>
					</div>
				</li>
				<li style="background-color: #80F91E">
					<a id="fabuA" href="<%=menuBasePath%>client/partjobpublish.jsp">
						<img alt="" src="image/fabujianli.png">
						<p>发布工作</p>
					</a>
					<div id="fabuL" class="down-menu-item">
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/partjobpublish.jsp">兼职工作</a>
						</div>
						<div class="down-menu-list">
							<a style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/fulljobpublish.jsp">全职工作</a>
						</div>
					</div>
				</li>
				<li style="background-color: #F34F4F">
					<a href="<%=menuBasePath%>index.jsp">
						<img alt="" src="image/firstpage.png">
						<p>首页</p>
					</a>
				</li>
			</ul>
		</div>
	</div>

	
	<script>
		window.onload = function() {
			var oUserA = document.getElementById('userA');
			var oUserL = document.getElementById('userL');
			var oWorkA = document.getElementById('workA');
			var oWorkL = document.getElementById('workL');
			var oEditA = document.getElementById('editA');
			var oEditL = document.getElementById('editL');
			var oFabuA = document.getElementById('fabuA');
			var oFabuL = document.getElementById('fabuL');
			var timer = null;
			
			oUserL.style.width = oUserA.offsetWidth;
			
			oUserA.onmouseover = function() {
				oUserL.style.display = 'block';
			}
			oUserA.onmouseout = function() {
				oUserL.style.display = 'none';
			}
			oUserL.onmouseover = function() {
				oUserL.style.display = 'block';
			}
			oUserL.onmouseout = function() {
				oUserL.style.display = 'none';
			}
			oWorkA.onmouseover = function() {
				oWorkL.style.display = 'block';
			}
			oWorkA.onmouseout = function() {
				oWorkL.style.display = 'none';
			}
			oWorkL.onmouseover = function() {
				oWorkL.style.display = 'block';
			}
			oWorkL.onmouseout = function() {
				oWorkL.style.display = 'none';
			}
			oEditA.onmouseover = function() {
				oEditL.style.display = 'block';
			}
			oEditA.onmouseout = function() {
				oEditL.style.display = 'none';
			}
			oEditL.onmouseover = function() {
				oEditL.style.display = 'block';
			}
			oEditL.onmouseout = function() {
				oEditL.style.display = 'none';
			}
			oFabuA.onmouseover = function() {
				oFabuL.style.display = 'block';
			}
			oFabuA.onmouseout = function() {
				oFabuL.style.display = 'none';
			}
			oFabuL.onmouseover = function() {
				oFabuL.style.display = 'block';
			}
			oFabuL.onmouseout = function() {
				oFabuL.style.display = 'none';
			}
		}
	</script>

</body>
</html>
