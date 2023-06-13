<jsp:useBean id="user" scope="request" type="com.datasource.entity.User"/>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
用户id：${user.id } <br>
用户名称：${user.name } <br>
注册时间：${user.insertTime }
</body>
</html>