package com.tee.test;

import com.tee.pojo.Cart;
import com.tee.service.CartService;
import com.tee.service.impl.CartServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-22-14-12
 **/
public class CartServiceImplTest {
    CartService cartService = new CartServiceImpl();
    @Test
    public void addCart() {

    }

    @Test
    public void deleteCart() {
    }

    @Test
    public void existCart() {
        System.out.println(cartService.existCart(new Cart("10002", "10000001",null, 1, 299.0F)));
    }

    @Test
    public void showCart() {
        for (int i = 0; i < cartService.showCart("10002").size(); i++) {
            System.out.println(cartService.showCart("10002").get(i).toString());
        }
    }
    @Test
    public void addNumOfCart(){
        List<Cart> list = cartService.showCart("10002");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        cartService.addNumOfCart(new Cart("10002", "10000001",null, 1, 299.0F));
        List<Cart> list1 = cartService.showCart("10002");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).toString());
        }
    }
}