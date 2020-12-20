<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url  var="base" value="/" />
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <a href="base">向，发出请求</a> <br>
    <img src="resources/images/paris.jpg" alt="">
    <br>
    <c:url  var="base" value="/" />
    ${base}
</div>
<div>
    
</div>
</body>
</html>
