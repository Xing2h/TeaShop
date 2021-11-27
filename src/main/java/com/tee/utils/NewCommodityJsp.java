package com.tee.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class NewCommodityJsp {

    public void newJsp(String id){
        StringBuilder sb = new StringBuilder();
        sb.append("<%@ page import=\"com.tee.pojo.Commodity\" %>\n" +
                "<%@ page import=\"com.tee.service.CommodityService\" %>\n" +
                "<%@ page import=\"com.tee.service.impl.CommodityServiceImpl\" %>\n" +
                "<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>1</title>\n" +
                "    <link rel=\"stylesheet\" href=\"../../static/bootstrap-3.4.1-dist/css/bootstrap.min.css\">\n" +
                "    <script src=\"../../static/JQuery/jquery-3.6.0.min.js\"></script>\n" +
                "    <script src=\"../../static/bootstrap-3.4.1-dist/js/bootstrap.js\"></script>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            /*background-color: #faebd7;*/\n" +
                "            z-index: 1;\n" +
                "            letter-spacing: 0.15px;\n" +
                "        }\n" +
                "\n" +
                "        .navbar-default {\n" +
                "            /*background-color: #faebd7;*/\n" +
                "            /*background-color: white;*/\n" +
                "            /*opacity: 0;*/\n" +
                "            background-color: transparent;\n" +
                "        }\n" +
                "\n" +
                "        .logo {\n" +
                "            height: 50px;\n" +
                "        }\n" +
                "\n" +
                "        .navbar-header .navbar-brand {\n" +
                "            padding: 0px 15px;;\n" +
                "        }\n" +
                "\n" +
                "        .navbar {\n" +
                "            border: 0px;\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width: 768px) {\n" +
                "            .navbar {\n" +
                "                margin-top: 20px;\n" +
                "                /*position: absolute;*/\n" +
                "                right: 0;\n" +
                "                left: 0;\n" +
                "                z-index: 3;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        @media (min-width: 768px) {\n" +
                "            .container {\n" +
                "                width: 750px;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width: 992px) {\n" +
                "            .container {\n" +
                "                width: 970px;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width: 1200px) {\n" +
                "            .container {\n" +
                "                width: 1170px;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        .header {\n" +
                "            /*background-color: #2f4f4f;*/\n" +
                "            border-radius: 6px;\n" +
                "        }\n" +
                "\n" +
                "        .navbar-default .navbar-nav li a {\n" +
                "            color: #c1aa96;\n" +
                "        }\n" +
                "\n" +
                "        .navbar-default .navbar-nav li ul li a {\n" +
                "            color: black;\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width: 768px) {\n" +
                "            .navbar-nav li:hover .dropdown-menu {\n" +
                "                display: block;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        .dropdown ul {\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width: 768px) {\n" +
                "            .navbar-form .form-control {\n" +
                "                /*width: 400px;*/\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        .navbar-header {\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .navbar-default .navbar-form {\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .navbar-nav {\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .carousel-inner .item img {\n" +
                "            height: 721px;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        .carousel-control a {\n" +
                "            background-color: transparent;\n" +
                "        }\n" +
                "\n" +
                "        .col-md-4 h2 {\n" +
                "            font-weight: 400;\n" +
                "            color: #4a4a4a;\n" +
                "        }\n" +
                "\n" +
                "        .col-md-4 p {\n" +
                "            margin-right: 10px;\n" +
                "            margin-left: 10px;\n" +
                "        }\n" +
                "\n" +
                "        p {\n" +
                "            margin: 0 0 10px;\n" +
                "        }\n" +
                "\n" +
                "        .btn-default {\n" +
                "            color: #333;\n" +
                "            background-color: #fff;\n" +
                "            border-color: #ccc;\n" +
                "        }\n" +
                "\n" +
                "        .zw {\n" +
                "            margin: 80px 0;\n" +
                "        }\n" +
                "\n" +
                "        hr {\n" +
                "            border-top: 1px solid #c8c8c8;\n" +
                "        }\n" +
                "\n" +
                "        footer {\n" +
                "            padding-bottom: 60px;\n" +
                "        }\n" +
                "\n" +
                "        .title {\n" +
                "            font: 700 36px Arial, \"microsoft yahei\";\n" +
                "            color: #666;\n" +
                "            padding-top: 25px;\n" +
                "            line-height: 28px;\n" +
                "            margin-bottom: 25px;\n" +
                "        }\n" +
                "\n" +
                "        .details {\n" +
                "            color: #e4393c;\n" +
                "        }\n" +
                "\n" +
                "        .type {\n" +
                "            font-size: 18px;\n" +
                "            font-weight: 400;\n" +
                "        }\n" +
                "\n" +
                "        .price {\n" +
                "            color: red;\n" +
                "            /*font-size: 26px;*/\n" +
                "        }\n" +
                "\n" +
                "        .price-num {\n" +
                "            font-size: 22px;\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width: 992px) {\n" +
                "            .col-md-7 {\n" +
                "                padding: 0 0 0 200px;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        .col-md-5 {\n" +
                "            margin-top: 25px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .col-md-7 .row {\n" +
                "            margin: 10px 0;\n" +
                "        }\n" +
                "\n" +
                "        /*#num {*/\n" +
                "        /*    text-align: center;*/\n" +
                "        /*    width: 50px;*/\n" +
                "        /*    height: 50px;*/\n" +
                "        /*    position: relative;*/\n" +
                "        /*    left: -1px;*/\n" +
                "        /*    top: -1px;*/\n" +
                "        /*}*/\n" +
                "\n" +
                "        .num-button {\n" +
                "            width: 108px;\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "\n" +
                "        .button {\n" +
                "            height: 50px;\n" +
                "            background-color: red;\n" +
                "            color: white;\n" +
                "\n" +
                "            text-decoration: none;\n" +
                "            width: 108px;\n" +
                "            padding: 18px;\n" +
                "            position: relative;\n" +
                "        }\n" +
                "\n" +
                "        .num-button a:hover {\n" +
                "            text-decoration: none;\n" +
                "            color: white;\n" +
                "        }\n" +
                "\n" +
                "        .num-control {\n" +
                "            border: 1px solid black;\n" +
                "            width: 80px;\n" +
                "            position: relative;\n" +
                "            display: inline-block;\n" +
                "            height: 50px;\n" +
                "        }\n" +
                "\n" +
                "        /*.num-control a {*/\n" +
                "        /*    text-decoration: none;*/\n" +
                "        /*    color: #9d9d9d;*/\n" +
                "        /*    border: 1px solid black;*/\n" +
                "        /*}*/\n" +
                "\n" +
                "        /*.add {*/\n" +
                "        /*    position: absolute;*/\n" +
                "        /*    padding: 1px 10px;*/\n" +
                "        /*    top: -1px;*/\n" +
                "        /*    left: 48px;*/\n" +
                "        /*}*/\n" +
                "\n" +
                "        /*.cut {*/\n" +
                "        /*    position: absolute;*/\n" +
                "        /*    bottom: -1px;*/\n" +
                "        /*    padding: 2px 12px;*/\n" +
                "        /*    left: 48px;*/\n" +
                "        /*}*/\n" +
                "\n" +
                "        .shadow {\n" +
                "            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px rgba(0, 0, 0, 0.23);\n" +
                "            margin-top: 56px;\n" +
                "        }\n" +
                "\n" +
                "        .page-header {\n" +
                "            background-color: #eeebeb;\n" +
                "            padding: 5px 0px;\n" +
                "            margin-bottom: 5px;\n" +
                "            font-weight: 300;\n" +
                "            font-family: \"acumin-pro\", \"Arial\", sans;\n" +
                "        }\n" +
                "\n" +
                "        .page-header h1 {\n" +
                "            font-size: 1.5em;\n" +
                "\n" +
                "        }\n" +
                "        /*.input-group{*/\n" +
                "        /*    display: flex;*/\n" +
                "        /*}*/\n" +
                "        .input-group .form-control{\n" +
                "            width: 50px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        .d1{\n" +
                "            margin-top: 77px;\n" +
                "            display: flex;\n" +
                "        }\n" +
                "        .btn-danger{\n" +
                "            margin: 0 auto;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<%\n" +
                "    String id = \""+id+"\";\n" +
                "    CommodityService commodityService = new CommodityServiceImpl();\n" +
                "    Commodity commodity = commodityService.searchForOneCommodity(id);\n" +
                "%>\n" +
                "<!--    导航条-->\n" +
                "<nav class=\"navbar navbar-default\">\n" +
                "    <div class=\"container header\">\n" +
                "        <div class=\"navbar-header row\">\n" +
                "            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\"\n" +
                "                    data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n" +
                "                <span class=\"sr-only\">Toggle navigation</span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "            </button>\n" +
                "            <a class=\"navbar-brand\" href=\"#\"><img class=\"logo\" src=\"../../static/img/logo-small.png\" alt=\"\"></a>\n" +
                "        </div>\n" +
                "        <!-- Collect the nav links, forms, and other content for toggling -->\n" +
                "        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n" +
                "            <ul class=\"nav navbar-nav\">\n" +
                "                <li><a href=\"../../index.jsp\">首页</a></li>\n" +
                "                <li><a href=\"10000008.jsp\">太平猴魁</a></li>\n" +
                "                <%--                <li><a href=\"#\">礼品</a></li>--%>\n" +
                "                <li class=\"dropdown\">\n" +
                "                    <a data-target class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n" +
                "                       aria-expanded=\"false\">分类</a>\n" +
                "                    <ul class=\"dropdown-menu\" style=\"text-align: center;\">\n" +
                "                        <li><a href=\"show/rt-show.jsp\">红茶</a></li>\n" +
                "                        <li><a href=\"show/gt-show.jsp\">绿茶</a></li>\n" +
                "                        <li><a href=\"show/ht-show.jsp\">黄茶</a></li>\n" +
                "                        <li><a href=\"show/wt-show.jsp\">白茶</a></li>\n" +
                "                        <li><a href=\"show/bt-show.jsp\">黑茶</a></li>\n" +
                "                        <li><a href=\"show/ot-show.jsp\">青茶(乌龙茶)</a></li>\n" +
                "                    </ul>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "            <form class=\"navbar-form navbar-left\">\n" +
                "                <div class=\"form-group\">\n" +
                "                    <input type=\"text\" class=\"form-control\" placeholder=\"搜索商品\">\n" +
                "                </div>\n" +
                "                <button type=\"submit\" class=\"btn btn-default\">搜索</button>\n" +
                "            </form>\n" +
                "            <ul class=\"nav navbar-nav navbar-right\">\n" +
                "                <li><a href=\"../cart.jsp\">购物车</a></li>\n" +
                "                <li id=\"login\"><a href=\"../login.html\">登录</a></li>\n" +
                "                <li id=\"register\"><a href=\"../register.html\">注册</a></li>\n" +
                "                <li class=\"dropdown d2\" id=\"user\">\n" +
                "                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n" +
                "                       aria-expanded=\"false\">我的账户</a>\n" +
                "                    <ul class=\"dropdown-menu\">\n" +
                "                        <li><a href=\"../credit.jsp\">我的信息</a></li>\n" +
                "                        <li><a href=\"../order.jsp\">我的订单</a></li>\n" +
                "                        <!--                            <li><a href=\"#\">Something else here</a></li>-->\n" +
                "                        <!--                            <li role=\"separator\" class=\"divider\"></li>-->\n" +
                "                        <!--                            <li><a href=\"#\">Separated link</a></li>-->\n" +
                "                    </ul>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div><!-- /.navbar-collapse -->\n" +
                "    </div><!-- /.container-fluid -->\n" +
                "</nav>\n" +
                "\n" +
                "<!--主体部分-->\n" +
                "<div class=\"page-content\">\n" +
                "    <div class=\"page-header\">\n" +
                "        <div class=\"container\">\n" +
                "            <h1>产品</h1>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"row shadow\">\n" +
                "            <div class=\"col-md-5\" style=\"\">\n" +
                "                <img src=\"../../static/img/tee/<%=commodity.getId()%>.jpg\" alt=\"\">\n" +
                "            </div>\n" +
                "            <div class=\"col-md-7\">\n" +
                "                <div class=\"row\">\n" +
                "                    <h2 class=\"title\"><%=commodity.getName()%>\n" +
                "                    </h2>\n" +
                "                </div>\n" +
                "                <div style=\"visibility: hidden; width: 0;height: 0\">\n" +
                "                    <!--隐藏域，存放商品编号-->\n" +
                "                    <input type=\"text\" id=\"cid\" value=\""+id+"\">\n" +
                "                </div>\n" +
                "                <div class=\"row\">\n" +
                "                    <h5 class=\"details\"><%=commodity.getDetails()%>\n" +
                "                    </h5>\n" +
                "                </div>\n" +
                "                <div class=\"row\">\n" +
                "                    品类：<span class=\"type\"><%=commodity.getType()%></span>\n" +
                "                </div>\n" +
                "                <div class=\"row\">\n" +
                "                    <span>价格：</span>\n" +
                "                    <span class=\" price\">\n" +
                "                    <span>￥</span>&nbsp;<span class=\"price-num\"><%=commodity.getPrice()%></span>\n" +
                "                </span>\n" +
                "                </div>\n" +
                "                <div class=\"row\">\n" +
                "                    <span>库存：<%=commodity.getNum()%></span>\n" +
                "                    <span>销量：<%=commodity.getSalenum()%></span>\n" +
                "                </div>\n" +
                "                <div class=\"row d1\" style=\"margin-top: 39px\">\n" +
                "                    <div class=\"input-group\">\n" +
                "                        <span class=\"input-group-btn\">\n" +
                "                            <button id=\"cut\" class=\"btn btn-default\" type=\"button\">-</button>\n" +
                "                        </span>\n" +
                "                        <input type=\"text\" id=\"num\" class=\"form-control\" value=\"1\" oninput=\"if (value<1) value=1\">\n" +
                "                        <span class=\"input-group-btn\">\n" +
                "                            <button id=\"add\" class=\"btn btn-default\" type=\"button\">+</button>\n" +
                "                        </span>\n" +
                "                    </div>\n" +
                "                    <button id=\"addCart\" type=\"button\" class=\"btn btn-danger\">加入购物车</button>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "    <div class=\"container\" style=\"position: absolute;bottom: 0;margin: 0 0 0 375px\">\n" +
                "        <hr class=\"zw\">\n" +
                "        <footer>\n" +
                "            <p class=\"pull-right\">\n" +
                "                <a href=\"#\">返回顶部</a>\n" +
                "            </p>\n" +
                "            <p class=\"pull-left\">\n" +
                "                © 2021 Company, Inc.\n" +
                "            </p>\n" +
                "        </footer>\n" +
                "    </div>\n" +
                "</div>\n" +
                "<form id=\"form\" method=\"post\" action=\"../../AddCartServlet\" style=\"width: 0;height: 0;visibility: hidden\" >\n" +
                "    <input type=\"text\" id=\"id\" name=\"cid\">\n" +
                "    <input type=\"text\" id=\"cnum\" name=\"cnum\">\n" +
                "</form>\n" +
                "<script>\n" +
                "    //账户和登录接口切换显示\n" +
                "    window.onload = function () {\n" +
                "        var l1 = document.getElementById(\"login\");\n" +
                "        var l2 = document.getElementById(\"register\");\n" +
                "        var l3 = document.getElementById(\"user\")\n" +
                "        if ('${user.username}' == '') {\n" +
                "            l3.style.visibility = \"hidden\";\n" +
                "            l3.style.width = 0;\n" +
                "            l3.style.height = 0;\n" +
                "        } else {\n" +
                "            l1.style.visibility = \"hidden\";\n" +
                "            l1.style.width = 0;\n" +
                "            l1.style.height = 0;\n" +
                "            l2.style.visibility = \"hidden\";\n" +
                "            l2.style.width = 0;\n" +
                "            l2.style.height = 0;\n" +
                "        }\n" +
                "    }\n" +
                "    //点击加号数值+1\n" +
                "    $('#add').click(function () {\n" +
                "        document.getElementById(\"num\").value++;\n" +
                "    })\n" +
                "    //点击减号数值-1\n" +
                "    $('#cut').click(function () {\n" +
                "        if (document.getElementById(\"num\").value > 1) {\n" +
                "            document.getElementById(\"num\").value--;\n" +
                "        }\n" +
                "    })\n" +
                "    //点击添加购物车，把商品存入购物车\n" +
                "    $('#addCart').click(function () {\n" +
                "        //获取商品id\n" +
                "        var cid = document.getElementById(\"cid\").value;\n" +
                "        //获取商品数量\n" +
                "        var cnum = document.getElementById('num').value;\n" +
                "        document.getElementById(\"id\").value=cid;\n" +
                "        document.getElementById(\"cnum\").value=cnum;\n" +
                "        document.getElementById(\"form\").submit();\n" +
                "    });\n" +
                "    //返回调用\n" +
                "    $(function (){\n" +
                "        var returndata = '${add}';\n" +
                "        if (returndata===\"success\"){\n" +
                "            window.alert(\"添加购物车成功\");\n" +
                "            <%\n" +
                "                session.removeAttribute(\"add\");\n" +
                "            %>\n" +
                "        }else if (returndata===\"fail\"){\n" +
                "            <%\n" +
                "                session.removeAttribute(\"add\");\n" +
                "            %>\n" +
                "            window.alert(\"添加购物车失败\");\n" +
                "        };\n" +
                "    })\n" +
                "\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        try {
//            File file = new File("../../../static/img/tee/"+id+".jsp");
            PrintStream printStream = new PrintStream(new FileOutputStream("D:\\Code\\Workspace\\JavaWeb\\TeaShop\\src\\main\\webapp\\pages\\commodities\\"+id+".jsp"));
            printStream.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        NewCommodityJsp newCommodityJsp = new NewCommodityJsp();
        newCommodityJsp.newJsp("111111");
    }

}
