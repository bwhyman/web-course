<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url var="base" value="/"/>
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        /* ------------- 基础 ------------- */
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }

        .container {
            max-width: 960px;
            margin: auto;
        }

        .area {
            padding: 10px;
            border: 1px solid #f08c00;
            background-color: #ffec99;
            border-radius: 5px;
        }

        .row {
            display: flex;
            align-items: flex-start;
        }

        /* ------ header ------- */
        .nav {
            display: flex;
            background: #333;
            list-style: none;
        }

        .nav a {
            color: white;
            text-decoration: none;
            display: block;
            padding: 15px 25px;
        }

        .nav a:hover {
            background-color: #111;
        }

        .nav .right {
            margin-left: auto;
        }

        /*-------------- sidebar ------------ */
        .sidebar {
            min-width: 200px;
        }

        .sidebar-group {
            background: #f1f1f1;
        }

        .sidebar-group > ul {
            list-style: none;
        }

        .sidebar-group > h2 {
            background: #3185bf;
            color: white;
            padding: 10px 20px;
        }

        .sidebar-group a {
            display: block;
            color: black;
            text-decoration: none;
            padding: 10px 20px;
            transition: transform 0.5s;
        }

        .sidebar-group a:hover {
            background: #03a9f4;
            color: white;
            transform: scale(1.1);
        }

        .footer {
            text-align: center;
        }

        /*-------- 12栅格 -----------  */
        .col-md-1 {
            width: 8.33%;
        }

        .col-md-2 {
            width: 16.67%;
        }

        .col-md-3 {
            width: 25%;
        }

        .col-md-4 {
            width: 33.33%;
        }

        .col-md-5 {
            width: 41.67%;
        }

        .col-md-6 {
            width: 50%;
        }

        .col-md-7 {
            width: 58.33%;
        }

        .col-md-8 {
            width: 66.67%;
        }

        .col-md-9 {
            width: 75%;
        }

        .col-md-10 {
            width: 83.33%;
        }

        .col-md-11 {
            width: 91.67%;
        }

        .col-md-12 {
            width: 100%;
        }
    </style>
</head>
<body>
<div class="container">
    <!-- header -->
    <div class="area row">
        <div class="col-md-12">
            <ul class="nav">
                <li><a href="#">Home</a></li>
                <li><a href="#">News</a></li>
                <li><a href="#">Contact</a></li>
                <li><a href="#">About</a></li>
                <li class="right">
                    <c:set var="msg" value="Login"/>
                    <c:if test="${sessionScope.user != null}">
                        <c:set var="msg" value="欢迎回来，${sessionScope.user.name}"/>
                    </c:if>
                    <a href="#">${msg}</a>
                </li>
            </ul>
        </div>
    </div>
    <!-- main  -->
    <div class="area row">
        <!-- sidebar -->
        <c:if test="${sessionScope.user != null}">
            <div class="area col-md-3 sidebar">
                <div class="sidebar-group">
                    <h2>云技术管理</h2>
                    <ul>
                        <li><a href="#">云服务器</a></li>
                        <li><a href="#">云数据库</a></li>
                        <li><a href="#">负载均衡</a></li>
                    </ul>
                </div>
                <c:if test="${sessionScope.user.role == 5}">
                    <div class="sidebar-group">
                        <h2>安全管理</h2>
                        <ul>
                            <li><a href="#">云盾控制台</a></li>
                            <li><a href="#">DDoS高防IP</a></li>
                            <li><a href="#">Web应用防火墙</a></li>
                            <li><a href="#">CA证书服务</a></li>
                        </ul>
                    </div>
                </c:if>
            </div>
        </c:if>
        <!-- article -->
        <div class="area col-md-9">
            <h1>设计内容</h1>
            <div>未登录，无侧边栏；header无用户名；<br>
                user权限，有普通功能操作权限及用户名；<br>
                admin权限，更多功能。
            </div>
            <hr>
            <div>
                账号：user/admin
                <form action="httpsession/login" method="post">
                    <input type="text" name="username">
                    <button type="submit">登录</button>
                </form>
                    <a href="httpsession/logout">Logout</a>
            </div>
        </div>
    </div>
    <!-- footer -->
    <div class="area row">
        <div class="col-md-12 footer">
            <p>东北林业大学<br>
                软件工程专业 2046&copy;</p>
        </div>
    </div>
</div>
</body>
</html>