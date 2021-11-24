package com.tee.servlet;


import com.tee.dao.CartDao;
import com.tee.dao.impl.CartDaoImpl;
import com.tee.pojo.Cart;
import com.tee.pojo.Commodity;
import com.tee.pojo.User;
import com.tee.service.CartService;
import com.tee.service.CommodityService;
import com.tee.service.impl.CartServiceImpl;
import com.tee.service.impl.CommodityServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //清除session保存的添加状态
        req.getSession().removeAttribute("add");
        CartService cartService = new CartServiceImpl();
        CommodityService commodityService = new CommodityServiceImpl();
        req.setCharacterEncoding("UTF-8");
        //接收数据
        String cid = req.getParameter("cid");
        String cnum = req.getParameter("cnum");
        System.out.println("cid:"+cid);
        //查询要加入购物车党的商品
        Commodity commodity = commodityService.searchForOneCommodity(cid);
        System.out.println(commodity.toString());
        //查询用户
        User user = (User) req.getSession().getAttribute("user");
        System.out.println(user.toString());
        Cart addCart = new Cart(user.getId(),commodity.getId(),commodity.getName(),Integer.parseInt(cnum),commodity.getPrice());
        System.out.println(addCart.toString());
        if (cartService.existCart(addCart)){
            //存在该商品
            //获取旧数据
            Cart oldCart = cartService.searchOneCart(user.getId(),addCart.getCid());
            cartService.addNumOfCart(addCart);
            Cart newCart = cartService.searchOneCart(user.getId(),addCart.getCid());
            if (oldCart.equals(newCart)){
                //相同表示添加失败
                req.setAttribute("add","fail");
                resp.sendRedirect("pages/commodities/"+cid+".jsp");
            }else {
                req.getSession().setAttribute("add","success");
                resp.sendRedirect("pages/commodities/"+cid+".jsp");
            }
        }else {
            //数据库中没有该商品
            cartService.addCart(addCart);
            if (cartService.existCart(addCart)){
                req.getSession().setAttribute("add","success");
                resp.sendRedirect("pages/commodities/"+cid+".jsp");
            }else {
                req.setAttribute("add","fail");
                resp.sendRedirect("pages/commodities/"+cid+".jsp");
            }
        }
    }
}
