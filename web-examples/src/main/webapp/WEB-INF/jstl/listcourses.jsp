<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="courses" scope="request" type="java.util.List<com.datasource.entity.Course>"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>

    <c:forEach items="${courses}" var="c">
        <tr>
            <td><a href="getcourse?cid=${c.id}">${c.name}</a></td>
            <td><fmt:formatDate
                    pattern="yyyy-MM-dd HH:mm"
                    value="${c.insertDate }"/></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>