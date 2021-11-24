package com.tee.service;

import com.tee.pojo.Cart;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-22-13-17
 **/
public interface CartService {
    /**
     * 添加购物车
     * @param cart
     */
    public void addCart(Cart cart);

    /**
     * 移除购物车内容
     * @param cart
     */
    public void deleteCart(Cart cart);

    /**
     * 检查购物车是否存在该条目
     * @param cart
     * @return  返回false表示不存在该条目，可以添加入购物车；返回true表示该条目存在，可以修改该条目的cnum
     */
    public boolean existCart(Cart cart);

    /**
     * 展示购物车中所有的条目
     * @param uid
     * @return
     */
    public List<Cart> showCart(String uid);

    /**
     * 向购物车中已存在的条目添加数量
     * @param cart
     */
    public void addNumOfCart(Cart cart);

    /**
     * 通过用户编号和商品编号查询购物车信息
     * @param uid
     * @param cid
     * @return
     */
    public Cart searchOneCart(String uid,String cid);
}
