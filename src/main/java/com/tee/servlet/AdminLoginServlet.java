package com.tee.servlet;

import com.tee.pojo.AdminUser;
import com.tee.service.impl.UserServiceImpl;
import com.tee.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

/**
 * @author 27226
 */
public class AdminLoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        AdminUser loginUser = userService.loginAdminUser(new AdminUser(null, username, password, null, null));
        if (loginUser == null) {
            //登陆失败
            resp.sendRedirect("pages/admin-log.jsp");
        } else {
            //登陆成功
            System.out.println(loginUser.toString());
            //把登录信息存到session
            req.getSession().setAttribute("adminUser", loginUser);
            resp.sendRedirect("pages/control/admin.jsp");
        }
    }
}
