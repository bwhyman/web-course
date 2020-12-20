<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    <c:forEach var="t" items="${teachers}">
        <li>${t.name}</li>
    </c:forEach>
</ul>
