<%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/26
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
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

        .zw {
            margin: 80px 0;
        }

        hr {
            border-top: 1px solid #c8c8c8;
        }

        footer {
            padding-bottom: 60px;
        }

        @media (min-width: 992px) {
            .col-md-7 {
                padding: 0 0 0 200px;
            }
        }

        .col-md-7 .row {
            margin: 10px 0;
        }

        .num-button a:hover {
            text-decoration: none;
            color: white;
        }

        .num-control a {
            text-decoration: none;
            color: #9d9d9d;
            border: 1px solid black;
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
<%--主体部分--%>
<div class="page-content">
    <div class="page-header">
        <div class="container">
            <h1>添加商品</h1>
        </div>
    </div>
    <div class="container" style="margin-top: 50px;">
        <form action="../../AddCommodityServlet" style="width: 500px;margin: 0 auto;" method="post">
            <div class="form-group">
                <label for="img_show">商品图片</label>
                <img style="width: 350px;height: 350px;visibility: hidden;" id="img_show" src="" alt="">
                <input type="file" onchange="imgChange();" name="img" style="margin: 0 0 0 200px;" id="img" placeholder="上传图片">
                <p style="margin: 0 0 0 200px;">图片小于1M,且为jpg格式</p>
            </div>
            <div class="form-group">
                <label for="name">商品名</label>
                <input type="text" id="name" name="name" class="form-control" placeholder="请输入商品名">
            </div>
            <div class="form-group">
                <label for="type">商品类型</label>
                <input type="text" id="type" name="type" class="form-control" placeholder="请输入商品类型">
            </div>
            <div class="form-group">
                <label for="price">商品价格</label>
                <input type="text" id="price" name="price" class="form-control" placeholder="请输入商品价格">
            </div>
            <div class="form-group">
                <label for="num">库存</label>
                <input type="text" id="num" name="num" class="form-control" placeholder="请输入商品数量">
            </div>
            <div class="form-group">
                <label for="origin">产地</label>
                <input type="text" id="origin" name="origin" class="form-control" placeholder="请输入产地">
            </div>
            <div class="form-group">
                <label for="productiondate">生产日期</label>
                <input type="text" id="productiondate" name="productiondate" class="form-control" placeholder="请输入生产日期">
            </div>
            <div class="form-group">
                <label for="details">商品描述</label>
                <input type="text" id="details" name="details" class="form-control" placeholder="请输入商品描述">
            </div>
            <button type="submit" class="btn btn-danger" style="margin: 0 0 0 200px;">提交</button>
        </form>
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
<%--登录状态判断--%>
<script>
    //账户和登录接口切换显示
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
<%--获取参数--%>
<script>
    function imgChange() {

        var img = document.getElementById("img").files[0];
        var re = new FileReader();
        re.readAsDataURL(img);
        // alert(re.readAsDataURL(img));
        re.onload = function (re) {
            $('#img_show').attr("src",re.target.result);
            $('#img_show').css("visibility","visible");
        }
    }
</script>
</body>
</html>
