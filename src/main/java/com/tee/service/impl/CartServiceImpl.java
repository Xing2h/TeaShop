package com.tee.service.impl;

import com.tee.dao.CartDao;
import com.tee.dao.impl.CartDaoImpl;
import com.tee.pojo.Cart;
import com.tee.service.CartService;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-22-13-58
 **/
public class CartServiceImpl implements CartService {
    CartDao cartDao = new CartDaoImpl();
    @Override
    public void addCart(Cart cart) {
        cartDao.createCart(cart);
    }

    @Override
    public void deleteCart(Cart cart) {
        cartDao.deleteCart(cart);
    }

    @Override
    public boolean existCart(Cart cart) {
        if (cartDao.queryCartItemByUserIdAndCommodityId(cart.getUid(), cart.getCid())==null){
            //返回值为null，没有查到该商品，返回false
            return false;
        }else {
            //返回值不为null，查到了这个商品,返回true
            return true;
        }
    }

    @Override
    public List<Cart> showCart(String uid) {
        return cartDao.queryListCartByUserId(uid);
    }

    @Override
    public void addNumOfCart(Cart cart) {
        cartDao.addNum(cart);
    }

    @Override
    public Cart searchOneCart(String uid, String cid) {
        return cartDao.queryCartItemByUserIdAndCommodityId(uid,cid);
    }
}
