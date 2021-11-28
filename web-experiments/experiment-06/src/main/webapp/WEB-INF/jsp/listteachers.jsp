<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url var="base" value="/"/>
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>#</td>
        <td>姓名</td>
        <td>注册时间</td>
    </tr>
    <c:forEach items="${teachers }" var="t" varStatus="s">
        <tr>
            <td>${s.count }</td>
            <td><a href="updateteacher?tid=${t.id }">${t.name }</a></td>
            <td><fmt:formatDate
                    pattern="yyyy-MM-dd HH:mm"
                    value="${t.insertDate}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>