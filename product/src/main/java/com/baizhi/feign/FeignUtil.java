package com.baizhi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "CART",url = "http://localhost:10001")
public interface FeignUtil {
    //调用的  namespace 和 方法名
    @RequestMapping(value = "cart/addCartItem",method = RequestMethod.GET)
    public String toCart(@RequestParam("id") String id);
}
