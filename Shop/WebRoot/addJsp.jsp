<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<form action="addInfo" method="post">
		<table border="1">
			<tr>
				<td>产品名称:</td>
				<td><input type="text" name="productname">
				</td>
			</tr>
			<tr>
				<td>产品描述:</td>
				<td><textarea name="descs"></textarea></td>
			</tr>
			<tr>
				<td>产品名称:</td>
				<td><select name="cid">
						<option value="1">数码产品</option>
						<option value="2">衣服鞋帽</option>
						<option value="3">书籍图书</option>
						<option value="4">家庭用品</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
