package com.tee.servlet;

import com.tee.service.CommodityService;
import com.tee.service.impl.CommodityServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DelCommodityServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String id = req.getParameter("id");
        CommodityService commodityService = new CommodityServiceImpl();
        commodityService.deleteOneCommodity(id);
        resp.sendRedirect("pages/control/commodity-list.jsp");
    }
}
