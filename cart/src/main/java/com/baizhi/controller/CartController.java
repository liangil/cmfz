package com.baizhi.controller;

import com.baizhi.dto.CartItem;
import com.baizhi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/addCartItem")
    public String addCartItem(String id) {
        String s = cartService.addCart(id);
        return s;
    }

    @RequestMapping("/showCart")
    public Map<String, CartItem> showCart(){
        Map<String, CartItem> stringCartItemMap = cartService.showCart();
        return stringCartItemMap;
    }
}
