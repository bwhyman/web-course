<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            <td><a href="/jstl/getcourse?cid=${c.id}">${c.name}</a></td>
            <td><fmt:formatDate
                    pattern="yyyy-MM-dd HH:mm"
                    value="${c.insertDate }"/></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>