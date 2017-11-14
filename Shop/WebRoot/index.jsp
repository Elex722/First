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
	<h2>产品列表</h2>
	<table border="1">
		<tr>
			<td>产品名称</td>
			<td>产品描述</td>
			<td>类别</td>
			<td>说明</td>
			<td>操作</td>
		</tr>
		<c:forEach var="p" items="${list}">
			<tr>
				<td>${p.productname}</td>
				<td>${p.descs}</td>
				<td>${p.cata.name}</td>
				<td>${p.cata.explain}</td>
				<td><a href="delInfo?id=${p.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="getAll?pageindex=1">首页</a>
	<a href="getAll?pageindex=${pageindex-1}">上一页</a>
	<a href="getAll?pageindex=${pageindex+1}">下一页</a>
	<a href="getAll?pageindex=${countpage}">末页</a>
	<br />
	<a href="addJsp.jsp">新增</a>
</body>
</html>
