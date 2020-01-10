package com.baizhi.dao;

import com.baizhi.entity.ProductCategory;
import com.baizhi.entity.ProductInfo;

import java.util.List;

public interface ProductCategoryDao {
    List<ProductCategory> selectAll();
}
