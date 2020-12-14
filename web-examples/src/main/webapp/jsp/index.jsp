<%@page import="java.util.Date" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1><% out.print("Hello JSP");%></h1>
<% out.println("工程名称：" + request.getContextPath()); %> <br/>
<%=new Date() %> <br/>
<%for (int i = 0; i < 4; i++) { %>
<%=i %> <br/>
<% } %>
<%-- 该部分注释在网页中不会被显示--%>
</body>
</html>