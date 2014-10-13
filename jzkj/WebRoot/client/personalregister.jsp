<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String registerPath = request.getContextPath();
	String registerBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ registerPath + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=registerBasePath%>">

<title>个人注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=registerBasePath%>css/zljmain.css">
<link rel="stylesheet" type="text/css"
	href="<%=registerBasePath%>css/zljregister.css">
<link rel="stylesheet" type="text/css"
	href="<%=registerBasePath%>css/title.css">
<link rel="stylesheet" type="text/css"
	href="<%=registerBasePath%>css/common.css">
<script src="<%=registerBasePath%>js/ zlj-personalregister.js"></script>



<style type="text/css">
.c-div-leader a {
	font-size: 28px;
	color: #5F5F5F;
	font-family: "隶书";
}
</style>
</head>

<body style="background-color: #F3F3F3;">
	<div id="agreeFrom" style="position:fixed;display:none;">
		<div
			style="position:fixed;width:100%;height:100%;background-color:#000000; z-index: 1000;opacity:0.5;
filter:Alpha(opacity=50); /* IE8 以及更早的浏览器 */">
		</div>
		<div
			style="position:fixed;left: 453px; top: 139px; visibility: visible;  width: 716px; z-index: 1987;opacity:10;
filter:Alpha(opacity=100); /* IE8 以及更早的浏览器 */"
			class="">
			<table
				class="ui_border ui_state_visible ui_state_lock ui_state_focus">
				<tbody>
					<tr>
						<td class="ui_lt"></td>
						<td class="ui_t"></td>
						<td class="ui_rt"></td>
					</tr>
					<tr>
						<td class="ui_l"></td>
						<td class="ui_c"><div class="ui_inner">
								<table class="ui_dialog">
									<tbody>
										<tr>
											<td colspan="2"><div class="ui_title_bar">
													<div class="ui_title" unselectable="on"
														style="cursor: move;">校园无忧网（www.school51.com）服务协议</div>
													<div class="ui_title_buttons">
														<a id="regAgreeFormClose" class="ui_close"
															href="javascript:void(0);" title="关闭(esc键)"
															style="display: inline-block;">×</a>
													</div>
												</div></td>
										</tr>
										<tr>
											<td class="ui_icon" style="display:block ;"></td>
											<td class="ui_main" style="width: 700px; height: 400px;"><div
													class="ui_content ui_state_full" style="padding: 10px;">
													<div class="ui_loading"
														style="display: none; position: absolute; background-color: rgb(255, 255, 255); opacity: 0; z-index: 1; width: 700px; height: 400px; background-position: initial initial; background-repeat: initial initial;">
														<span>loading...</span>
													</div>
													<iframe name="edit_class" frameborder="0"
														src="http://www.school51.com/about/agreement.html"
														style="width: 100%; height: 100%; border: 0px none;"></iframe>
												</div></td>
										</tr>
										<tr>
											<td colspan="2"><div class="ui_buttons"
													style="display: inline-block;"></div></td>
										</tr>
									</tbody>
								</table>
							</div></td>
						<td class="ui_r"></td>
					</tr>
					<tr>
						<td class="ui_lb"></td>
						<td class="ui_b"></td>
						<td class="ui_rb" style="cursor: se-resize;"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<!--顶部导航栏  -->
	<%@include file="top.jsp"%>
	<!-- 顶部logo 及搜索条 -->
	<div class="c-div-header">
		<div class="c-div-content">
			<div class="c-div-left">
				<a href="javascript:;"> <img alt="兼职空间"
					src="<%=registerBasePath%>image/logo.png">
				</a>
			</div>

			<div class="c-div-right">
				<form action="">
					<input id="i-input-query" type="text" />
					<button id="i-button-query">搜索</button>
				</form>
			</div>
		</div>
	</div>

	<!-- 导航栏 -->
	<div class="c-div-leader">
		<div class="c-div-detail">
			<div class="c-div-options">
				<a class="c-a-options" href="javascript:;">兼职招聘</a> <a
					class="c-a-options" href="javascript:;">全职招聘</a>
			</div>

			<div class="c-div-publish">
				<a class="c-a-publish" href="client/companyregister.jsp"
					id="com-reg-btn"
					style="background-image: url(<%=registerBasePath%>image/lead1.png)">企业注册</a>
				<a class="c-a-publish" href="client/personalregister.jsp"
					id="per-reg-btn"
					style="background-image: url(<%=registerBasePath%>image/lead2.png)">个人注册</a>
			</div>
		</div>
	</div>

	<div id="register-frame" class="register-frame"
		style="background-color: #FFFFFF">
		<div class="reg-title">
			<div class="reg-title-left"
				style="background-image: url(<%=registerBasePath%>image/reg-title.png);">注
				册</div>
			<div class="reg-title-right">个人注册</div>
		</div>

		<form action="" method="post" id="comRegisterForm">
			<div id="comName" class="regItem">
				<div class="regLable">
					<b class="redStar">*</b>用户名：
				</div>
				<div class="regInput">
					<input id="regName" name="regName" class="regtext" type="text">
				</div>
				<div id="regNameRemind" class="regRemind">4-50位字符(最多25个中文)，支持中英文，数字组合</div>
			</div>
			<div id="comName" class="regItem">
				<div class="regLable">
					<b class="redStar">*</b>密码：
				</div>
				<div class="regInput">
					<input id="regPsw" name="regPsw" class="regtext"
						onpaste="return false" oncontextmenu="return false;"
						type="password">
				</div>
				<div id="regPswRemind" class="regRemind">6-18位字符，可使用字母、数字、下划线的组合</div>
			</div>
			<div id="comName" class="regItem">
				<div class="regLable">
					<b class="redStar">*</b>重复密码：
				</div>
				<div class="regInput">
					<input id="regPswRepeat" name="regPsw" class="regtext"
						onpaste="return false" oncontextmenu="return false;"
						type="password">
				</div>
				<div id="regPswRemindRepeat" class="regRemind">两次输入密码不一致！</div>
			</div>
			<div id="comName" class="regItem">
				<div class="regLable">
					<b class="redStar">*</b>联系人电话：
				</div>
				<div class="regInput">
					<input id="regLinkPhone" name="regName" class="regtext" type="text">
				</div>
				<div class="regRemind" id="regLinkPhoneRemind">请填写您常用电话/手机，以便我们和您联系，如：0851-3876233或135xxxx6765</div>
			</div>

			<div id="comName" class="regItem">
				<div class="regLable">
					<b class="redStar">*</b>邮箱：
				</div>
				<div class="regInput">
					<input id="regEmail" name="regName" class="regtext" type="text">
				</div>
				<div id="regEmailRemind" class="regRemind">请填写您常用邮箱，我们将通过邮箱进行验证</div>
			</div>
			<div id="comAdress" class="regItem">
				<div class="regAgreeForm">
					<input type="checkbox" id="regCheckbox" class="regCheckbox"
						name="agreement" value="协议" class="regAgree" />我已阅读并同意<a
						id="regAgree" href="javascript:;">《兼职空间用户注册协议》</a>
				</div>
			</div>
			<div class="regItem">
				<div class="regBtnForm">
					<input id="comBtn" type="submit" value="注册" class="regBtn" />
				</div>
			</div>
		</form>
	</div>





	<!--顶部导航栏  -->
	<%@include file="bottom.jsp"%>
</body>
</html>
