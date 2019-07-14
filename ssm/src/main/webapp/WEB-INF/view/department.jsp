<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/7 0007
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>部门列表</title>
</head>
<body>
    <div style="text-align: center;width: 100%">
        <h1>部门列表</h1>
        <div style="text-align: center">
            <a href="#">新增</a>
        </div>
        <table style="width: 100%" border="1">
            <thead>
            <tr>
                <th>序号</th>
                <th>部门名称</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ments}" var="item">
                <tr>
                    <td style="text-align: center">${item.id}</td>
                    <td style="text-align: center">${item.name}</td>
                    <td style="text-align: center">${item.createTime}</td>
                    <td style="text-align: center">
                        <a href="#">编辑</a>
                        <a href="#">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
