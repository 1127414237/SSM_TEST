
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width: 500px;height: 200px; background-color: greenyellow">
    <form action="/accountLogin" method="post">
    <h3>个人网上银行</h3>
    <div>
        <lable>卡号: <input type="text" name="cardNo"> </lable>
    </div>
    <div>
        <lable>密码: <input type="text" name="password"> </lable>
    </div>
        <div>
            <input type="submit" value="登录网上银行">
        </div>
    </form>
</div>
</body>
</html>
