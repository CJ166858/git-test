package com.pinyougou.cart.service;

import com.pinyougou.pojo.group.Cart;

import java.util.List;

public interface CartService {

    public List<Cart> addGoodsToCartList(List<Cart> list,Long itemId,Integer num);

    public List<Cart> findCartListFromRedis(String userName);
    public void saveCartListToRedis(String userName,List<Cart> cartList);

     public List<Cart> mergeCartList(List<Cart> cartList1,List<Cart> cartList2);
}
