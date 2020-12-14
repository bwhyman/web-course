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
<h1>${course.name }</h1>
发布时间：
<fmt:formatDate
        pattern="yyyy-MM-dd HH:mm"
        value="${course.insertDate}" />
<p>${course.description}</p>
</body>
</html>