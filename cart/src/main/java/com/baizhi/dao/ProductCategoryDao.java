package com.baizhi.dao;

import com.baizhi.dto.CartItem;

public interface ProductCategoryDao {
    CartItem selectById(String id);

}
