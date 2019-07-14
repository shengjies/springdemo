<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/7 0007
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录</title>
</head>
<body>
    <div style="margin-top: 120px;text-align: center">
        <h1>欢迎登录</h1>
        <span style="color: red">${msg}</span>
        <form method="post" action="/login">
            <div style="margin-bottom: 8px">
                <input placeholder="用户名" name="username" type="text" required>
            </div>
            <div style="margin-bottom: 8px">
                <input placeholder="密码" name="password" type="password" required>
            </div>
            <div>
                <input type="submit" value="登录">
            </div>
        </form>
    </div>

</body>
</html>
