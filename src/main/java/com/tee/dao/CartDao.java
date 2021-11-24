package com.tee.dao;

import com.tee.pojo.Cart;

import javax.swing.*;
import java.util.List;

/**
 * @author Xing
 * date 2021-11-22-13-07
 **/
public interface CartDao {
    /**
     *  购物车需要的功能分析
     *  1、通过用户 id 查询返回所有该用户的购物车内容
     *  2、通过用户id和商品id查询商品是否在该用户的购物车中
     *  3、插入购物车
     */

    /**
     * 通过用户id查询购物车中内容
     * @param userid    用户id
     * @return
     */
    public List<Cart> queryListCartByUserId(String userid);

    /**
     * 通过用户id和商品id查询商品
     * @param userid    用户id
     * @param cid       商品id
     * @return
     */
    public Cart queryCartItemByUserIdAndCommodityId(String userid,String cid);

    /**
     * 创建新的购物车记录
     * @param cart
     * @return
     */
    public int createCart(Cart cart);

    /**
     * 删除购物车记录
     * @param cart
     * @return
     */
    public int deleteCart(Cart cart);

    /**
     * 修改购物车中商品数量
     * @param cart
     * @return
     */
    public int addNum(Cart cart);
    
}
