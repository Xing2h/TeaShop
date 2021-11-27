package com.tee.servlet;

import com.tee.service.OrderService;
import com.tee.service.impl.OrderServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class OrderStatusModifyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderId = req.getParameter("oid");
        OrderService orderService = new OrderServiceImpl();
        orderService.modifyOrderStatus(orderId);
        resp.sendRedirect("pages/control/order-list.jsp");
    }
}
