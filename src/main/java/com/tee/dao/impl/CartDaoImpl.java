package com.tee.dao.impl;

import com.tee.dao.BaseDao;
import com.tee.dao.CartDao;
import com.tee.pojo.Cart;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-22-13-14
 **/
public class CartDaoImpl extends BaseDao implements CartDao {
    @Override
    public List<Cart> queryListCartByUserId(String userid) {
        String sql = "select * from t_cart where uid=?";
        return queryForList(Cart.class, sql, userid);
    }

    @Override
    public Cart queryCartItemByUserIdAndCommodityId(String userid, String cid) {
        String sql = "select * from t_cart where uid=? and cid=?";
        return queryForOne(Cart.class, sql, userid,cid);
    }

    @Override
    public int createCart(Cart cart) {
        String sql = "insert into t_cart(uid,cid,cname,cnum,cprice)values(?,?,?,?,?)";
        return update(sql, cart.getUid(),cart.getCid(),cart.getCname(),cart.getCnum(),cart.getCprice());
    }

    @Override
    public int deleteCart(Cart cart) {
        String sql = "delete from t_cart where uid=? and cid=?";
        return update(sql, cart.getUid(),cart.getCid());
    }

    @Override
    public int addNum(Cart cart) {
        String sql = "update t_cart set cnum=cnum+? where cid=? and uid=?";
        return update(sql,cart.getCnum(),cart.getCid(),cart.getUid());
    }
}
