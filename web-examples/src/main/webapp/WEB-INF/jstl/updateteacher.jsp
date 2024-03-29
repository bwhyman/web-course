<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="courses" scope="request" type="java.util.List<com.datasource.entity.Course>"/>
<jsp:useBean id="teacher" scope="request" type="com.datasource.entity.Teacher"/>
<jsp:useBean id="titles" scope="request" type="java.util.List<com.datasource.entity.Title>"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form action="">
    姓名：<br>
    <input value="${teacher.name}">
    <br>
    职称：<br>
    <select>

        <c:forEach items="${titles}" var="t">
            <c:set var="s" value="" />
            <c:if test="${t.id == teacher.title.id}">
                <c:set var="s" value="selected" />
            </c:if>
            <option value="${t.id}" ${s}>${t.name}</option>
        </c:forEach>
    </select>
    <br>
    课程：<br>
    <ul>
        <c:forEach items="${courses}" var="c">
            <c:set var="checked" value="" />
            <c:forEach items="${teacher.courses}" var="tc">
                <c:if test="${tc.id == c.id}">
                    <c:set var="checked" value="checked" />
                </c:if>
            </c:forEach>
            <li><label><input type="checkbox" ${checked}>${c.name}</label></li>
        </c:forEach>
    </ul>
</form>
</body>
</html>