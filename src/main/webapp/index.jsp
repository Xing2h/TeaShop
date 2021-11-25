<%@ page import="com.tee.service.CartService" %>
<%@ page import="com.tee.service.impl.CartServiceImpl" %>
<%@ page import="com.tee.pojo.User" %>
<%@ page import="com.tee.pojo.Cart" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/20
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="./static/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <script src="./static/JQuery/jquery-3.6.0.min.js"></script>
    <script src="./static/bootstrap-3.4.1-dist/js/bootstrap.js"></script>
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

        .carousel {
            height: 721px;
            margin-bottom: 0;
            z-index: 2;
            text-align: center;
        }

        .carousel-inner .item img {
            height: 721px;
            width: 100%;
        }

        .carousel-control a {
            background-color: transparent;
        }

        #carousel-example-generic {
            margin-bottom: 60px;
        }

        .img-circle {
            width: 140px;
        }

        .col-md-4 {
            margin-bottom: 20px;
            text-align: center;
            height: 400px;
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

        .btn-default {
            position: relative;
            bottom: 0;
        }

        h2 a:hover {
            text-decoration: none;
        }

        .dcart {
            width: 300px;
        }

        .dcart li {
            /*display: flex;*/
            height: 120px;
            margin: 30px 10px;
        }

        .img {
            vertical-align: middle;
        }

        .img img {
            width: 100px;
        }

        .dcart li div {
            text-align: center;
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
                <a class="navbar-brand" href="#"><img class="logo" src="static/img/logo-small.png" alt=""></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="pages/commodities/10000008.jsp">太平猴魁</a></li>
                    <%--                    <li><a href="#">礼品</a></li>--%>
                    <li class="dropdown">
                        <a data-target class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">分类</a>
                        <ul class="dropdown-menu" style="text-align: center;">
                            <li><a href="pages/commodities/show/rt-show.jsp">红茶</a></li>
                            <li><a href="pages/commodities/show/gt-show.jsp">绿茶</a></li>
                            <li><a href="pages/commodities/show/ht-show.jsp">黄茶</a></li>
                            <li><a href="pages/commodities/show/wt-show.jsp">白茶</a></li>
                            <li><a href="pages/commodities/show/bt-show.jsp">黑茶</a></li>
                            <li><a href="pages/commodities/show/ot-show.jsp">青茶(乌龙茶)</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="搜索商品">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="pages/cart.jsp">购物车</a></li>
                    <li id="login"><a href="pages/login.html">登录</a></li>
                    <li id="register"><a href="pages/register.html">注册</a></li>
                    <li class="dropdown d2" id="user">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">我的账户</a>
                        <ul class="dropdown-menu">
                            <li><a href="pages/credit.jsp">我的信息</a></li>
                            <li><a href="pages/order.jsp">我的订单</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    <!--    轮播图-->
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            <li data-target="#carousel-example-generic" data-slide-to="4"></li>
        </ol>
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner carousel-fade" role="listbox">
            <div class="item active">
                <img src="static/img/carsoul/1.jpg" alt="First slide">
            </div>
            <div class="item">
                <img src="static/img/carsoul/2.jpg" alt="Second slide">
            </div>
            <div class="item">
                <img src="static/img/carsoul/3.jpg" alt="Third slide">
            </div>
            <div class="item">
                <img src="static/img/carsoul/4.jpg" alt="Third slide">
            </div>
            <div class="item">
                <img src="static/img/carsoul/5.jpg" alt="Third slide">
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <!--    内容展示-->
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-sm-6">
                <img class="img-circle" src="static/img/index_show/1.jpg" alt="">
                <h2><a href="pages/commodities/10000001.jsp">明前龙井</a></h2>
                <p>明前采制的龙井茶叶青绿透亮，叶片匀整而有光泽，将茶叶进行冲泡，芽叶舒展，鲜绿漂亮，味道清甜可口，入口柔和清香，给人以一种清新自然之感。</p>
                <%--                <p><a href="pages/commodities/gt/10000001.jsp" class="btn btn-default" role="button">查看详细 >></a></p>--%>
            </div>
            <div class="col-md-4 col-sm-6">
                <img class="img-circle" src="static/img/index_show/2.jpg" alt="">
                <h2><a href="pages/commodities/10000008.jsp">太平猴魁</a></h2>
                <p>
                    太平猴魁，中国传统名茶，中国历史名茶之一，属于绿茶类尖茶，产于安徽太平县（现改为黄山市黄山区）一带，为尖茶之极品，久享盛名。其外形两叶抱芽，扁平挺直，自然舒展，白毫隐伏，有“猴魁两头尖，不散不翘不卷边”的美名。</p>
                <%--                <p><a href="pages/commodities/gt/10000008.jsp" class="btn btn-default" role="button">查看详细 >></a></p>--%>
            </div>
            <div class="col-md-4 col-sm-6">
                <img class="img-circle" src="static/img/index_show/3.jpg" alt="">
                <h2><a href="pages/commodities/10000006.jsp">祁门红茶</a></h2>
                <p>
                    祁门红茶简称祁红，茶叶原料选用当地的中叶、中生种茶树“槠叶种”（又名祁门种）制作，是中国历史名茶，著名红茶精品。“祁红特绝群芳最，清誉高香不二门。”祁门红茶是红茶中的极品，享有盛誉，是英国女王和王室的至爱饮品，高香美誉，香名远播，美称“群芳最”、“红茶皇后”。</p>
                <%--                <p><a href="#" class="btn btn-default" role="button">查看详细 >></a></p>--%>
            </div>
        </div>
        <hr class="zw">
        <div class="row">
            <div class="col-md-7">
                <h2 class=""><a href="pages/commodities/10000009.jsp">武夷岩茶</a></h2>
                <p class="lead">
                    武夷岩茶是中国传统名茶，是具有岩韵（岩骨花香）品质特征的乌龙茶。产于福建闽北“秀甲东南”的武夷山一带，茶树生长在岩缝之中。武夷岩茶具有绿茶之清香，红茶之甘醇，是中国乌龙茶中之极品。武夷岩茶属半发酵的青茶，制作方法介于绿茶与红茶之间。最著名的武夷岩茶是大红袍茶。</p>
            </div>
            <div class="col-md-5">
                <img class="center-block" src="static/img/index_show/4.jpg">
            </div>
        </div>
        <hr class="zw">
        <div class="row">
            <div class="col-md-5">
                <img src="static/img/index_show/5.jpg" alt="">
            </div>
            <div class="xol-md-7">
                <h2><a href="pages/commodities/10000007.jsp">洞碧螺春庭</a></h2>
                <p class="lead">
                    碧螺春是中国传统名茶，中国十大名茶之一，属于绿茶类，已有1000多年历史。唐朝时就被列为贡品，古人们又称碧螺春为“功夫茶”、“新血茶”。炒成后的干茶条索紧结，白毫显露，色泽银绿，翠碧诱人，卷曲成螺，产于春季，故名“碧螺春”。此茶冲泡后杯中白云翻滚，清香袭人。</p>
            </div>
        </div>
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
    <form action="DelCartServlet" id="form" method="post" style="visibility: hidden;width: 0;height: 0;">
        <input type="text" id="commid" name="commid">
    </form>
</div>
<script>
    window.onload = function () {
        var l1 = document.getElementById("login");
        var l2 = document.getElementById("register");
        var l3 = document.getElementById("user")
        <%--<%User user = (User) session.getAttribute("user");%>--%>
        <%--      var name = '${user.username}';--%>
        <%--      window.alert('${user.username}');--%>
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
</body>
</html>
