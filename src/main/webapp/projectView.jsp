<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/17
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>申报项目信息</title>
</head>
<body>
<form action="/updateProject?id=${project.id}" method="post">
    <table>
        <tr>
            <td>项目编号</td>
            <td>
                ${project.id}
            </td>
        </tr>
        <tr>
            <td>项目名称</td>
            <td>${project.projectName}</td>
        </tr>
        <tr>
            <td>申报开始日期</td>
            <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${project.startDate}"/>
                ${project.startDate}</td>
        </tr>
        <tr>
            <td>申报结束日期</td>
            <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${project.endDate}"/>
        </tr>
        <tr>
            <td>申报状态</td>
            <td>
                <select name="status">
                    <option value="1">审核中</option>
                    <option value="2">已审核</option>
                </select>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="审核"></td>
            <td><input type="submit" value="返回"></td>
        </tr>

    </table>
</form>

</body>
</html>
