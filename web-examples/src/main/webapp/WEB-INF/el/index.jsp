<jsp:useBean id="user" scope="request" type="com.datasource.entity.User"/>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
用户名：${name} <br>
${user.name} <br>
${user.address.detail} <br>
${location} <br>
${sessionScope.location}
</body>
</html>