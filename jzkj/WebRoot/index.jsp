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
				
			</div>
			
			
			
			<!-- 我要报名 -->
			<div class = "c-div-apply">
				<ul class = "c-ul-applyList">
					<li class = "c-li-leftApply">
						<span>标题：</span>
						<font>小学作文老师</font><br>
						<span>兼职类型：</span>
						<font>普通兼职</font><br>
						<span>工作时间：</span>
						<font>2014-10-14至2014-11-14 8:30至17:30</font><br>
						<span>工作地点：</span>
						<font>贵阳云岩区普陀路凯旋门大厦A座21楼3号</font><br>
						<span>人数：</span>
						<font>3人</font><br>
						<span>资薪：</span>
						<font>100元/次</font><br>
						<a href = "javascript:;">我要报名</a>
					</li>
					
					<li>
						<span>标题：</span>
						<font>招钢琴教师和钢琴陪练</font><br>
						<span>兼职类型：</span>
						<font>普通兼职</font><br>
						<span>工作时间：</span>
						<font>2014-10-14至2014-11-14 8:30至17:30</font><br>
						<span>工作地点：</span>
						<font>白云区大山洞白云中路</font><br>
						<span>人数：</span>
						<font>5人</font><br>
						<span>资薪：</span>
						<font>55元/小时</font><br>
						<a href = "javascript:;">我要报名</a>
					</li>
					
					<li class = "c-li-leftApply">
						<span>标题：</span>
						<font>兼职招聘派单促销</font><br>
						<span>兼职类型：</span>
						<font>普通兼职</font><br>
						<span>工作时间：</span>
						<font>星期一、星期二、星期三、星期四、星期五、星期六、星期日</font><br>
						<span>工作地点：</span>
						<font>云岩-中华北路</font><br>
						<span>人数：</span>
						<font>15人</font><br>
						<span>资薪：</span>
						<font>80元/天 ，日结</font><br>
						<a href = "javascript:;">我要报名</a>
					</li>
					
					<li>
						<span>标题：</span>
						<font>学生兼职</font><br>
						<span>兼职类型：</span>
						<font>普通兼职</font><br>
						<span>工作时间：</span>
						<font>2014-10-13至2014-10-31 8:30至17:30</font><br>
						<span>工作地点：</span>
						<font>南明区朝阳洞路49号</font><br>
						<span>人数：</span>
						<font>10人</font><br>
						<span>资薪：</span>
						<font>50元/天</font><br>
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
