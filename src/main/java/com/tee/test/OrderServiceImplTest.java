package com.tee.test;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.tee.dao.OrderDao;
import com.tee.dao.impl.OrderDaoImpl;
import com.tee.pojo.Address;
import com.tee.pojo.Order;
import com.tee.service.OrderService;
import com.tee.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderServiceImplTest {

    OrderDao orderDao = new OrderDaoImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    public void createOrder() {
        orderDao.createOrder(new Order("2021112510002100","2021-11-25 16:25:0","10002","1","10000001","明前龙井",1, 299.0F,"false"));
    }

    @Test
    public void deleteOrder() {
    }

    @Test
    public void searchOrder() {
    }

    @Test
    public void testSearchOrder() {
    }

    @Test
    public void createOrderId() {
        OrderService orderService = new OrderServiceImpl();
        String s = orderService.createOrderId("10002");
        System.out.println(s);
    }
    @Test
    public void searchAllOrder(){
        List<Order> list = orderService.searchAllOrder("10002");
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i).getOrderId());
        }
    }
    @Test
    public void modifyOrderStatus(){
        orderDao.modifyOrderStatus("20211125123400");
    }
}