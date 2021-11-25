package com.tee.servlet;

import com.tee.pojo.User;
import com.tee.service.UserService;
import com.tee.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ModifyPasswordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        String password = req.getParameter("new");
        if (user!=null){
            UserService userService = new UserServiceImpl();
            userService.modifyUserPassword(user.getId(),password);
            resp.sendRedirect("pages/pwdmod-success.html");
        }else {
            resp.sendRedirect("pages/login.html");
        }

    }
}
