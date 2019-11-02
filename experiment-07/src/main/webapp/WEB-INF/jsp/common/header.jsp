<%@ page pageEncoding="UTF-8" %>
<style>
    /* ------------上导航---------- */
    header {
        margin: 10px 0;
    }
    header nav ul {
        display: flex;
        padding: 0;
        list-style-type: none;
        background-color: #333;
    }
    header nav li a {
        display: block;
        color: white;
        padding: 14px 16px;
        text-decoration: none;
    }
    header nav li a:hover {
        background-color: #111;
    }
    header nav .right {
        margin-left: auto;
    }
</style>
<header>
    <nav>
        <ul>
            <li ><a href="#">Home</a></li>
            <li><a href="#">News</a></li>
            <li><a href="#">Contact</a></li>
            <li><a href="#">About</a></li>
            <li class="right"><a href="#">Logout</a></li>
        </ul>
    </nav>
</header>
