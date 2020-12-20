<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url var="base" value="/"/>
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .container {
            display: flex;
            align-items: start;
        }

        .sidebar {
            border: 1px solid red;
            flex-grow: 1;
            padding: 15px;
        }

        .main {
            border: 1px solid red;
            flex-grow: 10;
            padding: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="sidebar">
        <ul>
            <li><a href="" id="teacher-manager">教师管理</a></li>
        </ul>
    </div>
    <div class="main" id="main">
    </div>
</div>

<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    $(function () {
        $("#teacher-manager").click(() => {
            $.ajax({
                url: "ajax-main",
                method: "get",
                dataType: "html",
                beforeSend: () => {
                    $("#main").load("ajax/loading.html")
                },
                success: resp => {
                    $("#main").html(resp)
                }
            });
            return false;
        })
    })
</script>
</body>
</html>