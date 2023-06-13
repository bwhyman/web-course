<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="users" scope="request" type="java.util.List<com.datasource.entity.User>"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>c:set</h1>
<c:set var="salary" value="${2100 * 10}"/>

通过EL显示结果：${salary } <br>
<h1>c:if</h1>
<c:if test="${salary > 20000 }" var="iftest">
    好多啊
</c:if>
<c:if test="${salary < 2000 }">
    好少啊
</c:if>
<br> ${iftest }
<hr>
<h1>c:choose</h1>
<c:choose>
    <c:when test="${salary <= 2000 }">
        太惨了。
    </c:when>
    <c:when test="${salary > 20000 }">
        不错的薪水，还能生活。
    </c:when>
    <c:otherwise>
        什么都没有。
    </c:otherwise>
</c:choose>
<hr>
<h1>c:foreach</h1>
<ul>

    <c:forEach items="${users }" var="u">
        <li>${u.name }</li>
    </c:forEach>
</ul>

<table>
    <tr>
        <td>index</td>
        <td>count</td>
        <td>name</td>
        <td>isFirst</td>
    </tr>
    <c:forEach items="${users }" var="u" varStatus="s">
        <tr>
            <td>${s.index }</td>
            <td>${s.count }</td>
            <td>${u.name }</td>
            <td>${s.first }</td>
        </tr>
    </c:forEach>
</table>


<hr/>
<h1>fmt:formatNumber</h1>
<c:set var="balance" value="120000.2309"/>
<p>格式化数字 (1): <fmt:formatNumber value="${balance}"
                                type="currency"/></p>
<p>格式化数字 (2): <fmt:formatNumber type="number"
                                maxIntegerDigits="3" value="${balance}"/></p>
<p>格式化数字 (3): <fmt:formatNumber type="number"
                                maxFractionDigits="6" value="${balance}"/></p>
<p>格式化数字 (4): <fmt:formatNumber type="number"
                                groupingUsed="false" value="${balance}"/></p>
<p>格式化数字 (5): <fmt:formatNumber type="percent"
                                maxIntegerDigits="3" value="${balance}"/></p>
<p>格式化数字 (6): <fmt:formatNumber type="percent"
                                minFractionDigits="10" value="${balance}"/></p>
<p>格式化数字 (7): <fmt:formatNumber type="percent"
                                minIntegerDigits="3" value="${balance}"/></p>
<p>格式化数字 (8): <fmt:formatNumber type="number"
                                pattern="###.###E0" value="${balance}"/></p>
<p>英镑 :
    <fmt:setLocale value="en_GB"/>
    <fmt:formatNumber value="${balance}" type="currency"/></p>
<p>美元 :
    <fmt:setLocale value="en_US"/>
    <fmt:formatNumber value="${balance}" type="currency"/></p>
<hr>
<h1>fmt:formatDate</h1>
<c:set var="now" value="<%=new java.util.Date()%>"/>
<p>日期格式化 (1): <fmt:formatDate type="time"
                              value="${now}"/></p>
<p>日期格式化 (2): <fmt:formatDate type="date"
                              value="${now}"/></p>
<p>日期格式化 (3): <fmt:formatDate pattern="yyyy-MM-dd"
                              value="${now}"/></p>
<p>日期格式化 (4): <fmt:formatDate pattern="yyyy-MM-dd HH:mm E"
                              value="${now}"/></p>
<fmt:setLocale value="zh-CN"/>
<p>日期格式化 (5): <fmt:formatDate pattern="yyyy/MM/dd HH:mm:SS E"
                              value="${now}"/></p>
</body>
</html>