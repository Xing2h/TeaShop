package com.tee.servlet;

import com.tee.pojo.Address;
import com.tee.pojo.User;
import com.tee.service.AddressService;
import com.tee.service.impl.AddressServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddAddressServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        AddressService addressService = new AddressServiceImpl();
        String name = req.getParameter("name");
        String userid = user.getId();
        String tel = req.getParameter("tel");
        String address = req.getParameter("address");
        String post = req.getParameter("post");

        Address newAddress = new Address(null,userid,name,tel,address,post);
        System.out.println(newAddress.toString());
        addressService.createAddress(newAddress);
        resp.sendRedirect("pages/newAddress.jsp");
    }
}
