<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String menuPath = request.getContextPath();
	String menuBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ menuPath + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=menuBasePath%>">

<title>menuBar</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=menuBasePath%>css/zljmain.css">
<style type="text/css">
.jz-menubar {
	width: 100%;
	height: 80px;
	background-color: #696969;
}

.menubar-left {
	height: 100%;
	width: 25%;
	text-align: right;
	float: left;
}
/* 
.menubar-left div  */
.leftname {
	height: 60%;
	width: 60%;
	float: right;
	text-align: center;
	line-height: 40px;
	font-size: 30px;
	font-family:"宋体";
	color: #FFFFFF;
	padding-top: 5px;
}

.leftwww {
	height: 40%;
	width: 60%;
	float: right;
	text-align: center;
	line-height: 30px;
	color: #FFFFFF;
	font-size: 18px;
	font-family:"宋体";
	margin-top: -8px;
}

.menubar-right {
	height: 100%;
	width: 75%;
	text-align: right;
	float: left;
}

.rightmenu {
	height: 100%;
}

.rightmenu li {
	height: 100%;
	min-width: 140px;
	float: right;
	font-size: 24px;
	text-align: center;
	color: #ffffff;
}

.rightmenu li a {
	font-size: 18px;
	text-align: center;
	color: #ffffff;
}

.rightmenu li img {
	height: 35px;
	width: 35px;
	margin-top: 5px;
}

.rightmenu li p {
	height: 40px;
	width: 100%;
	margin-top: -8px;
	line-height: 45px;
}

.down-menu-item {
	display: none;
}

.down-menu-list {
	height: 45px;
	width: 100%;
	background-color: #EFEFEF;
	z-index: 20000;
}

.down-menu-list:HOVER {
	background-color: #FFFFFF;
}
</style>
</head>

<body>
	<div class="jz-menubar" id="jz-menubar">
		<div class="menubar-left">
			<a href="<%=menuBasePath%>index.jsp">
				<div class="leftname">兼职空间</div>
				<div class="leftwww">www.etjzwy.com</div>
			</a>
		</div>
		<div class="menubar-right">
			<ul class="rightmenu">
				<li style="background-color: #AE09FA"><a id="userA"
					href="<%=menuBasePath%>client/partresumepublish.jsp"><img
						alt="" src="<%=menuBasePath%>image/hellomy.png">
						<p>赵承熙赵承熙</p></a>
					<div id="userL" class="down-menu-item">
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/login.jsp">退出登录</a>
						</div>
					</div></li>
				<li style="background-color: #FAAE09"><a id="workA" href="<%=menuBasePath%>client/theregistrationwork.jsp"><img
						alt="" src="<%=menuBasePath%>image/mywork.png">
						<p>我的工作</p></a>
					<div id="workL" class="down-menu-item">
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/theregistrationwork.jsp">报名的工作</a>
						</div>
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/thegetwork.jsp">获得的工作</a>
						</div>
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/therecommendwork.jsp">推荐的工作</a>
						</div>
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>#">我的评价</a>
						</div>
					</div></li>
				<li style="background-color: #93D2F5"><a id="editA"
					href="<%=menuBasePath%>client/partresumeedit.jsp"><img alt=""
						src="<%=menuBasePath%>image/editjianli.png">
						<p>修改简历</p></a>
					<div id="editL" class="down-menu-item">
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/partresumeedit.jsp">兼职简历编辑</a>
						</div>
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;"
								href="<%=menuBasePath%>client/fullresumeedit.jsp">全职简历编辑</a>
						</div>
					</div></li>
				<li style="background-color: #80F91E"><a id="fabuA"
					href="<%=menuBasePath%>client/partresumepublish.jsp"><img alt=""
						src="<%=menuBasePath%>image/fabujianli.png">
						<p>发布简历</p></a>
					<div id="fabuL" class="down-menu-item" style="z-index: 2000;">
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;z-index: 2000;"
								href="<%=menuBasePath%>client/partresumepublish.jsp">兼职简历</a>
						</div>
						<div class="down-menu-list">
							<a
								style="font-size: 18px; line-height:45px;text-align: center; color: #AFAFAF;z-index: 2000;"
								href="<%=menuBasePath%>client/fullresumepublish.jsp">全职简历</a>
						</div>
					</div></li>
				<li style="background-color: #F34F4F"><a
					href="<%=menuBasePath%>index.jsp"><img alt=""
						src="<%=menuBasePath%>image/firstpage.png">
						<p>首页</p></a></li>
			</ul>
		</div>
	</div>

	<%-- <div style="height:700px;width:100%;background-color: #fff;"></div>
	<%@include file="bottom.jsp"%> --%>
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
