<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新书</title>
</head>
<body>
<form action="/addBook" method="post">
    <h3>增加新书</h3>
    <div>
        书名：<input type="text" name="bookName">
    </div>
    <div>
        作者：<input type="text" name="bookAuthor">
    </div>
    <div>
        出版社：<input type="text" name="bookPublish">
    </div>
    <div>
        页数：<input type="text" name="bookPage">
    </div>
    <div>
        价格：<input type="text" name="bookPrice">
    </div>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
