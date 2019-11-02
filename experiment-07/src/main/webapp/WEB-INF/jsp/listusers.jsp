<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/adduser" method="post">
    用户名：<input name="username" required><br />
    <button type="submit">添加</button>
</form>

<form action="/updateuser" method="post">
    <select name="uid">
        <c:forEach items="${users }" var="u">
            <option value="${u.id }">${u.name }</option>
        </c:forEach>
    </select>
    新用户名：<input name="username" required><br />
    <button type="submit">更新</button>
</form>
列表<br />
<ul>
    <c:forEach items="${users }" var="u">
        <li><a href="/getuser?uid=${u.id }">${u.name }</a></li>
    </c:forEach>
</ul>
</body>

</html>