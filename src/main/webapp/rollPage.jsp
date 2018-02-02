<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<div class="page-bar">
	<c:if test="${booksList.pageNo>1}">
		<a href="javascript:page_nav(document.forms[0],1);">首页</a>
		<a href="javascript:page_nav(document.forms[0],<c:out value="${booksList.pageNo-1}"/>);">上一页</a>
	</c:if>
	<c:if test="${booksList.pageNo<=1}">
		首页&nbsp;&nbsp;上一页
	</c:if>
	<c:if test="${booksList.pageNo<booksList.totalPage}">
		<a href="javascript:page_nav(document.forms[0],<c:out value="${booksList.pageNo+1}" />);">下一页</a>
		<a href="javascript:page_nav(document.forms[0],<c:out value="${booksList.totalPage}"/>);">最后一页</a>
	</c:if>
	<c:if test="${booksList.pageNo>=booksList.totalPage}">
		&nbsp;&nbsp;尾页
	</c:if>&nbsp;&nbsp;
	&nbsp;&nbsp;第 ${booksList.pageNo}页/共${booksList.totalPage}页&nbsp;&nbsp;共${booksList.totalRows}条记录
</div>
<script>

	function page_nav(frm,num) {
		frm.pageIndex.value=num;
		frm.submit();
    }
</script>