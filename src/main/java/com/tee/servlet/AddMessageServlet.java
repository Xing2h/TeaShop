package com.tee.servlet;

import com.tee.pojo.Message;
import com.tee.pojo.User;
import com.tee.service.MessageService;
import com.tee.service.impl.MessageServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddMessageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderid = req.getParameter("oid");
        String message = req.getParameter("message");
        User loginUser = (User) req.getSession().getAttribute("user");
        if (loginUser != null) {
            MessageService messageService = new MessageServiceImpl();
            Message newMessage = new Message(null, orderid, loginUser.getId(), message);
            messageService.createMessage(newMessage);
            resp.sendRedirect("pages/message.jsp?oid=" + orderid);
        } else {
            resp.sendRedirect("pages/login.html");
        }
    }
}
