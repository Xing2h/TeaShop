package com.tee.test;

import com.tee.service.OrderService;
import com.tee.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;

public class OrderServiceImplTest {

    @Test
    public void createOrder() {
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
        String s = orderService.createOrderId("123");
        System.out.println(s);
    }
}