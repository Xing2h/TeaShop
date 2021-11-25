package com.tee.servlet;

import com.tee.pojo.AdminUser;
import com.tee.pojo.User;
import com.tee.service.UserService;
import com.tee.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ModifyAdminPasswordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminUser adminuser = (AdminUser) req.getSession().getAttribute("adminuser");
        String password = req.getParameter("new");
        if (adminuser!=null){
            UserService userService = new UserServiceImpl();
            userService.modifyAdminPassword(adminuser.getId(),password);
            resp.sendRedirect("pages/pwdmod-success.html");
        }else {
            resp.sendRedirect("pages/admin-login.html");
        }

    }
}
