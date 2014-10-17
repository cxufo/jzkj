<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String titlePath = request.getContextPath();
String titleBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+titlePath+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=titleBasePath%>">
    
    <title>My JSP 'title.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="<%=titleBasePath%>css/title.css">
	<link rel="stylesheet" type="text/css" href="<%=titleBasePath%>css/zljmain.css">


  </head>
  
  <body style = "text-align: center;">
  	
  	<!-- 顶部logo 及搜索条 -->
    <div class = "c-div-header">
    	<div class = "c-div-content">
	    	<div class = "c-div-left">
	    		<img alt="兼职空间" src="<%=titleBasePath%>image/logo.png">
	    	</div>
	    	
	    	<div class = "c-div-right">
	    		<form action="http://www.baidu.com/baidu" target="_blank">
	    			<input id = "i-input-query" type="text" name="word" />
	    			<button id = "i-button-query">搜索</button>
	    		</form>
	    	</div>
    	</div>
    </div>
    
    <!-- 导航栏 -->
    <div class = "c-div-leader">
    	<div class = "c-div-detail">
    	
    		<div class = "c-div-options">
	    		<a id = "i-a-partTime" class = "c-a-options" href = "<%=titleBasePath%>index.jsp">兼职招聘</a>
	    		<a id = "i-a-fullTime" class = "c-a-options" href = "<%=titleBasePath%>client/fulljobindex.jsp">全职招聘</a>
    		</div>
    		
    		<div class = "c-div-publish">
    			<a class = "c-a-publish" href = "<%=titleBasePath%>client/partresumepublish.jsp" style = "background-image: url(<%=titleBasePath%>image/lead1.png)">发布简历</a>
    			<a class = "c-a-publish" href = "<%=titleBasePath%>client/partjobpublish.jsp" style = "background-image: url(<%=titleBasePath%>image/lead2.png)">发布职位</a>
    		</div>
    	</div>
    </div>
    
  </body>
</html>
