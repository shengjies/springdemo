<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/7 0007
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>SSM案例平台</title>
    <link href="/static/style/main_css.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/static/js/jquery.js"></script>
    <script type="text/javascript" src="/static/js/main.js"></script>
</head>
<body>
<div class="top">
    <div class="logo">
        <h3>SSM SHIRO案例平台</h3>
    </div>
    <div class="userinfo">
        当前登陆用户：<shiro:principal property="username"></shiro:principal>
        <a href="/logout">退出</a>
    </div>
</div>
<div class="center">
    <div class="center_left">
        <ul>
            <shiro:hasPermission name="user:list">
            <li>
                <a href="javascript:;" class="changePage" data-url="/user">员工管理</a>
            </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="role:list">
            <li>
                <a href="javascript:;" class="changePage" data-url="/role">角色管理</a>
            </li>
            </shiro:hasPermission>
        </ul>
    </div>
    <div class="center_content">
        <iframe name="right" id="rightMain" src="/welcome.jsp" frameborder="no" scrolling="auto" width="100%"
                height="100%" allowtransparency="true">
        </iframe>
    </div>
</div>
</body>
</html>
