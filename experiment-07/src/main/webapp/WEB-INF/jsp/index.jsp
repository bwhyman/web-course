<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        main {
            display: flex;
        }
        main article {
            margin: 0 15px;
        }
        article table {
            width: 100%;
            table-layout: fixed;
            border-collapse: collapse;
        }
        article table thead {
            background-color: #4caf50;
            color: white;
        }
        article table th, table td {
            padding: 8px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        article table td a {
            display: inline-block;
            background-color: #f44336;
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            border-radius: 5px;
        }

    </style>
</head>
<body>
<%@include file="/WEB-INF/jsp/common/header.jsp"%>
<main>
    <%@include file="/WEB-INF/jsp/common/sidebar.jsp"%>
    <article>
        <table>
            <thead>
            <tr>
                <td>#</td>
                <td>姓名</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users }" var="u" varStatus="v">
                <tr>
                    <td>${v.count }</td>
                    <td>${u.name }</td>
                    <td><a class="btn" href="/updateuser?id=${u.id }">修改</a> <a class="btn" href="/updateuser?id=${u.id }">修改</a> </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </article>

</main>
<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
</body>
</html>