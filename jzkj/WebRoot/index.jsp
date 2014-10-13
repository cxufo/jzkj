<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>兼职空间</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
	
	<script type="text/javascript" src="<%=basePath%>js/index.js"></script>
	
	
  </head>
  
  <body>
    <!-- This is my JSP page. <br> -->
    
	<!--在这里引入头部  -->
	<%@include file="client/top.jsp"%>
		
	<!--在这里引入标题及导航  -->
	<%@include file="client/title.jsp"%>
	
	
	<!-- 首页主体 -->
	<div class = "c-div-body">	
		<div class = "c-div-mian">
		
			<!-- 招聘选项 -->
			<div class = "c-div-optionsList">
			
				<div id = "i-div-partTimeList">
					<div class = "c-div-partTimeList">
						<div class = "c-div-listTitle">兼职分类
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">学生兼职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生兼职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生兼职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生兼职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生兼职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生兼职</a>&nbsp;&nbsp;
						</div>
					</div>
					<div class = "c-div-partTimeList">
						<div class = "c-div-listTitle">兼职区域
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">南明</a>&nbsp;&nbsp;
							<a href="javascript:;">云岩</a>&nbsp;&nbsp;
							<a href="javascript:;">小河</a>&nbsp;&nbsp;
							<a href="javascript:;">花溪</a>&nbsp;&nbsp;
						</div>
					</div>
					<div class = "c-div-partTimeList">
						<div class = "c-div-listTitle">兼职时间
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">星期一</a>&nbsp;&nbsp;
							<a href="javascript:;">星期二</a>&nbsp;&nbsp;
							<a href="javascript:;">星期三</a>&nbsp;&nbsp;
							<a href="javascript:;">星期四</a>&nbsp;&nbsp;
						</div>
					</div>
					<div class = "c-div-partTimeList" style = "border-style: none;">
						<div class = "c-div-listTitle">兼职标签
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">全职</a>&nbsp;&nbsp;
							<a href="javascript:;">日职</a>&nbsp;&nbsp;
						</div>
					</div>
				</div>
				
				
				<div  id = "i-div-fullTimeList">
					<div class = "c-div-fullTimeList">
						<div class = "c-div-listTitle">全职分类
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">学生全职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生全职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生全职</a>&nbsp;&nbsp;
							<a href="javascript:;">学生全职</a>&nbsp;&nbsp;
						</div>
					</div>
					<div class = "c-div-partTimeList">
						<div class = "c-div-listTitle">全职区域
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">南明</a>&nbsp;&nbsp;
							<a href="javascript:;">云岩</a>&nbsp;&nbsp;
							<a href="javascript:;">小河</a>&nbsp;&nbsp;
							<a href="javascript:;">花溪</a>&nbsp;&nbsp;
						</div>
					</div>
					<div class = "c-div-partTimeList">
						<div class = "c-div-listTitle">全职时间
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">星期一</a>&nbsp;&nbsp;
							<a href="javascript:;">星期二</a>&nbsp;&nbsp;
							<a href="javascript:;">星期三</a>&nbsp;&nbsp;
							<a href="javascript:;">星期四</a>&nbsp;&nbsp;
						</div>
					</div>
					<div class = "c-div-partTimeList" style = "border-style: none;">
						<div class = "c-div-listTitle">全职标签
						</div>
						<div class = "c-div-listDetail">
							<a href="javascript:;">全职</a>&nbsp;&nbsp;
							<a href="javascript:;">日职</a>&nbsp;&nbsp;
						</div>
					</div>
				</div>
				
			</div>
			
			
			
			<!-- 我要报名 -->
			<div class = "c-div-apply">
				<ul class = "c-ul-applyList">
					<li class = "c-li-singular">
						<span>标题：</span>
						<font>到花溪贵大派发传单</font><br>
						<span>兼职类型：</span>
						<font>派发传单</font><br>
						<span>工作时间：</span>
						<font>星期一、星期二</font><br>
						<span>工作地点：</span>
						<font>贵阳花溪</font><br>
						<span>人数：</span>
						<font>5</font><br>
						<span>资薪：</span>
						<font>100元/每天</font><br>
						<a href = "javascript:;">我要报名</a>
					</li>
					
					<li>
						<span>标题：</span>
						<font>到花溪贵大派发传单</font><br>
						<span>兼职类型：</span>
						<font>派发传单</font><br>
						<span>工作时间：</span>
						<font>星期一、星期二</font><br>
						<span>工作地点：</span>
						<font>贵阳花溪</font><br>
						<span>人数：</span>
						<font>5</font><br>
						<span>资薪：</span>
						<font>100元/每天</font><br>
						<a href = "javascript:;">我要报名</a>
					</li>					
				</ul>
			</div>
			
			
			<!-- 分页 -->
			<div class = "c-div-paging">
				<a href = "javascript:;">上一页</a>
				<a href = "javascript:;" class = "paging-active">1</a>
				<a href = "javascript:;">2</a>
				<a href = "javascript:;">3</a>
				<a href = "javascript:;">4</a>
				<a style = "border-style: none; ">······</a>
				<a href = "javascript:;">下一页</a>
			</div>
			
		</div>		
	</div>
	
	
	<!--在这里引入底部  -->
	<%@include file="client/bottom.jsp"%>
	
  </body>
</html>
