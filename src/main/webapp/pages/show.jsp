<%@ page import="com.tee.service.UserService" %>
<%@ page import="com.tee.service.CommodityService" %>
<%@ page import="com.tee.pojo.Commodity" %>
<%@ page import="com.tee.service.impl.CommodityServiceImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/21
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示所有商品</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>type</th>
        <th>name</th>
        <th>price</th>
        <th>num</th>
        <th>salenum</th>
        <th>origin</th>
        <th>productiondate</th>
        <th>details</th>
    </tr>
    <%
        CommodityService commodityService = new CommodityServiceImpl();
        List<Commodity> commodities = commodityService.showTypeCommodities("红茶");
        for (int i = 0; i < commodities.size()-1; i++) {
            out.println("<tr>" +
                    "<td>" + commodities.get(i).getId() + "</td>" +
                    "<td>" + commodities.get(i).getType() + "</td>" +
                    "<td>" + commodities.get(i).getName() + "</td>" +
                    "<td>" + commodities.get(i).getPrice() + "</td>" +
                    "<td>" + commodities.get(i).getNum() + "</td>" +
                    "<td>" + commodities.get(i).getSalenum() + "</td>" +
                    "<td>" + commodities.get(i).getOrigin() + "</td>" +
                    "<td>" + commodities.get(i).getProductiondate() + "</td>" +
                    "<td>" + commodities.get(i).getDetails() + "</td>"
                    + "</tr>");
        }
    %>
</table>
</body>
</html>
