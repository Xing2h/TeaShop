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
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String tel = req.getParameter("tel");
        String password = req.getParameter("password");
        UserService userService = new UserServiceImpl();
        userService.modifyUserData(new User(id,username,password,email,tel));
        resp.sendRedirect("pages/persondata.jsp");
    }
}
