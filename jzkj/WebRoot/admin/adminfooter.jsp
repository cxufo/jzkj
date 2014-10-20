<%-- <%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java"  import="java.util.*"  contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String footMenuBarpath = request.getContextPath();
	String footBasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ footMenuBarpath + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=footBasePath%>">
<title>footBar</title>
<link rel="stylesheet" type="text/css"
	href="<%=footBasePath%>css/cxzhao.css">
</head>

<body>
			<div class="c-div-buttom"
		style="height:100px;width:100%;background:#DEDEDE;border-top: 1px solid #070707;">
		<div
			style="width:100%;height:40px;text-align:center;font-size:14px;margin-top:20px; float:left;">
			<span>贵州一特电子商务有限公司,无微不至的服务给最美的你！</span>
			<div id="footer" class="foot"
				style="padding:10px auto;background-color:#DEDEDE;color:#222222;">
				<ul class="links ft">
					<li class="links_item no_extra"><a
						style="color:#222222; font-size: 14px;"
						href="<%=footBasePath%>client/introduction.jsp" target="_blank">关于ET</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="<%=footBasePath%>client/etservice.jsp" target="_blank">服务协议</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="javascript:;" target="_blank">运营规范</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="<%=footBasePath%>client/clientcontactus.jsp" target="_blank">联系我们</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://wpa.qq.com/msgrd?V=1&Uin=3013754156&Site=121ask.com&Menu=yes"
						target="_blank">在线客服</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="mailto:3013754156@qq.com" target="_blank">联系邮箱</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://www.miitbeian.gov.cn/" target="_blank">黔ICP14004114号</a></li>
					<li class="links_item"><p class="copyright"
							style="font-size: 14px;">Copyright © 2014-2024 GuiZhouET. All
							Rights Reserved.</p></li>
				</ul>
			</div>
		</div>
	</div>

	
</body>

</html>
