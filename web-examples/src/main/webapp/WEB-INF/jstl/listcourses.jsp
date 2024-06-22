<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="courses" scope="request" type="java.util.List<com.datasource.entity.Course>"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url  var="base" value="/" />
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>

    <c:forEach items="${courses}" var="c">
        <tr>
            <td><a href="jstl/getcourse?cid=${c.id}">${c.name}</a></td>
            <td>${c.insertTime }</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>