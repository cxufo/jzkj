<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>taskDetail</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/taskdetail.css">
	
	<script type="text/javascript" src="<%=basePath%>js/taskdetail.js"></script>
	

  </head>
  
  <body>
    
	<!--在这里引入头部  -->
	<%@include file="top.jsp"%>
		
	<!--在这里引入标题及导航  -->
	<%@include file="title.jsp"%>
	
	
	<!-- 详情页主体 -->
	<div class = "c-div-body">	
		<div class = "c-div-mian">
		
			<!-- 当前位置 -->
			<div class = "c-div-currentLocation">
				<a>当前位置</a> >>
				<a href="<%=basePath%>index.jsp">兼职招聘</a> >>
				<a>兼职详情</a>
			</div>
			
			<!-- 报名 -->
			<div class = "c-div-signUp">
				<a href="javascript:;">报名</a>
				<span>招聘阿里巴巴寒假实习生</span>
			</div>
			
			<!-- 岗位基本信息 -->
			<div class = "c-div-jobDetails">
				<span>岗位基本信息:</span><br>
				
				<div class = "c-div-detailsContent"> <!-- 岗位基本信息  具体内容 -->
				
					<div style = "width:100%;height:392px;">
						<div style = "display: inline-block;float: left;">	<!-- 左上侧信息 -->
							<span>招聘单位:</span>
							<span>阿里巴巴集团</span><br>
							<span>招聘职位:</span>
							<span>程序员</span><br>
							<span>可预约人数:</span>
							<span>30人</span><br>
							<span>性别:</span>
							<span>女</span><br>
							<span>资薪:</span>
							<span>6000元/月</span><br>
							<span>面试时间:</span>
							<span>2015-5-30</span><br>
							<span>工作时间:</span>
							<span>星期一至星期五</span><br>
						</div>
						
						<div style = "float:right;margin-right: 136px;">	<!-- 右上侧信息 -->
							<span>兼职类别:</span>
							<span>实习生</span><br>
							<span>招聘人数:</span>
							<span>20人</span><br>
							<span>学历:</span>
							<span>本科</span><br>
							<span>年龄:</span>
							<span>20-26</span><br>
							<span>是否收费:</span>
							<span>否</span><br>
							<span>标签:</span>
							<span>全职</span><br> 
						</div>
					</div>
					
					<div>	<!-- 下侧信息 -->
						<span>面试地点:</span>
						<span>花溪公园</span><br>
						<span style = "display: inline-block;float:left;">职位描述:</span>
						<div style = "margin: 4px 0px 30px 98px;line-height: 48px;">
							<span>精通C++、C语言，了解分布式数据库原理，了解云计算
							基本原理。吃苦耐劳，有称为一名屌丝程序员的终极梦想，能加班，
							无怨言，必须有作为一名宅男的基本素质，心中的女神最好是老干妈。
							</span>
						</div>
					</div>
					
					<div class = "c-div-signUpBtn">  <!-- 我要报名  按钮 -->
						<a href = "javascript:;">报名</a>
					</div>
					
				</div>
			</div>
			
			<!-- 温馨提示 -->
			<div class = "c-div-prompt">
				<span>温馨提示</span>
				<div>
					1、咨询工作时间： 9:00-18:00，其余时间均无法接受短信咨询<br>
					2、会员制度规定： 退订未在8小时之前退且预约后无故不到，给予停卡1-3个月<br>
					注： （提前8小时退订： 登陆个人管理中心→预约退订管理→退订）<br>
					3、每次面试前请同学们做好充分的面试准备<br>
					4、面试时不要紧张，一颗平常心，面试注重仪容仪表<br>
				</div>
			</div>
			
			<!-- 评价 -->
			<div class = "c-div-evaluation">
				
				<div class = "c-div-evaluationTitle">
					<span>评价</span>
					<div id = "i-div-star" class = "c-div-star">
						<a href = "javascript:;"><img alt="1" src="<%=basePath%>image/starw.png"></a>
						<a href = "javascript:;"><img alt="2" src="<%=basePath%>image/starw.png"></a>
						<a href = "javascript:;"><img alt="3" src="<%=basePath%>image/starw.png"></a>
						<a href = "javascript:;"><img alt="4" src="<%=basePath%>image/starw.png"></a>
						<a href = "javascript:;"><img alt="5" src="<%=basePath%>image/starw.png"></a>
					</div>
					<span id = "i-span-starNum"></span>
				</div>
				<div class = "c-div-evaluationContent">
					<form id = "i-form-evaluation" action="">
						<textarea rows="" cols=""></textarea><br>
						<input type="submit" value = "提交" />
					</form>
				</div>
				
			</div>
		
		</div>
	</div>
	
	
	
	
	
	<!--在这里引入底部  -->
	<%@include file="bottom.jsp"%>
	
  </body>
</html>
