<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/31
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询交易记录</title>
</head>
<body>
<h3>当前操作：查询交易记录。请选择时间范围后点击“查询”按钮</h3>
<form action="" method="post">
    查询日期范围：<input type="text" name="beginTime">到 <input type="text">
    <input type="hidden" name="pageIndex" value="1"/>
    <input type="hidden" name="pageSize" value="2"/>
    <input type="submit" value="查询">
    <table>
        <tr>
            <td>交易日期</td>
            <td>交易金额</td>
            <td>账户余额</td>
            <td>交易类型</td>
            <td>备注</td>
        </tr>
        <c:forEach items="${traRecordPager.datas}" var="traRecordPager">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>

        <tr>
            <td colspan="7" align="center">
                <input type="hidden" id="totalPageCount" value="${projectList.totalPage}"/>
                <c:import url="rollPage.jsp" charEncoding="UTF-8">
                    <c:param name="totalRecordCount" value="${projectList.totalRows}"/>
                    <c:param name="totalPageCount" value="${projectList.pageSize}"/>
                    <c:param name="currentPageNo" value="${projectList.pageNo}"/>
                </c:import>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
