package com.tee.dao;

import com.tee.pojo.Order;

import java.util.List;

public interface OrderDao {
    /**
     * 通过用户id和订单id查询订单
     *
     * @param userId
     * @param orderId
     * @return
     */
    public List<Order> queryOrderByOrderIdAndUserId(String userId, String orderId);

    /**
     * 通过订单编号查询订单
     *
     * @param orderId
     * @return
     */
    public List<Order> queryOrderByOrderId(String orderId);

    /**
     * 通过用户id查询订单
     * @param userId
     * @return
     */
    public List<Order> queryOrderByUserId(String userId);
    /**
     * 删除订单
     *
     * @param order
     * @return
     */
    public int deleteOrderByOrderIdAndUserId(Order order);

    /**
     * 新建订单
     *
     * @param order
     * @return
     */
    public int createOrder(Order order);

    /**
     * 展示所有订单
     * @return
     */
    public List<Order> showAllOrder();

    /**
     * 获取所有订单号
     * @return
     */
    public List<String> searchOrderId();

    /**
     * 修改订单完成状态
     * @param orderId
     * @return
     */
    public int modifyOrderStatus(String orderId);
}
