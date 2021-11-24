package com.tee.servlet;

import com.tee.pojo.AdminUser;
import com.tee.service.UserService;
import com.tee.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Xing
 * date 2021-11-20-13-14
 **/
public class AdminRegistServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String tel = req.getParameter("tel");
        AdminUser createAdminUser = new AdminUser(null, username, password, email, tel);
        System.out.println(createAdminUser.toString());
        if (userService.existUser(username)==false){
            //该用户名不存在，可以注册
            userService.registAdminUser(createAdminUser);
            resp.sendRedirect("pages/admin-login.html");
        }else {
            //用户名存在不可以再次注册
            resp.sendRedirect("pages/admin-register.html");
        }
    }
}
