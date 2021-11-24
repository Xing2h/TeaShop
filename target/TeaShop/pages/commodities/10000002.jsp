<%@ page import="com.tee.service.CommodityService" %>
<%@ page import="com.tee.service.impl.CommodityServiceImpl" %>
<%@ page import="com.tee.pojo.Commodity" %><%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/21
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>1</title>
    <link rel="stylesheet" href="../../static/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <script src="../../static/JQuery/jquery-3.6.0.min.js"></script>
    <script src="../../static/bootstrap-3.4.1-dist/js/bootstrap.js"></script>
    <style>
        body {
            /*background-color: #faebd7;*/
            z-index: 1;
            letter-spacing: 0.15px;
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

        /*#num {*/
        /*    text-align: center;*/
        /*    width: 50px;*/
        /*    height: 50px;*/
        /*    position: relative;*/
        /*    left: -1px;*/
        /*    top: -1px;*/
        /*}*/

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

        /*.num-control a {*/
        /*    text-decoration: none;*/
        /*    color: #9d9d9d;*/
        /*    border: 1px solid black;*/
        /*}*/

        /*.add {*/
        /*    position: absolute;*/
        /*    padding: 1px 10px;*/
        /*    top: -1px;*/
        /*    left: 48px;*/
        /*}*/

        /*.cut {*/
        /*    position: absolute;*/
        /*    bottom: -1px;*/
        /*    padding: 2px 12px;*/
        /*    left: 48px;*/
        /*}*/

        .shadow {
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px rgba(0, 0, 0, 0.23);
            margin-top: 56px;
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
        /*.input-group{*/
        /*    display: flex;*/
        /*}*/
        .input-group .form-control{
            width: 50px;
            text-align: center;
        }
        .d1{
            margin-top: 77px;
            display: flex;
        }
        .btn-danger{
            margin: 0 auto;
        }
    </style>
</head>
<body>
<%
    String id = "10000002";
    CommodityService commodityService = new CommodityServiceImpl();
    Commodity commodity = commodityService.searchForOneCommodity(id);
%>
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
                <li><a href="../../index.jsp">首页</a></li>
                <li><a href="10000008.jsp">太平猴魁</a></li>
<%--                <li><a href="#">礼品</a></li>--%>
                <li class="dropdown">
                    <a data-target class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">分类</a>
                    <ul class="dropdown-menu" style="text-align: center;">
                        <li><a href="show/rt-show.jsp">红茶</a></li>
                        <li><a href="show/gt-show.jsp">绿茶</a></li>
                        <li><a href="show/ht-show.jsp">黄茶</a></li>
                        <li><a href="show/wt-show.jsp">白茶</a></li>
                        <li><a href="show/bt-show.jsp">黑茶</a></li>
                        <li><a href="show/ot-show.jsp">青茶(乌龙茶)</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="搜索商品">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="../cart.jsp">购物车</a></li>
                <li id="login"><a href="../login.html">登录</a></li>
                <li id="register"><a href="../register.html">注册</a></li>
                <li class="dropdown d2" id="user">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">我的账户</a>
                    <ul class="dropdown-menu">
                        <li><a href="../login_success.jsp">我的信息</a></li>
                        <li><a href="#">我的订单</a></li>
                        <!--                            <li><a href="#">Something else here</a></li>-->
                        <!--                            <li role="separator" class="divider"></li>-->
                        <!--                            <li><a href="#">Separated link</a></li>-->
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<!--主体部分-->
<div class="page-content">
    <div class="page-header">
        <div class="container">
            <h1>产品</h1>
        </div>
    </div>
    <div class="container">
        <div class="row shadow">
            <div class="col-md-5">
                <img src="../../static/img/tee/<%=commodity.getId()%>.jpg" alt="">
            </div>
            <div class="col-md-7">
                <div class="row">
                    <h2 class="title"><%=commodity.getName()%>
                    </h2>
                </div>
                <div style="visibility: hidden; width: 0;height: 0">
                    <!--隐藏域，存放商品编号-->
                    <input type="text" id="cid" value="10000002">
                </div>
                <div class="row">
                    <h5 class="details"><%=commodity.getDetails()%>
                    </h5>
                </div>
                <div class="row">
                    品类：<span class="type"><%=commodity.getType()%></span>
                </div>
                <div class="row">
                    <span>价格：</span>
                    <span class=" price">
                    <span>￥</span>&nbsp;<span class="price-num"><%=commodity.getPrice()%></span>
                </span>
                </div>
                <div class="row">
                    <span>库存：<%=commodity.getNum()%></span>
                    <span>销量：<%=commodity.getSalenum()%></span>
                </div>
                <div class="row d1" style="margin-top: 39px">
                    <div class="input-group">
                        <span class="input-group-btn">
                            <button id="cut" class="btn btn-default" type="button">-</button>
                        </span>
                        <input type="text" id="num" class="form-control" value="1" oninput="if (value<1) value=1">
                        <span class="input-group-btn">
                            <button id="add" class="btn btn-default" type="button">+</button>
                        </span>
                    </div>
                    <button id="addCart" type="button" class="btn btn-danger">加入购物车</button>
                </div>
            </div>
        </div>
        <!--底部信息栏-->
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
</div>
<form id="form" method="post" action="../../AddCartServlet" style="width: 0;height: 0;visibility: hidden" >
    <input type="text" id="id" name="cid">
    <input type="text" id="cnum" name="cnum">
</form>
<script>
    //账户和登录接口切换显示
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
    //点击加号数值+1
    $('#add').click(function () {
        document.getElementById("num").value++;
    })
    //点击减号数值-1
    $('#cut').click(function () {
        if (document.getElementById("num").value > 1) {
            document.getElementById("num").value--;
        }
    })
    //点击添加购物车，把商品存入购物车
    $('#addCart').click(function () {
        //获取商品id
        var cid = document.getElementById("cid").value;
        //获取商品数量
        var cnum = document.getElementById('num').value;
        document.getElementById("id").value=cid;
        document.getElementById("cnum").value=cnum;
        document.getElementById("form").submit();
    });
    //返回调用
    $(function (){
        var returndata = '${add}';
        if (returndata==="success"){
            window.alert("添加购物车成功");
            <%
                session.removeAttribute("add");
            %>
        }else if (returndata==="fail"){
            <%
                session.removeAttribute("add");
            %>
            window.alert("添加购物车失败");
        };
    })

</script>
</body>
</html>
