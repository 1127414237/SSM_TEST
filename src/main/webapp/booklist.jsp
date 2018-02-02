
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>

<html>
<head>
    <title>书的详细列表</title>
</head>
<body>
<form action="/showBooksPagerList" method="post">

    书名：<input type="text" name="bookName"><br>
    作者：<input type="text" name="bookAuthor"><br>
    出版社：<input type="text" name="bookPublish"><br>
    <input type="hidden" name="pageIndex" value="1"/>
    <input type="hidden" name="pageSize" value="2"/>
    <input type="submit" value="提交">
</form>

<table>
    <tr><td><a href="addBook.jsp">添加新书</a></td></tr>
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>出版社</td>
        <td>页数</td>
        <td>价格</td>
    </tr>
    <c:forEach items="${booksList.datas}" var="book">
        <tr>
            <td>${book.bookName}</td>
            <td>${book.bookAuthor}</td>
            <td>${book.bookPublish}</td>
            <td>${book.bookPage}</td>
            <td>${book.bookPrice}</td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="7" align="center">
            <input type="hidden" id="totalPageCount" value="${booksList.totalPage}"/>
            <c:import url="rollPage.jsp" charEncoding="UTF-8">
                <c:param name="totalRecordCount" value="${booksList.totalRows}"/>
                <c:param name="totalPageCount" value="${booksList.pageSize}"/>
                <c:param name="currentPageNo" value="${booksList.pageNo}"/>
            </c:import>
        </td>
    </tr>
</table>
</body>
</html>
