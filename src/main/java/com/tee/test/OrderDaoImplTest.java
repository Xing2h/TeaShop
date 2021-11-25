package com.tee.test;

import com.tee.dao.OrderDao;
import com.tee.dao.impl.OrderDaoImpl;
import com.tee.pojo.Order;
import org.junit.jupiter.api.Test;

public class OrderDaoImplTest {

    @Test
    public void createOrder(){
        OrderDao orderDao = new OrderDaoImpl();
        Order order = new Order("2021112510002100","2021-11-25 16:25:0","10002","1","10000001","明前龙井",1, 299.0F,"false");
        System.out.println(orderDao.createOrder(order));
    }
}