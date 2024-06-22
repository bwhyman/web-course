<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:useBean id="course" scope="request" type="com.datasource.entity.Course"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url  var="base" value="/" />
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>${course.name }</h1>
发布时间：${course.insertTime}
<p>${course.description}</p>
</body>
</html>