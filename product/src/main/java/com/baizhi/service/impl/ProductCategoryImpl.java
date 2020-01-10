package com.baizhi.service.impl;

import com.baizhi.dao.ProductCategoryDao;
import com.baizhi.entity.ProductCategory;
import com.baizhi.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductCategoryImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<ProductCategory> selectAll() {
        return productCategoryDao.selectAll();
    }

}
