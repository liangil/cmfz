package com.baizhi.controller;

import com.baizhi.entity.ProductCategory;
import com.baizhi.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/queryAll")
    public String queryAll(HttpServletRequest request){
        List<ProductCategory> productCategories = productCategoryService.selectAll();
        request.setAttribute("product",productCategories);
        return "html/product";
    }


}
