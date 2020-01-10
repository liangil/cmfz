package com.baizhi;

import com.baizhi.dto.CartItem;
import com.baizhi.util.SerializeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
        HashOperations hash = redisTemplate.opsForHash();
        Map<String,Object> cart = hash.entries("cart");
        for (Map.Entry<String, Object> stringObjectEntry : cart.entrySet()) {
            System.out.println(stringObjectEntry);
        }
    }

    @Test
    public void test(){


    }


}
