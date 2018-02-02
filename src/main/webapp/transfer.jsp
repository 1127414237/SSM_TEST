<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/31
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转账</title>
</head>
<body>
<div style="width: 200px;height: 200px;background-color: greenyellow">
<h3>当前操作：转账。请输入转入账号和金额后点击“转账”按钮</h3>
    <form action="" method="post">
        <table>
            <tr>
                <td>转入账号：</td>
                <td><input type="text" name="cardNo"></td>
            </tr>
            <tr>
                <td>转入金额：</td>
                <td><input type="text" name="balance"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="转账"></td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
