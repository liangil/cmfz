package com.baizhi.service;


import com.baizhi.dto.CartItem;

import java.util.Map;

public interface CartService {
    public String addCart(String id);
    public Map<String, CartItem> showCart();
}
