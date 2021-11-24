package com.tee.dao.impl;

import com.tee.dao.BaseDao;
import com.tee.dao.OrderDao;
import com.tee.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public List<Order> queryOrderByOrderIdAndUserId(String userId, String orderId) {
        String sql = "select * from t_order where uid=? and oid=?";
        return queryForList(Order.class, sql, userId, orderId);
    }

    @Override
    public List<Order> queryOrderByOrderId(String orderId) {
        String sql = "select * from t_order where oid=?";
        return queryForList(Order.class, sql, orderId);
    }

    @Override
    public int deleteOrderByOrderIdAndUserId(Order order) {
        String sql = "delete from t_order where uid=?,oid=?";
        return update(sql, order.getUserId(), order.getOrderId());
    }

    @Override
    public int createOrder(Order order) {
        String sql = "insert into t_order(oid,otime,uid,aid,cid,cname,cnum,tprice,ostatus)values(?,?,?,?,?,?,?,?,?)";
        return update(sql, order.getOrderId(), order.getOrderTime(), order.getUserId(), order.getAddressId(), order.getCommodityId(), order.getCommodityName(), order.getNum(), order.getTotalPrice(), order.getOrderStatus());
    }
}
