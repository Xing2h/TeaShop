package com.tee.service.impl;

import com.tee.dao.OrderDao;
import com.tee.dao.impl.OrderDaoImpl;
import com.tee.pojo.Order;
import com.tee.service.OrderService;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao = new OrderDaoImpl();
    @Override
    public void createOrder(Order order) {
        orderDao.createOrder(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderDao.deleteOrderByOrderIdAndUserId(order);
    }

    @Override
    public List<Order> searchOrder(String orderId) {
        return orderDao.queryOrderByOrderId(orderId);
    }

    @Override
    public List<Order> searchAllOrder(String userId) {
        return orderDao.queryOrderByUserId(userId);
    }

    @Override
    public List<Order> searchOrder(String userId, String orderId) {
        return orderDao.queryOrderByOrderIdAndUserId(userId,orderId);
    }

    @Override
    public String createOrderId(String userId) {
        Random r = new Random();
        Calendar calendar = Calendar.getInstance();
        String time = String.valueOf(calendar.get(Calendar.YEAR))+String.valueOf(calendar.get(Calendar.MONTH)+1)+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String orderId = time+userId+String.valueOf(r.nextInt(999));
        return orderId;
    }

    @Override
    public String createOrderTime() {
        Calendar calendar = Calendar.getInstance();
        String time = String.valueOf(calendar.get(Calendar.YEAR))+"-"+String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)+" "+String.valueOf(calendar.get(Calendar.HOUR_OF_DAY))+":"+String.valueOf(calendar.get(Calendar.MINUTE))+":"+String.valueOf(calendar.get(Calendar.SECOND)));
        return time;
    }
}
