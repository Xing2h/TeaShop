package com.tee.servlet;

import com.tee.pojo.Commodity;
import com.tee.service.CommodityService;
import com.tee.service.impl.CommodityServiceImpl;
import com.tee.utils.NewCommodityJsp;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import java.io.*;
import java.util.List;

public class AddCommodityServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        数据库操作
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String num = req.getParameter("num");
        String origin = req.getParameter("origin");
        String productiondate = req.getParameter("productiondate");
        String details = req.getParameter("details");
        //把信息存入数据库
        CommodityService commodityService = new CommodityServiceImpl();
        commodityService.createCommodity(new Commodity(null, type, name, Float.valueOf(price), Integer.parseInt(num), 0, origin, productiondate, details));
//        生成网页
        //获取到刚插入的商品编号
        String id = commodityService.maxid();
        NewCommodityJsp newCommodityJsp = new NewCommodityJsp();
        newCommodityJsp.newJsp(id);
//       网页跳转
        resp.sendRedirect("pages/control/commodity-list.jsp");
    }
}
