<%@ page import="com.tee.pojo.AdminUser" %><%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/25
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员密码修改</title>
    <link rel="stylesheet" href="../static/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <script src="../static/JQuery/jquery-3.6.0.min.js"></script>
    <script src="../static/bootstrap-3.4.1-dist/js/bootstrap.js"></script>
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
                /*width: 100%;*/
            }
        }

        @media (min-width: 768px) and (max-width: 992px) {
            .search {
                visibility: hidden;
                width: 0;
                height: 0;
            }
        }

        @media (min-width: 992px) {
            .container {
                /*width: 970px;*/
                width: 100%;
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


        hr {
            border-top: 1px solid #c8c8c8;
        }

        footer {
            padding-bottom: 60px;
        }

        .btn-default {
            position: relative;
            bottom: 0;
        }

        h2 a:hover {
            text-decoration: none;
        }


        .dcart li {
            /*display: flex;*/
            height: 120px;
            margin: 30px 10px;
        }


        .img img {
            width: 100px;
        }

        .dcart li div {
            text-align: center;
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

        .zw {
            margin: 40px 0;
        }
    </style>
</head>
<body>
<div>
    <!--    导航条-->
    <nav class="navbar navbar-default">
        <div class="container header">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><img class="logo" src="../static/img/logo-small.png" alt=""></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="../index.jsp">首页</a></li>
                    <li><a href="commodities/10000008.jsp">太平猴魁</a></li>
                    <%--                    <li><a href="#">礼品</a></li>--%>
                    <li class="dropdown">
                        <a data-target class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">分类</a>
                        <ul class="dropdown-menu" style="text-align: center;">
                            <li><a href="commodities/show/rt-show.jsp">红茶</a></li>
                            <li><a href="commodities/show/gt-show.jsp">绿茶</a></li>
                            <li><a href="commodities/show/ht-show.jsp">黄茶</a></li>
                            <li><a href="commodities/show/wt-show.jsp">白茶</a></li>
                            <li><a href="commodities/show/bt-show.jsp">黑茶</a></li>
                            <li><a href="commodities/show/ot-show.jsp">青茶(乌龙茶)</a></li>
                        </ul>
                    </li>
                </ul>
<%--                <form class="navbar-form navbar-left search">--%>
<%--                    <div class="form-group">--%>
<%--                        <input type="text" class="form-control" placeholder="搜索商品">--%>
<%--                    </div>--%>
<%--                    <button type="submit" class="btn btn-default">搜索</button>--%>
<%--                </form>--%>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="cart.jsp">购物车</a></li>
                    <li id="login"><a href="login.html">登录</a></li>
                    <li id="register"><a href="register.html">注册</a></li>
                    <li class="dropdown d2" id="user">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">我的账户</a>
                        <ul class="dropdown-menu">
                            <li><a href="persondata.jsp">我的信息</a></li>
                            <li><a href="order.jsp">我的订单</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="page-content">
        <div class="page-header">
            <div class="container">
                <h1>个人信息</h1>
            </div>
        </div>
        <%
            AdminUser user = (AdminUser) request.getSession().getAttribute("adminuser");
        %>
        <div class="container">
            <form action="../ModifyAdminPasswordServlet" method="post" style="width: 500px;margin: 100px auto;" onsubmit="return checkPassword()">
                <div class="form-group">
                    <label for="old">请输入旧密码</label>
                    <input type="text" id="old" name="old" class="form-control" placeholder="请输入旧密码">
                </div>
                <div class="form-group">
                    <label for="confold">请确认旧密码</label>
                    <input type="text" id="confold" name="confold" class="form-control" placeholder="请确认旧密码">
                </div>
                <div class="form-group">
                    <label for="new">请输入新密码</label>
                    <input type="text" id="new" name="new" class="form-control" placeholder="请输入新密码">
                </div>
                <button type="submit">确认修改</button>
            </form>
        </div>
    </div>
</div>
<!--底部信息栏-->
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
        if ('${user.username}' == '') {
            l3.style.visibility = "hidden";
            l3.style.width = 0;
            l3.style.height = 0;
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
<script>
    function checkPassword() {
        var oldpw = document.getElementById("old").value;
        var confold = document.getElementById("confold").value;
        var pwd = '${user.password}';
        if (oldpw!=confold){
            alert("密码不一致,请确认后重新输入！");
            return false;
        }else if (oldpw!=pwd){
            alert("旧密码输入错误！");
            return false;
        }else {
            return true;
        }
    }
</script>
</body>
</html>

