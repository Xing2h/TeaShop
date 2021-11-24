package com.tee.servlet;

import com.tee.pojo.Cart;
import com.tee.pojo.User;
import com.tee.service.CartService;
import com.tee.service.impl.CartServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DelCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
        String cid = req.getParameter("commid");
        System.out.println(cid);
        CartService cartService = new CartServiceImpl();
        User user = (User) req.getSession().getAttribute("user");
        System.out.println(user.toString());
        Cart deleteCart = cartService.searchOneCart(user.getId(),cid);
        System.out.println(deleteCart.toString());
        cartService.deleteCart(deleteCart);
        resp.sendRedirect("pages/cart.jsp");
    }
}