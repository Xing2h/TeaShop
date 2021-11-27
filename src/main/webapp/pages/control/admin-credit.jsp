<%@ page import="com.tee.pojo.User" %>
<%@ page import="com.tee.pojo.AdminUser" %><%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/25
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员信息</title>
    <link rel="stylesheet" href="../../static/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <script src="../../static/JQuery/jquery-3.6.0.min.js"></script>
    <script src="../../static/bootstrap-3.4.1-dist/js/bootstrap.js"></script>
    <style>
        body {
            /*background-color: #faebd7;*/
            z-index: 1;
        }

        .navbar-default {
            /*background-color: #faebd7;*/
            /*background-color: white;*/
            /*opacity: 0;*/
            background-color: transparent;
        }

        .logo {
            height: 50px;
        }

        .navbar-header .navbar-brand {
            padding: 0px 15px;;
        }

        .navbar {
            border: 0px;
        }

        @media (min-width: 768px) {
            .navbar {
                margin-top: 20px;
                /*position: absolute;*/
                right: 0;
                left: 0;
                z-index: 3;
            }
        }

        @media (min-width: 768px) {
            .container {
                width: 750px;
            }
        }

        @media (min-width: 992px) {
            .container {
                width: 970px;
            }
        }

        @media (min-width: 1200px) {
            .container {
                width: 1170px;
            }
        }

        .header {
            /*background-color: #2f4f4f;*/
            border-radius: 6px;
        }

        .navbar-default .navbar-nav li a {
            color: #c1aa96;
        }

        .navbar-default .navbar-nav li ul li a {
            color: black;
        }

        @media (min-width: 768px) {
            .navbar-nav li:hover .dropdown-menu {
                display: block;
            }
        }

        .dropdown ul {
            text-align: center;
        }

        @media (min-width: 768px) {
            .navbar-form .form-control {
                /*width: 400px;*/
            }
        }

        .navbar-header {
            text-align: center;
        }

        .navbar-default .navbar-form {
            text-align: center;
        }

        .navbar-nav {
            text-align: center;
        }

        .carousel-inner .item img {
            height: 721px;
            width: 100%;
        }

        .carousel-control a {
            background-color: transparent;
        }

        .col-md-4 h2 {
            font-weight: 400;
            color: #4a4a4a;
        }

        .col-md-4 p {
            margin-right: 10px;
            margin-left: 10px;
        }

        p {
            margin: 0 0 10px;
        }

        .btn-default {
            color: #333;
            background-color: #fff;
            border-color: #ccc;
        }

        .zw {
            margin: 80px 0;
        }

        hr {
            border-top: 1px solid #c8c8c8;
        }

        footer {
            padding-bottom: 60px;
        }

        .title {
            font: 700 36px Arial, "microsoft yahei";
            color: #666;
            padding-top: 25px;
            line-height: 28px;
            margin-bottom: 25px;
        }

        .details {
            color: #e4393c;
        }

        .type {
            font-size: 18px;
            font-weight: 400;
        }

        .price {
            color: red;
            /*font-size: 26px;*/
        }

        .price-num {
            font-size: 22px;
        }

        @media (min-width: 992px) {
            .col-md-7 {
                padding: 0 0 0 200px;
            }
        }

        .col-md-5 {
            margin-top: 25px;
            text-align: center;
        }

        .col-md-7 .row {
            margin: 10px 0;
        }

        #num {
            text-align: center;
            width: 50px;
            height: 50px;
            position: relative;
            left: -1px;
        }

        .num-button {
            width: 108px;
            display: inline-block;
        }

        .button {
            height: 50px;
            background-color: red;
            color: white;

            text-decoration: none;
            width: 108px;
            padding: 18px;
            position: relative;
        }

        .num-button a:hover {
            text-decoration: none;
            color: white;
        }

        .num-control {
            border: 1px solid black;
            width: 80px;
            position: relative;
            display: inline-block;
            height: 50px;
        }

        .num-control a {
            text-decoration: none;
            color: #9d9d9d;
            border: 1px solid black;
        }

        .add {
            position: absolute;
            padding: 1px 10px;
            top: -1px;
            left: 48px;
        }

        .cut {
            position: absolute;
            bottom: -1px;
            padding: 2px 12px;
            left: 48px;
        }

        .thumbnail {
            text-align: center;
            height: 400px;
        }

        .thumbnail img {
            width: 250px;
        }

        .page-header {
            background-color: #eeebeb;
            padding: 5px 0px;
            margin-bottom: 5px;
            font-weight: 300;
            font-family: "acumin-pro", "Arial", sans;
        }

        .page-header h1 {
            font-size: 1.5em;

        }
    </style>
</head>
<body>
<!--    导航条-->
<nav class="navbar navbar-default">
    <div class="container header">
        <div class="navbar-header row">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><img class="logo" src="../../static/img/logo-small.png" alt=""></a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="../../index.jsp">商城首页</a></li>
                <li id="l1"><a href="commodity-list.jsp">商品列表</a></li>
                <li id="l2"><a href="order-list.jsp">订单列表</a></li>
                <li id="l3"><a href="addCommodity.jsp">添加商品</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li id="login"><a href="../admin-login.html">登录</a></li>
                <li id="register"><a href="../admin-register.html">注册</a></li>
                <li id="user"><a href="admin-credit.jsp">账户信息</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="page-content">
    <div class="page-header">
        <div class="container">
            <h1>个人信息</h1>
        </div>
    </div>
    <%
        AdminUser adminUser = (AdminUser) request.getSession().getAttribute("adminUser");
    %>
    <div class="container">
        <form action="../../AdminDataModifyServlet" method="post" style="width: 500px;margin: 100px auto;">
            <div class="form-group">
                <label for="id">用户id</label>
                <input type="text" class="form-control" name="id" id="id" value="<%=adminUser.getId()%>" disabled>
            </div>
            <div class="form-group">
                <label for="username">用户名</label>
                <input type="text" id="username" name="username" class="form-control"
                       value="<%=adminUser.getUsername()%>" disabled>
            </div>
            <div class="form-group">
                <label for="email">邮箱</label>
                <input type="email" id="email" name="email" class="form-control" value="<%=adminUser.getEmail()%>">
            </div>
            <div class="form-group">
                <label for="tel">手机号</label>
                <input type="tel" id="tel" name="tel" class="form-control" value="<%=adminUser.getTel()%>">
            </div>
            <button type="button" class="btn btn-danger"><a href="../admin-password-modify.jsp"
                                                            style="text-decoration: none;color: black;">修改密码</a>
            </button>
            <button type="submit" class="btn btn-primary" style="margin: 0 0 0 335px;">提&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交</button>
        </form>
    </div>
</div>
<div class="container">
    <hr class="zw">
    <footer>
        <p class="pull-right">
            <a href="#">返回顶部</a>
        </p>
        <p class="pull-left">
            © 2021 Company, Inc.
        </p>
    </footer>
</div>
<script>
    window.onload = function () {
        var l1 = document.getElementById("login");
        var l2 = document.getElementById("register");
        var l3 = document.getElementById("user")
        var l4 = document.getElementById("l1")
        var l5 = document.getElementById("l2")
        var l6 = document.getElementById("l3")

        if ('${adminUser.username}' == '') {
            l3.style.visibility = "hidden";
            l3.style.width = 0;
            l3.style.height = 0;
            l4.style.visibility = "hidden";
            l4.style.width = 0;
            l4.style.height = 0;
            l5.style.visibility = "hidden";
            l5.style.width = 0;
            l5.style.height = 0;
            l6.style.visibility = "hidden";
            l6.style.width = 0;
            l6.style.height = 0;
        } else {
            l1.style.visibility = "hidden";
            l1.style.width = 0;
            l1.style.height = 0;
            l2.style.visibility = "hidden";
            l2.style.width = 0;
            l2.style.height = 0;
        }
    }
</script>
</body>
</html>
