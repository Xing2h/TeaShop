package com.tee.servlet;

import com.tee.pojo.AdminUser;
import com.tee.pojo.Message;
import com.tee.pojo.User;
import com.tee.service.MessageService;
import com.tee.service.impl.MessageServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddAdminMessageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderid = req.getParameter("oid");
        String message = req.getParameter("message");
        AdminUser loginAdminUser = (AdminUser) req.getSession().getAttribute("adminUser");
        if (loginAdminUser != null) {
            MessageService messageService = new MessageServiceImpl();
            Message newMessage = new Message(null, orderid, loginAdminUser.getId(), message);
            messageService.createMessage(newMessage);
            resp.sendRedirect("pages/control/admin-message.jsp?oid=" + orderid);
        } else {
            resp.sendRedirect("pages/admin-login.html");
        }
    }
}
