<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
						<c:forEach items="${requestScope.jobTypelist}" var="jobTypeList">
							<a href="javascript:;"><c:out value="${jobTypeList.jobType}"/></a>&nbsp;&nbsp;
					    </c:forEach>
						</div>
					</div>
					<div class = "c-div-partTimeList">
						<div class = "c-div-listTitle">兼职区域
						</div>
						<div class = "c-div-listDetail">
						<c:forEach items="${requestScope.areaList}" var="areaList">
							<a href="javascript:;"><c:out value="${areaList.area}"/></a>&nbsp;&nbsp;
						</c:forEach>
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
							<a href="javascript:;">长期</a>&nbsp;&nbsp;
							<a href="javascript:;">日职</a>&nbsp;&nbsp;
						</div>
					</div>
				</div>
				
			</div>
			
			<!-- 我要报名 -->
			<div class = "c-div-apply">
				<ul class = "c-ul-applyList">
				    <c:forEach items="${requestScope.pjoblist}" var="pjoblist" varStatus="status">

				    <c:choose>
				    <c:when test="${status.index%2==0}">
					<li class = "c-li-leftApply">
						<span>标题：</span>
						<font><c:out value="${pjoblist.jobTitle}"/></font><br>
						<span>兼职类型：</span>
						<font><c:out value="${pjoblist.ptjType}"/></font><br>
						<span>工作时间：</span>
						<font><c:out value="${pjoblist.workTime}"/></font><br>
						<span>工作地点：</span>
						<font><c:out value="${pjoblist.workPlace}"/></font><br>
						<span>人数：</span>
						<font><c:out value="${pjoblist.rCount}"/></font><br>
						<span>资薪：</span>
						<font><c:out value="${pjoblist.wage}"/></font><br>
						<a href = "javascript:;">我要报名</a>
					</li>
					</c:when>
					<c:otherwise>
					   <li>
						<span>标题：</span>
						<font><c:out value="${pjoblist.jobTitle}"/></font><br>
						<span>兼职类型：</span>
						<font><c:out value="${pjoblist.ptjType}"/></font><br>
						<span>工作时间：</span>
						<font><c:out value="${pjoblist.workTime}"/></font><br>
						<span>工作地点：</span>
						<font><c:out value="${pjoblist.workPlace}"/></font><br>
						<span>人数：</span>
						<font><c:out value="${pjoblist.rCount}"/></font><br>
						<span>资薪：</span>
						<font><c:out value="${pjoblist.wage}"/></font><br>
						<a href = "javascript:;">我要报名</a>
					</li>
					</c:otherwise>
					</c:choose>
					</c:forEach>			
				</ul>
			</div>
			
			
			<!-- 分页 -->
			<div class = "c-div-paging">
				<a href = "">上一页</a>
				<a href = "index?page=true&currentPage=${requestScope.pagelist[0].currentPage}" class = "paging-active">${requestScope.pagelist[0].currentPage}</a>
				<a href = "index?page=true&currentPage=${requestScope.pagelist[1].currentPage}">${requestScope.pagelist[1].currentPage}</a>
				<a href = "index?page=true&currentPage=${requestScope.pagelist[2].currentPage}">${requestScope.pagelist[2].currentPage}</a>
				<a href = "index?page=true&currentPage=${requestScope.pagelist[3].currentPage}">${requestScope.pagelist[3].currentPage}</a>
				<a style = "border-style: none; ">······</a>
				<a href = "index?currentPage=${requestScope.currentPage+1}&nextPage=true">下一页</a>
			</div>
			
		</div>		
	</div>
	
	
	<!--在这里引入底部  -->
	<%@include file="client/bottom.jsp"%>
	
  </body>
</html>
