package com.tee.servlet;

import com.tee.pojo.Commodity;
import com.tee.service.CommodityService;
import com.tee.service.impl.CommodityServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CommodityModifyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String  name= req.getParameter("name");
        String  type= req.getParameter("type");
        float  price = Float.parseFloat(req.getParameter("price"));
        int  num= Integer.parseInt(req.getParameter("num"));
        String  origin= req.getParameter("origin");
        String  productiondate= req.getParameter("productiondate");
        String  details= req.getParameter("details");
        Commodity commodity = new Commodity(id,name,type,price,num,0,origin,productiondate,details);
        System.out.println(commodity.toString());
        CommodityService commodityService = new CommodityServiceImpl();
        commodityService.modifyCommodity(commodity);
        resp.sendRedirect("pages/control/commodity-list.jsp");
    }
}
