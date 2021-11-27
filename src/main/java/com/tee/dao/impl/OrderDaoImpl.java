package com.tee.dao.impl;

import com.tee.dao.BaseDao;
import com.tee.dao.OrderDao;
import com.tee.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public List<Order> queryOrderByOrderIdAndUserId(String userId, String orderId) {
        String sql = "select * from t_order where userId=? and orderId=?";
        return queryForList(Order.class, sql, userId, orderId);
    }

    @Override
    public List<Order> queryOrderByOrderId(String orderId) {
        String sql = "select * from t_order where orderId=?";
        return queryForList(Order.class, sql, orderId);
    }

    @Override
    public List<Order> queryOrderByUserId(String userId) {
        String sql = "select * from t_order where userId=?";
        return queryForList(Order.class, sql, userId);
    }

    @Override
    public int deleteOrderByOrderIdAndUserId(Order order) {
        String sql = "delete from t_order where userId=?and orderId=?";
        return update(sql, order.getUserId(), order.getOrderId());
    }

    @Override
    public int createOrder(Order order) {
        String sql = "insert into t_order(orderId,orderTime,userId,addressId,commodityId,commodityName,num,totalPrice,orderStatus)values(?,?,?,?,?,?,?,?,?)";
        return update(sql, order.getOrderId(), order.getOrderTime(), order.getUserId(), order.getAddressId(), order.getCommodityId(), order.getCommodityName(), order.getNum(), order.getTotalPrice(), order.getOrderStatus());
    }

    @Override
    public List<Order> showAllOrder() {
        String sql = "select * from t_order";
        return queryForList(Order.class,sql);
    }

    @Override
    public List<String> searchOrderId() {
        String sql ="select distinct orderId from t_order";
        return queryForList(String.class,sql);
    }

    @Override
    public int modifyOrderStatus(String orderId) {
        String sql = "update t_order set orderStatus='true' where orderId=?";
        return update(sql,orderId);
    }
}
