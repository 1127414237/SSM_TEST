<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/31
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
卡号：${AccountSession.cardNo} <a href="">退出登录</a><br>
<p href="#">余额:${AccountSession.balance}</p>
<a href="">转账</a><br>
<a href="">查询交易记录</a><br>
<a href="">修改密码</a><br>
<div style="width: 200px;height: 200px;background-color: greenyellow">
    <p style=" padding-top: 80px">欢迎使用网上银行</p>

</div>
</body>
</html>
