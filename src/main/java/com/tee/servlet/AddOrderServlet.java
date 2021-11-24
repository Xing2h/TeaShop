package com.tee.servlet;

import com.tee.pojo.Cart;
import com.tee.pojo.User;
import com.tee.service.CartService;
import com.tee.service.OrderService;
import com.tee.service.impl.CartServiceImpl;
import com.tee.service.impl.OrderServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class AddOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户数据
        User user = (User) req.getSession().getAttribute("user");
        CartService cartService = new CartServiceImpl();
        //获取购物车数据
        List<Cart> cartList = cartService.showCart(user.getId());
        OrderService orderService = new OrderServiceImpl();

    }
}
