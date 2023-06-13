<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:useBean id="teachers" scope="request" type="java.util.List<com.datasource.entity.Teacher>"/>
<ul>
    <c:forEach var="t" items="${teachers}">
        <li>${t.name}</li>
    </c:forEach>
</ul>
