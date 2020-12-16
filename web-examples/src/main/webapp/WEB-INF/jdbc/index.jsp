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
<h3>Insert</h3>
添加指定用户
<form action="/jdbc/insert" method="post">
    name: <input type="text" name="name" required> <br>
    <button type="submit">提交</button>
</form>
<hr>
<h3>Update</h3>
修改指定用户
<form action="/jdbc/update" method="post">
    <select name="userid">
        <option value="">请选择用户</option>
        <c:forEach items="${users }" var="u">
            <option value="${u.id }">${u.name }</option>
        </c:forEach>
    </select>
    new name:<input type="text" name="name" required>
    <br>
    <button type="submit">提交</button>
</form>
<hr>
<h3>Delete</h3>
删除指定用户
<form action="/jdbc/delete" method="post">
    <ul>
        <c:forEach items="${users }" var="u">
            <li><label>
                <input type="checkbox" name="userids" value="${u.id }">${u.name }
            </label></li>
        </c:forEach>
    </ul>
    <button type="submit">提交</button>
</form>
<hr>
查询指定用户
<ul>
    <c:forEach items="${users }" var="u">
        <li><a href="/jdbc/query?userid=${u.id }">${u.name }</a></li>
    </c:forEach>
</ul>
<hr>

</body>
</html>