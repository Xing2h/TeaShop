package com.tee.service;

import com.tee.pojo.Order;

import java.util.List;

public interface OrderService {
    /**
     * 创建订单
     *
     * @param order
     */
    public void createOrder(Order order);

    /**
     * 删除订单
     *
     * @param order
     */
    public void deleteOrder(Order order);

    /**
     * 查询订单，因为每一个订单可能有不止一个商品，所以返回的是一个列表，存有该订单的所有订单项
     *
     * @param orderId
     * @return
     */
    public List<Order> searchOrder(String orderId);

    /**
     * 通过用户id和订单号，查询订单
     *
     * @param userId  用户订单
     * @param orderId 订单号
     * @return 返回订单信息
     */
    public List<Order> searchOrder(String userId, String orderId);

    /**
     * 生成订单号
     * @param userId
     * @return
     */
    public String createOrderId(String userId);
}
