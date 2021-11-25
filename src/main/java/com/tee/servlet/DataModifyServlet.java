package com.tee.servlet;

import com.tee.pojo.User;
import com.tee.service.UserService;
import com.tee.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DataModifyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String tel = req.getParameter("tel");
        userService.modifyUserData(new User(id, username, null, email, tel));
        resp.sendRedirect("pages/modify-success.html");
    }
}
