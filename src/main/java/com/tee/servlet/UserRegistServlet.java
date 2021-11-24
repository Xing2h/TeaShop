package com.tee.servlet;

import com.tee.pojo.User;
import com.tee.service.UserService;
import com.tee.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserRegistServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String tel = req.getParameter("tel");
        User createUser = new User(null, username, password, email, tel);
        System.out.println(createUser.toString());
        if (userService.existUser(username) == false) {
            userService.registUser(createUser);
            resp.sendRedirect("pages/login.html");
        } else {
            resp.sendRedirect("pages/register.html");
//            req.getRequestDispatcher("pages/register.html").forward(req, resp);
        }

    }
}
