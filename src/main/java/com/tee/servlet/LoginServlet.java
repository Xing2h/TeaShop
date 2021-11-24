package com.tee.servlet;

import com.tee.pojo.User;
import com.tee.service.UserService;
import com.tee.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User loginUser = userService.loginUser(new User(null, username, password, null, null));
        if (loginUser == null) {
            resp.sendRedirect("pages/login.html");
        } else {
            System.out.println(loginUser.toString());
            req.getSession().setAttribute("user", loginUser);
            resp.sendRedirect("index.jsp");
//            req.getRequestDispatcher("pages/register.html").forward(req, resp);
        }
    }
}
