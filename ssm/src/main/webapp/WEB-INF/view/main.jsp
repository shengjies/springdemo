<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/7 0007
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <h3>SSM案例平台</h3>
    </div>
    <div class="userinfo">
        当前登陆用户：
        <a href="/loginOut">退出</a>
    </div>
</div>
<div class="center">
    <div class="center_left">
        <ul>
            <li>
                <a href="javascript:;" class="changePage" data-url="/user">员工管理</a>
            </li>
            <li>
                <a href="javascript:;" class="changePage" data-url="/role">角色管理</a>
            </li>
            <li>
                <a href="javascript:;" class="changePage" data-url="/department">部门管理</a>
            </li>
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
