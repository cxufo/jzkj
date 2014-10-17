<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	String Path = request.getContextPath();
	String BasePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ Path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=BasePath%>">

<title>我的工作-待评价</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljresume.css">
<link rel="stylesheet" type="text/css"
	href="<%=BasePath%>css/zljmywork.css">
<script language="javascript" type="text/javascript"
	src="<%=BasePath%>My97DatePicker/WdatePicker.js"></script>
</head>

<body style="background-color: #F3F3F3;">

	<div class="resumeTop"><%@include file="personalmenubar.jsp"%></div>
	<div class="contentBody">
		<div class="centent-title">
			<div class="centent-title-left"
				style="background-image: url(<%=BasePath%>image/reg-title.png);">我的工作</div>
			<div class="centent-title-right">待评价</div>
		</div>
		<div class="cententForm" name="b2" id="huodedegongzuo"
			style="/* border: 1px solid green; */">
			<div class="c-div-apply">
				<ul class="c-ul-applyList">
					<li class="c-li-singular"><span>标题：</span> <font>到花溪贵大派发传单</font><br>
						<span>兼职类型：</span> <font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a id="a1"
						href="javascript:;">我要评价</a></li>
					<li><span>标题：</span> <font>到花溪贵大派发传单</font><br> <span>兼职类型：</span>
						<font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a
						href="javascript:;">我要评价</a></li>
					<li><span>标题：</span> <font>到花溪贵大派发传单</font><br> <span>兼职类型：</span>
						<font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a
						href="javascript:;">我要评价</a></li>
					<li class="c-li-singular"><span>标题：</span> <font>到花溪贵大派发传单</font><br>
						<span>兼职类型：</span> <font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a id="a1"
						href="javascript:;">我要评价</a></li>
					<li><span>标题：</span> <font>到花溪贵大派发传单</font><br> <span>兼职类型：</span>
						<font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a
						href="javascript:;">我要评价</a></li>
					<li><span>标题：</span> <font>到花溪贵大派发传单</font><br> <span>兼职类型：</span>
						<font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a
						href="javascript:;">我要评价</a></li>
					<li class="c-li-singular"><span>标题：</span> <font>到花溪贵大派发传单</font><br>
						<span>兼职类型：</span> <font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a id="a1"
						href="javascript:;">我要评价</a></li>
					<li><span>标题：</span> <font>到花溪贵大派发传单</font><br> <span>兼职类型：</span>
						<font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a
						href="javascript:;">我要评价</a></li>
					<li><span>标题：</span> <font>到花溪贵大派发传单</font><br> <span>兼职类型：</span>
						<font>派发传单</font><br> <span>工作时间：</span> <font>星期一、星期二</font><br>
						<span>工作地点：</span> <font>贵阳花溪</font><br> <span>人数：</span> <font>5</font><br>
						<span>资薪：</span> <font>100元/每天</font><br> <a
						href="javascript:;">我要评价</a></li>
				</ul>
				<!-- 分页 -->
				<div class="c-div-paging">
					<a href="javascript:;">上一页</a> <a href="javascript:;">1</a>
					<!-- <label style="height:42px;width:90px;background-color:#949494 ;border:1px siolid   #D4D4D4;line-height:42px;font-size:18px;text-align:center;margin: 0 10px 0 20px; value=" 0"></label>
					<input
						style="height:42px;width:90px;background-color:#949494 ;border:1px siolid   #D4D4D4;line-height:42px;font-size:18px;text-align:center;margin: 0 10px 0 20px; value=" 0"/>
					 -->
					<a href="javascript:;">下一页</a>
				</div>
			</div>

		</div>
	</div>

	<%@include file="bottom.jsp"%>
</body>
</html>
