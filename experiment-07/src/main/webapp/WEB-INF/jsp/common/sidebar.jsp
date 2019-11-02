<%@ page pageEncoding="UTF-8" %>
<style>
    /* ------------------------ */
    #sidebar {
        /* 容器宽度 */
        min-width: 200px;
    }

    #sidebar h2 a {
        display: block;
        background: #3185bf;
        color: white;
        text-decoration: none;
        padding: 10px 20px;
    }
    #sidebar ul {
        background: #f1f1f1;
    }
    #sidebar li a {
        display: block;
        padding: 8px 15px;
        color: #000;
        text-decoration: none;
    }
    #sidebar li a:hover {
        background: #03a9f4;
        color: white;
    }
</style>
<nav id="sidebar">
    <h2><a href="">云技术管理</a></h2>
    <ul>
        <li><a href="#">云服务器</a></li>
        <li><a href="#">云数据库</a></li>
        <li><a href="#">负载均衡</a></li>
    </ul>
</nav>