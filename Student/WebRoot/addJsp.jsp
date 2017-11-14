<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'addJsp.jsp' starting page</title>

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
		<h2>添加常见问题</h2>
		<form action="addInfo" method="post">
			<table>
				<tr>
					<td>分类:</td>
					<td><select name="cname">
							<c:forEach var="c" items="${list}">
								<option value="${c.id}">${c.cname}</option>
							</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>标题:</td>
					<td><input type="text" name="title">
					</td>
				</tr>
				<tr>
					<td>内容:</td>
					<td><textarea name="content"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="保存"> <input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
