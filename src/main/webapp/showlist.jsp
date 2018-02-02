<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>申报项目列表</title>
</head>
<body>
<form action="/showList" method="post">
    申报状态：<select name="status">
    <option value="-1">全部</option>
    <option value="0">已申报</option>
    <option value="1">审核中</option>
    <option value="2">已审核</option>
</select>
    <input type="hidden" name="pageIndex" value="1"/>
    <input type="hidden" name="pageSize" value="2"/>
    <input type="submit" value="查询">
</form>
<table width="600" border="2">
    <tr>
        <td>项目编号</td>
        <td>项目名称</td>
        <td>申报开始日期</td>
        <td>申报结束日期</td>
        <td>申报状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${projectList.datas}" var="projectList">

        <tr>
            <td>${projectList.id}</td>
            <td>${projectList.projectName}</td>
            <td>
                   <fmt:formatDate pattern="yyyy-MM-dd" value="${projectList.startDate}"/> </td>
            <td> <fmt:formatDate pattern="yyyy-MM-dd" value="${projectList.endDate}"/> </td>
            <td>
                    <c:if test="${projectList.status==0}">
                        已申报
                    </c:if>
                <c:if test="${projectList.status==1}">
                    审核中
                </c:if>
                <c:if test="${projectList.status==2}">
                    已审核
                </c:if>

            </td>
            <td>
        <c:if test="${projectList.status!=2}">
            <a href="/selectProjectOne?id=${projectList.id}">审核</a>
        </c:if>
            </td>
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
</body>
</html>
