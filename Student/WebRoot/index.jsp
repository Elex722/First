<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<div align="center">
		<a href="getCname">添加常见问题</a>
		<table border="1">
			<tr>
				<th>编号</th>
				<th>标题</th>
				<th>分类</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
			<c:forEach var="f" items="${list}">
				<tr>
					<td>${f.id}</td>
					<td>${f.title}</td>
					<td>${f.getC().getCname()}</td>
					<td>${f.createdate}</td>
					<td><a href="delInfo?id=${f.id}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
			<a href="getAll?pageindex=1">首页</a>
			<a href="getAll?pageindex=${pageindex-1}">上一页</a>
		<c:if test="${pageindex<countpage }">
			<a href="getPage?pageindex=${pageindex+1}">下一页</a>
			<a href="getPage?pageindex=${countpage}">末页</a>
		</c:if>
	</div>
</body>
</html>
