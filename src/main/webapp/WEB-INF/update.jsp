<%--
  Created by IntelliJ IDEA.
  User: hd
  Date: 2020/12/1
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="updateData">
    <input type="hidden" name="id" value="${id}"/>
    username:<input type="text" placeholder="需要修改的值" name="username"/>
    password:<input type="text" placeholder="需要修改的值" name="password"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
