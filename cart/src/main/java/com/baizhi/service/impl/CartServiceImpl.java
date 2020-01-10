package com.baizhi.service.impl;

import com.baizhi.dao.ProductCategoryDao;
import com.baizhi.dto.CartItem;
import com.baizhi.service.CartService;
import com.baizhi.util.SerializeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class CartServiceImpl implements CartService {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String addCart(String id) {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        //自定义设置序列化对象
        redisTemplate.setKeySerializer(stringRedisSerializer);
        //数据库中数据
        CartItem cartItem = productCategoryDao.selectById(id);
        HashOperations hash = redisTemplate.opsForHash();
        if (!hash.hasKey("cart", id)) {
            cartItem.setCount(1);
            cartItem.setTotalPrice(cartItem.getCount() * cartItem.getPrice());
            System.out.println(cartItem);
        } else {
            Object cartIt = hash.get("cart", id);
            cartItem = (CartItem) SerializeUtils.serializeToObject(cartIt.toString());
            cartItem.setCount(cartItem.getCount()+1);
            cartItem.setTotalPrice(cartItem.getCount() * cartItem.getPrice());
        }
        hash.put("cart", id, SerializeUtils.serialize(cartItem.toString()));
        return "添加成功";
    }

    @Override
    public Map<String, CartItem> showCart() {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        HashOperations hash = redisTemplate.opsForHash();
        Map<String,CartItem> cart = hash.entries("cart");
        return cart;
    }
}
