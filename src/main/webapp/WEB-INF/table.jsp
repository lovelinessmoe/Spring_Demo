<%--
  Created by IntelliJ IDEA.
  User: hd
  Date: 2020/12/1
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>table</title>
</head>
<body>
<a href="test/insert">新增</a>
<table border="1">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>操作</td>
    </tr>
        <c:forEach items="${lists}" var="list">
    <tr>
            <td>${list.id}</td>
            <td>${list.username}</td>
            <td>${list.password}</td>
            <td><a href="test/update?id=${list.id}">修改</a>/<a href="test/delete?id=${list.id}">删除</a></td>
    <tr>
        </c:forEach>

</table>
</body>
</html>
