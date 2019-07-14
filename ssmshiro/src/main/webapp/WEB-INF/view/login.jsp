<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/8 0008
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录</title>
</head>
<body>
    <h1>欢迎登录</h1>
    <span style="color: red;font-weight: bold">${msg}</span>
    <form method="post" action="/login">
        <div style="margin-bottom: 10px"><input placeholder="用户名" name="username" type="text"></div>
        <div style="margin-bottom: 10px"><input placeholder="密码" name="password" type="text"></div>
        <div><input type="submit" value="登录"></div>
    </form>
</body>
</html>
