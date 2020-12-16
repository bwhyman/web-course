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
<form action="updateteacher" method="post">
    用户：<input name="name" value="${teacher.name }"> <br>
    注册时间：
    <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${teacher.insertDate}"/><br>

    <br>
    职称：<select name="titleid">
    <c:forEach items="${titles }" var="t">
        <c:set var="s" value=""/>
        <c:if test="${t.id==teacher.title.id }">
            <c:set var="s" value="selected"/>
        </c:if>
        <option value="${t.id }" ${s }>${t.name }</option>
    </c:forEach>
</select> <br>
    授课：
    <ul>
        <c:forEach items="${courses }" var="c" varStatus="i">
            <c:set var="checked" value=""/>
            <c:forEach items="${teacher.courses }" var="tc">
                <c:if test="${tc.id == c.id }">
                    <c:set var="checked" value="checked"/>
                </c:if>
            </c:forEach>
            <li><label>
                <input type="checkbox" name="courseids" value="${c.id }" ${checked }>
                    ${c.name }
            </label></li>
        </c:forEach>
    </ul>
    <button type="submit">提交</button>
    <button type="reset">重置</button>
</form>
</body>
</html>