package com.tee.servlet;

import com.tee.pojo.Cart;
import com.tee.pojo.Order;
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
        //获取购物车数据
        CartService cartService = new CartServiceImpl();
        List<Cart> cartList = cartService.showCart(user.getId());
        //接收收件人编号
        String aid = req.getParameter("aid");
        System.out.println(aid);
        //新建订单编号
        OrderService orderService = new OrderServiceImpl();
        String oid = orderService.createOrderId(user.getId());
        //创建订单时间
        String orderTime = orderService.createOrderTime();
        //获取用户id
        String uid = user.getId();
        for (int i = 0; i < cartList.size(); i++) {
            String satus = "false";
            Order newOrder = new Order(oid,orderTime,uid,aid,cartList.get(i).getCid(),cartList.get(i).getCname(),cartList.get(i).getCnum(),cartList.get(i).getCprice()*cartList.get(i).getCnum(),satus);
            System.out.println(newOrder.toString());
            orderService.createOrder(newOrder);
            cartService.deleteCart(cartList.get(i));
        }
        resp.sendRedirect("pages/order-success.html");
    }
}
