package com.baizhi.controller;

import com.baizhi.feign.FeignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    private FeignUtil feignUtil;

    @RequestMapping("/addCart")
    public String addCart(String id){
        String s = feignUtil.toCart(id);
        return s;
    }
}
